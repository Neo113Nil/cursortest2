package com.fillr.profile;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bugsnag.android.Client;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;
import net.oneformapp.DLog;
import net.oneformapp.ProfileStore_;
import net.oneformapp.helper.CalendarConverter;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.ElementType;
import net.oneformapp.schema.Schema_;
import net.oneformapp.view.ButtonPlus;
import net.oneformapp.view.EditTextPlus;

/* loaded from: classes4.dex */
public class InputFragmentDialog extends DialogFragment {
    public ProfileEditListAdapter adapter;
    public Button btnDone;
    public Element element;
    public String elementKey;
    public ElementType elementType;
    public String elementValue;
    public Dialog mDialog;
    public boolean mRequestKeyboard;
    public View mView;
    public final AnonymousClass1 onDoneButtonClicked = new AnonymousClass1(this, 0);
    public Toolbar.AnonymousClass1 profileManager;
    public ProfileStore_ profileStore;
    public Schema_ schema;

    /* renamed from: com.fillr.profile.InputFragmentDialog$1, reason: invalid class name */
    public final class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ InputFragmentDialog this$0;

        public /* synthetic */ AnonymousClass1(InputFragmentDialog inputFragmentDialog, int i) {
            this.$r8$classId = i;
            this.this$0 = inputFragmentDialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.$r8$classId;
            InputFragmentDialog inputFragmentDialog = this.this$0;
            switch (i) {
                case 0:
                    inputFragmentDialog.doneButton();
                    break;
                default:
                    inputFragmentDialog.deleteAllData(inputFragmentDialog.element);
                    inputFragmentDialog.profileStore.store();
                    Fragment targetFragment = inputFragmentDialog.getTargetFragment();
                    if (targetFragment != null) {
                        targetFragment.onActivityResult(inputFragmentDialog.getTargetRequestCode(), -1, new Intent());
                    }
                    inputFragmentDialog.dismiss();
                    break;
            }
        }
    }

    public final class ProfileEditListAdapter extends BaseAdapter {
        public int mCheckedIndex;
        public final String[] mData;
        public final LayoutInflater mInflator;

        public ProfileEditListAdapter(FragmentActivity fragmentActivity, String[] strArr, String str) {
            this.mCheckedIndex = -1;
            this.mData = strArr;
            this.mInflator = (LayoutInflater) fragmentActivity.getSystemService("layout_inflater");
            if (str != null) {
                for (int i = 0; i < strArr.length; i++) {
                    StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("value ", str, " data[i] ");
                    m3m.append(strArr[i]);
                    DLog.d(this, m3m.toString());
                    if (str.equals(strArr[i])) {
                        this.mCheckedIndex = i;
                    }
                }
            }
            StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("value ", str, " mCheckedIndex ");
            m3m2.append(this.mCheckedIndex);
            DLog.d(this, m3m2.toString());
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.mData.length;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return this.mData[i];
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.mInflator.inflate(R.layout.list_item_profile_edit, viewGroup, false);
            }
            TextView textView = (TextView) view.getTag();
            if (textView == null) {
                textView = (TextView) view.findViewById(R.id.list_item_name);
            }
            View findViewById = view.findViewById(R.id.isSelected);
            if (i == this.mCheckedIndex) {
                DLog.d(this, "checked! " + i);
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
            String[] strArr = this.mData;
            textView.setText(strArr[i]);
            InputFragmentDialog inputFragmentDialog = InputFragmentDialog.this;
            if (inputFragmentDialog.elementKey.contains(inputFragmentDialog.getResources().getString(R.string.schema_creditcard))) {
                ImageView imageView = (ImageView) view.findViewById(R.id.item_image);
                String str = strArr[i];
                if (imageView != null) {
                    if (str == null) {
                        imageView.setImageDrawable(null);
                    } else if (str.equalsIgnoreCase("American Express")) {
                        imageView.setImageResource(R.drawable.creditcard_american_express);
                    } else if (str.equalsIgnoreCase("Diners Club")) {
                        imageView.setImageResource(R.drawable.creditcard_diners_club);
                    } else if (str.equalsIgnoreCase("Discover") || str.equalsIgnoreCase("Découvrir")) {
                        imageView.setImageResource(R.drawable.creditcard_discover);
                    } else if (str.equalsIgnoreCase("JCB")) {
                        imageView.setImageResource(R.drawable.creditcard_jcb);
                    } else if (str.equalsIgnoreCase("Maestro")) {
                        imageView.setImageResource(R.drawable.creditcard_maestro);
                    } else if (str.equalsIgnoreCase("MasterCard")) {
                        imageView.setImageResource(R.drawable.creditcard_mastercard);
                    } else if (str.equalsIgnoreCase("Visa")) {
                        imageView.setImageResource(R.drawable.creditcard_visa);
                    } else if (str.equalsIgnoreCase("Dankort")) {
                        imageView.setImageResource(R.drawable.creditcard_dankort);
                    } else if (str.equalsIgnoreCase("Visa Electron")) {
                        imageView.setImageResource(R.drawable.creditcard_visaelectron);
                    } else if (str.equalsIgnoreCase("Laser")) {
                        imageView.setImageResource(R.drawable.creditcard_laser);
                    }
                }
                imageView.setVisibility(0);
            }
            return view;
        }
    }

    public static void findAndHideField(DatePicker datePicker) {
        try {
            for (Field field : datePicker.getClass().getDeclaredFields()) {
                if ("mDayPicker".equals(field.getName())) {
                    field.setAccessible(true);
                    ((View) field.get(datePicker)).setVisibility(8);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final EditTextPlus createEditText() {
        EditTextPlus editTextPlus = new EditTextPlus(getActivity());
        this.mRequestKeyboard = true;
        editTextPlus.setGravity(3);
        editTextPlus.setBackgroundResource(android.R.color.transparent);
        return editTextPlus;
    }

    public final void deleteAllData(Element element) {
        boolean hasChildElements = element.hasChildElements();
        ProfileStore_ profileStore_ = this.profileStore;
        if (!hasChildElements) {
            profileStore_.deleteData(element.actingElement().pathKey);
            element.setElementValue(null);
        } else {
            profileStore_.deleteData(element.actingElement().pathKey);
            Iterator it = element.actingElement().children.iterator();
            while (it.hasNext()) {
                deleteAllData((Element) it.next());
            }
        }
    }

    public final void doneButton() {
        Intent intent = new Intent();
        Element element = this.element;
        if (element != null && (element.actingElement().isArrayType || this.element.actingElement().isFieldArray)) {
            Toolbar.AnonymousClass1 anonymousClass1 = this.profileManager;
            Schema_ schema_ = this.schema;
            String str = this.element.actingElement().pathKey;
            anonymousClass1.getClass();
            Element isFieldArrayElement = Toolbar.AnonymousClass1.isFieldArrayElement(schema_, str);
            if (isFieldArrayElement != null) {
                Toolbar.AnonymousClass1 anonymousClass12 = this.profileManager;
                Element firstChildElement = isFieldArrayElement.getFirstChildElement();
                anonymousClass12.getClass();
                String data = ((ProfileStore_) anonymousClass12.this$0).getData(Toolbar.AnonymousClass1.getArrayElementCountPath(firstChildElement));
                if ((data != null ? Integer.parseInt(data) : 0) <= 0) {
                    this.profileManager.addNamespaceToProfile(isFieldArrayElement, true);
                }
            }
        }
        View view = this.mView;
        if (view != null) {
            if (view instanceof EditTextPlus) {
                this.elementValue = ((EditTextPlus) view).getText().toString();
            } else if (view instanceof ListView) {
                ProfileEditListAdapter profileEditListAdapter = this.adapter;
                int i = profileEditListAdapter.mCheckedIndex;
                this.elementValue = i == -1 ? "" : profileEditListAdapter.mData[i];
            } else if (view instanceof TimePicker) {
                TimePicker timePicker = (TimePicker) view;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("kk:mm", Locale.ENGLISH);
                Calendar calendar = Calendar.getInstance();
                int intValue = timePicker.getCurrentHour().intValue();
                int intValue2 = timePicker.getCurrentMinute().intValue();
                calendar.set(10, intValue);
                calendar.set(12, intValue2);
                calendar.set(13, 0);
                this.elementValue = simpleDateFormat.format(calendar.getTime());
            } else if (view instanceof DatePicker) {
                if (this.elementType.f1544type == 4) {
                    DatePicker datePicker = (DatePicker) view;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(1, datePicker.getYear());
                    calendar2.set(2, datePicker.getMonth());
                    calendar2.set(5, 1);
                    String[] strArr = CalendarConverter.MONTH_FORMAT_ARRAY;
                    this.elementValue = new SimpleDateFormat("MM-yyyy", Locale.ENGLISH).format(calendar2.getTime());
                } else {
                    DatePicker datePicker2 = (DatePicker) view;
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.set(1, datePicker2.getYear());
                    calendar3.set(2, datePicker2.getMonth());
                    calendar3.set(5, datePicker2.getDayOfMonth());
                    String[] strArr2 = CalendarConverter.MONTH_FORMAT_ARRAY;
                    this.elementValue = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(calendar3.getTime());
                }
            }
            if (this.elementValue != null) {
                String data2 = this.profileStore.getData(this.elementKey);
                this.profileStore.setData(this.elementKey, this.elementValue);
                String str2 = this.elementKey;
                String str3 = this.elementValue;
                boolean z = str3 != null && str3.length() > 0;
                if (str2 != null) {
                    if ((data2 == null || data2.trim().length() == 0) && z) {
                        profileAnalyticsEvent("PROFILE SAVE NEW DATA");
                    } else if (data2 != null && !data2.equals(str3)) {
                        profileAnalyticsEvent("PROFILE EDIT");
                    }
                }
                if (this.element.isNonRecursiveType()) {
                    ProfileStore_ profileStore_ = this.profileStore;
                    Schema_ schema_2 = this.schema;
                    Element element2 = this.element;
                    String str4 = this.elementValue;
                    profileStore_.getClass();
                    TreeMap treeMap = new TreeMap();
                    int extractIndex = Toolbar.AnonymousClass1.extractIndex(element2.actingElement().pathKey);
                    if (!element2.actingElement().elementTypeName.equals("Image")) {
                        if (element2.actingElement().elementTypeName.equals("DateType")) {
                            String[] split = str4.split("-");
                            String[] strArr3 = {"Day", "Month", "Year"};
                            if (schema_2.getElement(element2.getFormattedPathKey()) != null) {
                                for (Element element3 : element2.actingElement().children) {
                                    for (int i2 = 0; i2 < 3; i2++) {
                                        if (element3.actingElement().elementName.contains(strArr3[i2])) {
                                            if (extractIndex >= 0) {
                                                Element findLeafElement = Element.findLeafElement(element3.getFormattedPathKey(), element2);
                                                if (findLeafElement != null) {
                                                    treeMap.put(findLeafElement.actingElement().pathKey, split[i2]);
                                                } else {
                                                    treeMap.put(element3.actingElement().pathKey, split[i2]);
                                                }
                                            } else {
                                                treeMap.put(element3.actingElement().pathKey, split[i2]);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (element2.actingElement().elementTypeName.equals("MonthYearType")) {
                            String[] split2 = str4.split("-");
                            String[] strArr4 = {"Month", "Year"};
                            if (schema_2.getElement(element2.getFormattedPathKey()) != null) {
                                for (Element element4 : element2.actingElement().children) {
                                    for (int i3 = 0; i3 < 2; i3++) {
                                        if (element4.actingElement().elementName.contains(strArr4[i3])) {
                                            if (extractIndex >= 0) {
                                                Element findLeafElement2 = Element.findLeafElement(element4.getFormattedPathKey(), element2);
                                                if (findLeafElement2 != null) {
                                                    treeMap.put(findLeafElement2.actingElement().pathKey, split2[i3]);
                                                } else {
                                                    treeMap.put(element4.actingElement().pathKey, split2[i3]);
                                                }
                                            } else {
                                                treeMap.put(element4.actingElement().pathKey, split2[i3]);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.profileStore.setData(treeMap);
                }
                this.profileStore.store();
                ArrayList arrayList = new ArrayList();
                this.element.setElementValue(this.elementValue);
                arrayList.add(this.element);
            }
            intent.putExtra("element.key", this.elementKey);
            intent.putExtra("element.value", this.elementValue);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            dismiss();
            targetFragment.onActivityResult(getTargetRequestCode(), -1, intent);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.profileStore = ProfileStore_.getInstance_(getContext());
        this.schema = Schema_.getInstance_(getContext());
        this.profileManager = new Toolbar.AnonymousClass1(this.profileStore);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.element = (Element) arguments.getSerializable("element");
            this.elementType = (ElementType) arguments.getSerializable("elementtype");
            this.elementValue = arguments.getString("elementvalue");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.f_layout_inputfield, (ViewGroup) null);
        Dialog dialog = new Dialog(getActivity(), R.style.transparent_dialog);
        this.mDialog = dialog;
        dialog.setContentView(inflate);
        this.mDialog.setCancelable(false);
        this.mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.mDialog.getWindow().getAttributes().windowAnimations = R.style.transparent_dialog;
        return this.mDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Calendar calendar;
        Calendar calendar2;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f_layout_inputfield, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.container);
        TextView textView = (TextView) inflate.findViewById(R.id.txtTitle);
        Button button = (Button) inflate.findViewById(R.id.btnDone);
        this.btnDone = button;
        button.setOnClickListener(this.onDoneButtonClicked);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mView = null;
        textView.setText(this.element.getDisplayName());
        String str = this.element.actingElement().pathKey;
        this.elementKey = str;
        if (this.elementValue == null) {
            this.elementValue = this.profileStore.getData(str);
        }
        ElementType elementType = this.elementType;
        int i = elementType.f1544type;
        int i2 = 1;
        if (i == 2) {
            ArrayList arrayList = elementType.listValues;
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            ListView listView = new ListView(getContext());
            listView.setVisibility(0);
            ProfileEditListAdapter profileEditListAdapter = new ProfileEditListAdapter(getActivity(), strArr, this.elementValue);
            this.adapter = profileEditListAdapter;
            listView.setAdapter((ListAdapter) profileEditListAdapter);
            listView.setDivider(null);
            listView.setDividerHeight(0);
            listView.setOnItemClickListener(new SearchView.AnonymousClass8(this, 3));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            this.mView = listView;
            layoutParams = layoutParams2;
        } else {
            if (i == 5) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("kk:mm", Locale.ENGLISH);
                TimePicker timePicker = new TimePicker(getActivity());
                String str2 = this.elementValue;
                if (str2 != null) {
                    try {
                        Date parse = simpleDateFormat.parse(str2);
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTime(parse);
                        timePicker.setCurrentHour(Integer.valueOf(calendar3.get(10)));
                        timePicker.setCurrentMinute(Integer.valueOf(calendar3.get(12)));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                this.mView = timePicker;
            } else if (i == 6) {
                EditTextPlus createEditText = createEditText();
                createEditText.setInputType(2);
                String str3 = this.elementValue;
                if (str3 != null) {
                    createEditText.setText(str3);
                }
                this.mView = createEditText;
            } else {
                if (i == 3) {
                    this.btnDone.setVisibility(0);
                    String str4 = this.elementValue;
                    if (str4 != null) {
                        calendar2 = CalendarConverter.fromString(str4);
                        if (calendar2 == null) {
                            calendar2 = Calendar.getInstance();
                        }
                    } else {
                        calendar2 = Calendar.getInstance();
                        if (this.element.actingElement().firstYear != 0) {
                            calendar2.set(calendar2.get(1) + this.element.actingElement().firstYear, calendar2.get(2), calendar2.get(5));
                        }
                    }
                    DatePicker datePicker = new DatePicker(getActivity(), null, android.R.style.Widget.Holo.DatePicker);
                    datePicker.setSpinnersShown(true);
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(calendar2.get(1), calendar2.get(2), calendar2.get(5), null);
                    this.mView = datePicker;
                } else if (i == 4) {
                    this.btnDone.setVisibility(0);
                    String str5 = this.elementValue;
                    if (str5 != null) {
                        calendar = CalendarConverter.fromMonthYearString(str5);
                        if (calendar == null) {
                            calendar = Calendar.getInstance();
                        }
                    } else {
                        calendar = Calendar.getInstance();
                        if (this.element.actingElement().firstYear != 0) {
                            calendar.set(calendar.get(1) + this.element.actingElement().firstYear, calendar.get(2), calendar.get(5));
                        }
                    }
                    DatePicker datePicker2 = new DatePicker(getActivity(), null, android.R.style.Widget.Holo.DatePicker);
                    datePicker2.setSpinnersShown(true);
                    datePicker2.setCalendarViewShown(false);
                    try {
                        View findViewById = datePicker2.findViewById(Resources.getSystem().getIdentifier("day", "id", "android"));
                        if (findViewById != null) {
                            findViewById.setVisibility(8);
                        }
                    } catch (Exception unused) {
                        Log.d("FillrSDK", "Cannot hide day field as not found.");
                    }
                    findAndHideField(datePicker2);
                    findAndHideField(datePicker2);
                    datePicker2.init(calendar.get(1), calendar.get(2), calendar.get(5), null);
                    this.mView = datePicker2;
                } else if (i == 8) {
                    EditTextPlus createEditText2 = createEditText();
                    createEditText2.setInputType(33);
                    String str6 = this.elementValue;
                    if (str6 != null) {
                        createEditText2.setText(str6);
                    }
                    this.mView = createEditText2;
                } else {
                    EditTextPlus createEditText3 = createEditText();
                    String str7 = this.elementValue;
                    if (str7 != null) {
                        createEditText3.setText(str7);
                    }
                    this.mView = createEditText3;
                }
                z = true;
            }
            z = false;
        }
        if (this.mView != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
            this.mView.setLayoutParams(layoutParams);
            linearLayout.addView(this.mView);
            if (z) {
                ButtonPlus buttonPlus = new ButtonPlus(getActivity(), null);
                buttonPlus.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                buttonPlus.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                buttonPlus.setText(getResources().getString(R.string.btn_clear));
                buttonPlus.setTextSize(16.0f);
                buttonPlus.setTypeface(null, 1);
                buttonPlus.setTextColor(getResources().getColor(R.color.f_bg_color));
                buttonPlus.setPaintFlags(buttonPlus.getPaintFlags() | 8);
                buttonPlus.setOnClickListener(new AnonymousClass1(this, i2));
                linearLayout.addView(buttonPlus);
            }
            if (this.mRequestKeyboard) {
                View view = this.mView;
                view.postDelayed(new Client.AnonymousClass4(15, view, inputMethodManager), 400L);
            } else if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
            }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityResultCaller targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogInterface.OnDismissListener) {
            ((DialogInterface.OnDismissListener) targetFragment).onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getActivity().getWindow().setSoftInputMode(3);
    }

    public final void profileAnalyticsEvent(String str) {
        if (getTargetFragment() == null || getTargetFragment().getActivity() == null) {
            return;
        }
        AnalyticsEvent analyticsEvent = new AnalyticsEvent();
        analyticsEvent.action = str;
        this.profileStore.getProfileCompletePercentage(this.schema);
        FillrAnalyticsServiceBuilder.build().sendEvent(getTargetFragment().getActivity(), analyticsEvent);
    }
}
