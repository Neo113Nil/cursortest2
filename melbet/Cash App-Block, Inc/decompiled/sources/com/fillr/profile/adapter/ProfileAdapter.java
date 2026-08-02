package com.fillr.profile.adapter;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.KeyHandle$keyPair$2;
import coil3.Extras;
import com.android.volley.RequestQueue;
import com.bugsnag.android.Client;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$1;
import com.datadog.android.core.internal.utils.MiscUtilsKt;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.browsersdk.dialog.AddressSelectionDialog;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.core.utilities.ConnectionUtil;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.fillr.e0;
import com.fillr.embedded.profile.FEMainActivity;
import com.fillr.m1;
import com.fillr.profile.InputFragmentDialog;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzkv;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaca;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzajt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzfr;
import com.google.android.gms.internal.mlkit_genai_prompt.zzil;
import com.google.android.gms.internal.mlkit_genai_prompt.zzir;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_face.zzaa;
import com.google.android.gms.internal.mlkit_vision_face.zzbl;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.android.gms.internal.mlkit_vision_face.zzcc;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzmv;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzce;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzst;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzbc;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgh;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzmf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.zzn;
import com.miteksystems.misnap.core.LiveDataUtil;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.util.Strings;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.model.parsers.TokenJsonParser;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import com.withpersona.sdk2.inquiry.permissions.OldCheckRequestPermissionRationaleStateView;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2CheckRequestPermissionRationaleStateBinding;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import net.oneformapp.ProfileStore_;
import net.oneformapp.helper.CalendarConverter;
import net.oneformapp.helper.HelperFunctions;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.ElementType;
import net.oneformapp.schema.Schema_;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class ProfileAdapter implements View.OnClickListener {
    public final m1 arrayFunctions;
    public final Context mContext;
    public final ProfileDetailedViewFragment mHostingFragment;
    public final LayoutInflater mLayoutInflater;
    public final SVG mPlumbing;
    public final AnonymousClass1 onClicked;
    public final SearchView.AnonymousClass3 onFocusReceived;
    public final Toolbar.AnonymousClass1 profileManager;
    public final ProfileStore_ profileStore;
    public final Resources resources;
    public final Schema_ schema;
    public boolean shouldMoveNext;
    public final SearchView.AnonymousClass10 textValidation;
    public AppCompatEditText currentEditingTextView = null;
    public zzb textChangeListener = null;
    public DialogFragment frag = null;
    public List groupElements = null;
    public HelperElement currentElement = null;
    public final SparseArray allTitleViews = new SparseArray();
    public final HashMap allChildViews = new HashMap();
    public final HashMap isExpanded = new HashMap();
    public int count = 1;
    public final int viewCreatorType = 1;
    public final Handler handler = new Handler(Looper.getMainLooper());
    public final AnonymousClass1 onGroupClicked = new AnonymousClass1(this, 0);

    /* renamed from: com.fillr.profile.adapter.ProfileAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ ProfileAdapter this$0;

        public /* synthetic */ AnonymousClass1(ProfileAdapter profileAdapter, int i) {
            this.$r8$classId = i;
            this.this$0 = profileAdapter;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.$r8$classId;
            ProfileAdapter profileAdapter = this.this$0;
            switch (i) {
                case 0:
                    int intValue = ((Integer) view.getTag()).intValue();
                    profileAdapter.expandOrContractElements((View) profileAdapter.allTitleViews.get(intValue), intValue);
                    break;
                default:
                    if ((view instanceof EditText) && ((EditText) view).hasFocus()) {
                        profileAdapter.onClick(view);
                        break;
                    }
                    break;
            }
        }
    }

    public ProfileAdapter(FragmentActivity fragmentActivity, ProfileDetailedViewFragment profileDetailedViewFragment, m1 m1Var) {
        this.mContext = null;
        int i = 1;
        this.textValidation = new SearchView.AnonymousClass10(this, i);
        this.onClicked = new AnonymousClass1(this, i);
        this.onFocusReceived = new SearchView.AnonymousClass3(this, i);
        this.mContext = fragmentActivity;
        this.mLayoutInflater = (LayoutInflater) fragmentActivity.getSystemService("layout_inflater");
        ProfileStore_ instance_ = ProfileStore_.getInstance_(fragmentActivity);
        this.profileStore = instance_;
        this.schema = Schema_.getInstance_(fragmentActivity);
        this.profileManager = new Toolbar.AnonymousClass1(instance_);
        instance_.load();
        this.mHostingFragment = profileDetailedViewFragment;
        this.arrayFunctions = m1Var;
        this.resources = this.mContext.getResources();
        Context context = this.mContext;
        SVG svg = new SVG(21);
        svg.rootElement = Schema_.getInstance_(context);
        ProfileStore_ instance_2 = ProfileStore_.getInstance_(context);
        svg.idToElementMap = instance_2;
        svg.cssRules = new Toolbar.AnonymousClass1(instance_2);
        this.mPlumbing = svg;
    }

    public static InputFragmentDialog getInputDialog(Element element, ElementType elementType, String str) {
        InputFragmentDialog inputFragmentDialog = new InputFragmentDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("element", element);
        bundle.putSerializable("elementtype", elementType);
        bundle.putString("elementvalue", str);
        inputFragmentDialog.setArguments(bundle);
        return inputFragmentDialog;
    }

    public static void showTitleView(View view) {
        TextView textView = (TextView) view.findViewById(R.id.txtvalue);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_logo);
        View findViewById = view.findViewById(R.id.divider);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    public final void addChildViewToParentContainer(LinearLayout linearLayout, Element element, int i, int i2) {
        View inflate = this.mLayoutInflater.inflate(element.actingElement().isArrayType || element.actingElement().isFieldArray ? R.layout.profile_view_row_subtitle : R.layout.profile_view_non_array_row_title, (ViewGroup) null);
        linearLayout.addView(inflate);
        if (i2 == -1) {
            this.allTitleViews.put(i, inflate);
        } else {
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap = this.allChildViews;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put(Integer.valueOf(i2), inflate);
                hashMap.put(Integer.valueOf(i), hashMap3);
            } else {
                hashMap2.put(Integer.valueOf(i2), inflate);
                hashMap.put(Integer.valueOf(i), hashMap2);
            }
        }
        View childAt = linearLayout.getChildCount() > 1 ? linearLayout.getChildAt(linearLayout.getChildCount() - 2) : null;
        ElementType elementType = this.schema.getElementType(element);
        AppCompatEditText appCompatEditText = (AppCompatEditText) inflate.findViewById(R.id.txtField2);
        TextView textView = (TextView) inflate.findViewById(R.id.row_hint);
        boolean z = i2 == -1;
        List list = this.groupElements;
        HelperElement helperElement = new HelperElement();
        helperElement.groupElements = list;
        helperElement.isGroupField = z;
        helperElement.element = element;
        helperElement.groupPos = i;
        helperElement.childPos = i2;
        appCompatEditText.setTag(helperElement);
        appCompatEditText.setContentDescription(element.getDisplayName() + i2);
        int i3 = elementType.f1544type;
        if (i3 == 6) {
            appCompatEditText.setInputType(2);
        } else if (i3 == 8 || element.actingElement().isEmail) {
            appCompatEditText.setInputType(32);
        }
        appCompatEditText.setOnFocusChangeListener(this.onFocusReceived);
        appCompatEditText.addTextChangedListener(this.textValidation);
        if (!ElementType.isInlineEditingField(elementType)) {
            appCompatEditText.setInputType(0);
            appCompatEditText.setOnClickListener(this.onClicked);
        }
        String data = this.profileStore.getData(element.actingElement().pathKey);
        int i4 = this.count + 1;
        this.count = i4;
        appCompatEditText.setId(i4);
        if (childAt != null) {
            EditText editText = (EditText) childAt.findViewById(this.count - 1);
            if (editText != null) {
                editText.setNextFocusDownId(this.count);
            } else {
                Log.d(ProfileAdapter.class.toString(), "Error view");
            }
        }
        setInputFieldProperties(element, appCompatEditText, data);
        validateEditText(appCompatEditText, appCompatEditText.getEditableText());
        textView.setText(element.getDisplayName());
    }

    public final void expandOrContractElements(View view, int i) {
        Boolean bool;
        int intValue;
        InputMethodManager inputMethodManager;
        SparseArray sparseArray = this.allTitleViews;
        if (sparseArray.size() > i) {
            View view2 = (View) sparseArray.get(i);
            Element element = (Element) this.groupElements.get(i);
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap = this.isExpanded;
            if (((Boolean) hashMap.get(valueOf)) != null) {
                bool = Boolean.valueOf(!r3.booleanValue());
                hashMap.put(Integer.valueOf(i), bool);
            } else {
                bool = Boolean.TRUE;
                hashMap.put(Integer.valueOf(i), bool);
            }
            if (view != null && (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
            }
            if (bool.booleanValue()) {
                if (element != null && !element.actingElement().isArrayType) {
                    TextView textView = (TextView) view2.findViewById(R.id.txtvalue);
                    ImageView imageView = (ImageView) view2.findViewById(R.id.img_logo);
                    View findViewById = view2.findViewById(R.id.divider);
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                }
                handleOnTitleClicked(element, view, i);
            } else {
                AppCompatEditText appCompatEditText = this.currentEditingTextView;
                if (appCompatEditText != null && (appCompatEditText.getTag() instanceof HelperElement)) {
                    HelperElement helperElement = (HelperElement) this.currentEditingTextView.getTag();
                    if (!helperElement.element.isNonRecursiveType()) {
                        String str = helperElement.element.actingElement().pathKey;
                        String obj = this.currentEditingTextView.getText().toString();
                        ProfileStore_ profileStore_ = this.profileStore;
                        profileStore_.setData(str, obj);
                        profileStore_.store();
                    }
                }
                if (element != null && !element.actingElement().isArrayType) {
                    showTitleView(view2);
                }
                setTitleValue(view, element);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.groupView);
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                if (element != null && element.actingElement().isArrayType) {
                    handleOnTitleClicked(element, view, i);
                }
            }
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                View view3 = (View) sparseArray.get(sparseArray.keyAt(i2));
                if (view3 != null && (view3.getTag() instanceof Integer) && (intValue = ((Integer) view3.getTag()).intValue()) != i) {
                    showTitleView(view3);
                    setTitleValue(view3, (Element) this.groupElements.get(intValue));
                    LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.groupView);
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                    }
                }
            }
        }
    }

    public final void handleOnTitleClicked(Element element, View view, int i) {
        if (element != null) {
            boolean z = element.actingElement().isArrayType;
            Context context = this.mContext;
            if (z) {
                Bundle bundle = new Bundle();
                Element firstChildElement = element.getFirstChildElement();
                ProfileDetailedViewFragment profileDetailedViewFragment = new ProfileDetailedViewFragment();
                bundle.putString("elementpath", firstChildElement.actingElement().pathKey);
                bundle.putBoolean("is_parent_array", element.actingElement().isArrayType);
                profileDetailedViewFragment.setArguments(bundle);
                ((FEMainActivity) context).pushFragmentOntoStack(profileDetailedViewFragment, "profile_detailed_view_2");
                return;
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.groupView);
            if (linearLayout != null) {
                for (int i2 = 0; i2 < element.getChildrenCount(); i2++) {
                    Element childElementAt = element.getChildElementAt(i2);
                    if (!childElementAt.isCreditcard() || !childElementAt.actingElement().pathKey.endsWith(".Type")) {
                        addChildViewToParentContainer(linearLayout, childElementAt, i, i2);
                    }
                }
                View childAt = linearLayout.getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    SVG.findFirstEditTextRequestFocus(context, (ViewGroup) childAt);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Schema_ schema_;
        if (view.getTag() instanceof HelperElement) {
            if (view instanceof AppCompatEditText) {
                this.currentEditingTextView = (AppCompatEditText) view;
            }
            HelperElement helperElement = (HelperElement) view.getTag();
            this.currentElement = helperElement;
            Element element = helperElement.element;
            ProfileStore_ profileStore_ = this.profileStore;
            if (profileStore_ == null || (schema_ = this.schema) == null) {
                return;
            }
            String data = profileStore_.getData(element.actingElement().pathKey);
            ElementType elementType = schema_.getElementType(element);
            if (elementType == null || ElementType.isInlineEditingField(elementType)) {
                return;
            }
            this.shouldMoveNext = true;
            DialogFragment dialogFragment = this.frag;
            ProfileDetailedViewFragment profileDetailedViewFragment = this.mHostingFragment;
            if (dialogFragment == null) {
                this.frag = getInputDialog(element, elementType, data);
                if (profileDetailedViewFragment == null || !profileDetailedViewFragment.isVisible()) {
                    return;
                }
                this.frag.setTargetFragment(profileDetailedViewFragment, 0);
                this.frag.show(profileDetailedViewFragment.getFragmentManager(), "inputdialog");
                return;
            }
            if (dialogFragment.isVisible() || profileDetailedViewFragment == null || !profileDetailedViewFragment.isVisible()) {
                return;
            }
            InputFragmentDialog inputDialog = getInputDialog(element, elementType, data);
            this.frag = inputDialog;
            inputDialog.setTargetFragment(profileDetailedViewFragment, 0);
            this.frag.show(profileDetailedViewFragment.getFragmentManager(), "inputdialog");
        }
    }

    public final void processNextFieldView(View view) {
        AppCompatEditText appCompatEditText;
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                View childAt = linearLayout.getChildAt(i);
                if (childAt instanceof AppCompatEditText) {
                    appCompatEditText = (AppCompatEditText) childAt;
                    break;
                }
            }
        }
        appCompatEditText = null;
        if (appCompatEditText == null || !(appCompatEditText.getTag() instanceof HelperElement)) {
            return;
        }
        HelperElement helperElement = (HelperElement) appCompatEditText.getTag();
        if (ElementType.isInlineEditingField(this.schema.getElementType(helperElement.element))) {
            appCompatEditText.requestFocus();
            appCompatEditText.postDelayed(new Client.AnonymousClass4(14, this.mContext, appCompatEditText), 200L);
            this.shouldMoveNext = true;
            this.currentElement = helperElement;
            this.currentEditingTextView = appCompatEditText;
        }
        setInputFieldProperties(helperElement.element, appCompatEditText, null);
    }

    public final void profileAnalyticsEvent(String str) {
        ProfileDetailedViewFragment profileDetailedViewFragment = this.mHostingFragment;
        if (profileDetailedViewFragment == null || profileDetailedViewFragment.getMainActivity() == null) {
            return;
        }
        AnalyticsEvent analyticsEvent = new AnalyticsEvent();
        analyticsEvent.action = str;
        this.profileStore.getProfileCompletePercentage(this.schema);
        FillrAnalyticsServiceBuilder.build().sendEvent(profileDetailedViewFragment.getMainActivity(), analyticsEvent);
    }

    public final void setInputFieldProperties(Element element, AppCompatEditText appCompatEditText, String str) {
        if (appCompatEditText != null) {
            if (element.actingElement().mMaxLength != -1) {
                appCompatEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(element.actingElement().mMaxLength)});
                if (str != null && str.length() > element.actingElement().mMaxLength) {
                    str = str.substring(0, element.actingElement().mMaxLength);
                }
            }
            if (str != null && element.actingElement().mMaskingValue != -99) {
                appCompatEditText.setText(HelperFunctions.maskValuesIfNecessary(element.actingElement().mMaskingValue, str));
            } else if (str != null) {
                str = CalendarConverter.getLocaleFormattedDate(str, this.schema.getElementType(element));
                appCompatEditText.setText(str);
            }
            updateCreditcardTypeImage(element, appCompatEditText, str);
            if (element.actingElement().isFieldArray) {
                return;
            }
            String displayName = element.getDisplayName();
            Resources resources = this.resources;
            appCompatEditText.setHintTextColor(resources.getColor((str == null || str.length() <= 0) ? R.color.com_fillr_listview_profile_hint : R.color.com_fillr_listview_profile_text));
            appCompatEditText.setHint(resources.getString(R.string.text_hint, displayName));
        }
    }

    public final void setTitleValue(View view, Element element) {
        Element element2;
        TextView textView = (TextView) view.findViewById(R.id.txtField);
        TextView textView2 = (TextView) view.findViewById(R.id.txtvalue);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_logo);
        TextView textView3 = (TextView) view.findViewById(R.id.txtAddMore);
        if (textView == null || textView2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        textView.setText(element.getDisplayName());
        StringBuilder sb = null;
        if (imageView != null) {
            if (element.actingElement().pathKey.contains("CreditCards.CreditCard")) {
                String str = null;
                for (Element element3 : element.actingElement().children) {
                    if (element3.actingElement().pathKey.endsWith(".Type")) {
                        str = this.profileStore.getData(element3.actingElement().pathKey);
                    }
                }
                imageView.setImageResource(LiveDataUtil.getTinyImageResourceIdForCreditCardType(str));
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z = element.actingElement().isArrayType;
        SVG svg = this.mPlumbing;
        if (z) {
            svg.getClass();
            if (element.getFirstChildElement() != null) {
                Toolbar.AnonymousClass1 anonymousClass1 = (Toolbar.AnonymousClass1) svg.cssRules;
                Element firstChildElement = element.getFirstChildElement();
                int[] allArrayElements = anonymousClass1.getAllArrayElements(firstChildElement);
                if (allArrayElements.length > 0) {
                    int i = allArrayElements[0];
                    element2 = new Element(firstChildElement);
                    element2.alterPathForArrays(i);
                } else {
                    element2 = null;
                }
                if (element2 != null) {
                    svg.travelThroughElementHierarchy(element2, arrayList);
                }
            }
        } else {
            svg.travelThroughElementHierarchy(element, arrayList);
        }
        svg.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (sb == null) {
                sb = new StringBuilder(str2);
            } else {
                sb.append(" ");
                sb.append(str2);
            }
        }
        String sb2 = sb != null ? sb.toString() : "";
        boolean equals = sb2.trim().equals("");
        if (element.actingElement().isFieldArray && !element.actingElement().isArrayType) {
            textView.setText(element.getDisplayName() + " " + (element.actingElement().position + 1));
        }
        if (equals) {
            sb2 = this.mContext.getString(R.string.text_hint, element.getDisplayName());
        }
        textView2.setText(sb2);
        Resources resources = this.resources;
        if (equals && (element.actingElement().isArrayType || element.isAddress())) {
            textView2.setTextColor(resources.getColor(R.color.com_fillr_listview_profile_hint));
        } else {
            if (equals || !element.actingElement().isArrayType || textView3 == null) {
                return;
            }
            textView3.setVisibility(0);
            textView2.setTextColor(resources.getColor(R.color.com_fillr_listview_profile_text));
        }
    }

    public final void showAddressAutocompletionDialog(Element element) {
        Context context = this.mContext;
        boolean isConnected = ConnectionUtil.isConnected(context);
        ProfileDetailedViewFragment profileDetailedViewFragment = this.mHostingFragment;
        if (!isConnected || GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
            if (profileDetailedViewFragment != null) {
                profileDetailedViewFragment.onManualEntry(element);
                return;
            }
            return;
        }
        AddressSelectionDialog addressSelectionDialog = new AddressSelectionDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("element", element);
        addressSelectionDialog.setArguments(bundle);
        addressSelectionDialog.addressSelectionDialogListener = new MetadataRepo((Object) this, (Object) context, (Object) addressSelectionDialog, (Serializable) element);
        this.frag = addressSelectionDialog;
        if (profileDetailedViewFragment.isAdded() && profileDetailedViewFragment.isVisible()) {
            this.frag.setTargetFragment(profileDetailedViewFragment, -1);
            this.frag.show(profileDetailedViewFragment.getFragmentManager(), "inputdialog");
        }
    }

    public final void storeCreditCardType(EditText editText, HelperElement helperElement, String str) {
        Context context = editText.getContext();
        String creditcardType = CreditcardTypeValidator.getCreditcardType(str);
        int i = helperElement.groupPos;
        List list = helperElement.groupElements;
        Element element = null;
        if (list != null && i < list.size()) {
            Object obj = list.get(i);
            if (obj instanceof Element) {
                element = (Element) obj;
            }
        }
        Element findLeafElementWithSuffix = Element.findLeafElementWithSuffix(".Type", element);
        if (findLeafElementWithSuffix != null) {
            ProfileStore_ instance_ = ProfileStore_.getInstance_(context);
            String str2 = findLeafElementWithSuffix.actingElement().pathKey;
            if (creditcardType == null) {
                creditcardType = "";
            }
            instance_.setData(str2, creditcardType);
            instance_.store();
            HashMap hashMap = (HashMap) this.allChildViews.get(Integer.valueOf(helperElement.groupPos));
            if (hashMap != null) {
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    View view = (View) ((Map.Entry) it.next()).getValue();
                    if (view != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        if (linearLayout.getChildCount() == 2 && (linearLayout.getChildAt(1) instanceof EditText)) {
                            EditText editText2 = (EditText) linearLayout.getChildAt(1);
                            Object tag = editText2.getTag();
                            if (tag instanceof HelperElement) {
                                Element element2 = ((HelperElement) tag).element;
                                if (element2.isCreditcardNumber()) {
                                    this.handler.post(new AnonymousClass8(this, element2, editText2, str, 0));
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void updateCreditcardTypeImage(Element element, EditText editText, String str) {
        Drawable drawable;
        int tinyImageResourceIdForCreditCardType;
        if (str == null || str.isEmpty() || !element.isCreditcardNumber() || (tinyImageResourceIdForCreditCardType = LiveDataUtil.getTinyImageResourceIdForCreditCardType(CreditcardTypeValidator.getCreditcardType(str))) == 0) {
            drawable = null;
        } else {
            drawable = this.mContext.getResources().getDrawable(tinyImageResourceIdForCreditCardType);
            drawable.setBounds(0, 0, (int) (20.0f / (r3.getResources().getDisplayMetrics().densityDpi / 160.0f)), (int) (20.0f / (r3.getResources().getDisplayMetrics().densityDpi / 160.0f)));
        }
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void validateEditText(EditText editText, Editable editable) {
        if (editText == null || !(editText.getTag() instanceof HelperElement)) {
            return;
        }
        HelperElement helperElement = (HelperElement) editText.getTag();
        if (helperElement != null ? helperElement.element.isCreditcardNumber() : false) {
            String obj = editable.toString();
            if (obj == null || obj.length() <= 0 || obj.length() >= 20) {
                storeCreditCardType(editText, helperElement, obj);
            } else if (obj.matches("^[0-9]+$")) {
                storeCreditCardType(editText, helperElement, obj);
            }
        }
    }

    /* renamed from: com.fillr.profile.adapter.ProfileAdapter$8, reason: invalid class name */
    public final class AnonymousClass8 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;
        public final Object val$cardNumber;
        public final Object val$element;
        public final Object val$txtValue;

        public AnonymousClass8(File file, FileMover fileMover, InternalLogger internalLogger, Strings strings) {
            this.$r8$classId = 3;
            fileMover.getClass();
            internalLogger.getClass();
            strings.getClass();
            this.val$element = file;
            this.val$txtValue = fileMover;
            this.val$cardNumber = internalLogger;
            this.this$0 = strings;
        }

        private final void run$com$google$android$gms$measurement$internal$zznh() {
            zzgb zzgbVar;
            zznl zznlVar = (zznl) this.val$element;
            AtomicReference atomicReference = (AtomicReference) this.val$txtValue;
            zzr zzrVar = (zzr) this.val$cardNumber;
            Bundle bundle = (Bundle) this.this$0;
            synchronized (atomicReference) {
                try {
                    zzgbVar = zznlVar.zzb;
                } catch (RemoteException e) {
                    zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzb(e, "Failed to request trigger URIs; remote exception");
                    atomicReference.notifyAll();
                }
                if (zzgbVar != null) {
                    zzgbVar.zzD(zzrVar, bundle, new zzme(zznlVar, atomicReference));
                    zznlVar.zzae();
                } else {
                    zzgu zzguVar2 = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zza("Failed to request trigger URIs; not connected to service");
                }
            }
        }

        private final void run$com$google$android$gms$measurement$internal$zzni() {
            zzgb zzgbVar;
            zznl zznlVar = (zznl) this.val$element;
            AtomicReference atomicReference = (AtomicReference) this.val$txtValue;
            zzr zzrVar = (zzr) this.val$cardNumber;
            zzoo zzooVar = (zzoo) this.this$0;
            synchronized (atomicReference) {
                try {
                    zzgbVar = zznlVar.zzb;
                } catch (RemoteException e) {
                    zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzb(e, "[sgtm] Failed to get upload batches; remote exception");
                    atomicReference.notifyAll();
                }
                if (zzgbVar != null) {
                    zzgbVar.zzB(zzrVar, zzooVar, new zzmf(zznlVar, atomicReference));
                    zznlVar.zzae();
                } else {
                    zzgu zzguVar2 = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zza("[sgtm] Failed to get upload batches; not connected to service");
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:88|89|(5:91|(1:93)|95|96|97)|99|(2:102|100)|103|104|105|106|(2:109|107)|110|111|(1:113)|114|96|97) */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x043f, code lost:
        
            r1.zzaW().zzg.zzb(r2, "Failed to parse queued batch. appId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x0572, code lost:
        
            if (r4.isEmpty() == false) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0388, code lost:
        
            if (java.lang.System.currentTimeMillis() >= (r6 + r10)) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:136:0x04c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            String str;
            zzir zzirVar;
            String str2;
            zzdk zzdkVar;
            String str3;
            zzcc zzccVar;
            String str4;
            zzce zzceVar;
            zzgb zzgbVar;
            long j = 0;
            byte[] bArr = null;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    ((ProfileAdapter) this.this$0).updateCreditcardTypeImage((Element) this.val$element, (EditText) this.val$txtValue, (String) this.val$cardNumber);
                    return;
                case 1:
                    CascadingMenuPopup cascadingMenuPopup = (CascadingMenuPopup) ((Toolbar.AnonymousClass1) this.this$0).this$0;
                    MenuItemImpl menuItemImpl = (MenuItemImpl) this.val$txtValue;
                    CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo = (CascadingMenuPopup.CascadingMenuInfo) this.val$element;
                    if (cascadingMenuInfo != null) {
                        cascadingMenuPopup.mShouldCloseImmediately = true;
                        cascadingMenuInfo.menu.close(false);
                        cascadingMenuPopup.mShouldCloseImmediately = false;
                    }
                    if (menuItemImpl.isEnabled() && menuItemImpl.hasSubMenu()) {
                        ((MenuBuilder) this.val$cardNumber).performItemAction(menuItemImpl, null, 4);
                        return;
                    }
                    return;
                case 2:
                    WindowInsetsAnimationCompat.Impl21.dispatchOnStart((View) this.val$element, (WindowInsetsAnimationCompat) this.val$txtValue, (WorkLauncherImpl) this.val$cardNumber);
                    ((ValueAnimator) this.this$0).start();
                    return;
                case 3:
                    File file = (File) this.val$element;
                    InternalLogger internalLogger = (InternalLogger) this.val$cardNumber;
                    if (file == null) {
                        DBUtil.log$default(internalLogger, 4, InternalLogger.Target.MAINTAINER, MoveDataMigrationOperation$run$1.INSTANCE$2, null, false, 56);
                        return;
                    } else {
                        MiscUtilsKt.retryWithDelay(internalLogger, (Strings) this.this$0, new KeyHandle$keyPair$2(this, 16));
                        return;
                    }
                case 4:
                    SettableFuture settableFuture = (SettableFuture) this.val$element;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.val$txtValue;
                    Context context = (Context) this.val$cardNumber;
                    zzkv zzkvVar = (zzkv) this.this$0;
                    if ((settableFuture.valueField instanceof AbstractFuture.Cancellation) && atomicBoolean.compareAndSet(false, true)) {
                        try {
                            context.unregisterReceiver(zzkvVar);
                            return;
                        } catch (IllegalArgumentException e) {
                            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
                            return;
                        }
                    }
                    return;
                case 5:
                    zzajt zzajtVar = (zzajt) this.val$element;
                    zzfr zzfrVar = (zzfr) this.val$txtValue;
                    zzaca zzacaVar = (zzaca) this.this$0;
                    String str5 = (String) this.val$cardNumber;
                    JWECryptoParts jWECryptoParts = (JWECryptoParts) zzfrVar.zza;
                    jWECryptoParts.encryptedKey = zzacaVar;
                    zzahn zzahnVar = (zzahn) jWECryptoParts.header;
                    if (zzahnVar == null || (str = zzahnVar.zzd) == null || str.isEmpty()) {
                        str = "NA";
                    } else {
                        zzae.checkNotNull(str);
                    }
                    RequestQueue requestQueue = new RequestQueue();
                    requestQueue.mSequenceGenerator = zzajtVar.zzc;
                    requestQueue.mCurrentRequests = zzajtVar.zzd;
                    synchronized (zzajt.class) {
                        try {
                            zzirVar = zzajt.zza;
                            if (zzirVar == null) {
                                LocaleListCompat locales = PlatformKt.getLocales(Resources.getSystem().getConfiguration());
                                Object[] objArr = new Object[4];
                                int i2 = 0;
                                while (i < locales.size()) {
                                    Locale locale = locales.get(i);
                                    PatternRedaction patternRedaction = CommonUtils.zza;
                                    String languageTag = locale.toLanguageTag();
                                    languageTag.getClass();
                                    int length = objArr.length;
                                    int i3 = i2 + 1;
                                    int zza = TokenJsonParser.zza(length, i3);
                                    if (zza > length) {
                                        objArr = Arrays.copyOf(objArr, zza);
                                    }
                                    objArr[i2] = languageTag;
                                    i++;
                                    i2 = i3;
                                }
                                zzirVar = zzil.zzi(i2, objArr);
                                zzajt.zza = zzirVar;
                            }
                        } finally {
                        }
                    }
                    requestQueue.mCache = zzirVar;
                    requestQueue.mDispatchers = Boolean.TRUE;
                    requestQueue.mNetworkQueue = str;
                    requestQueue.mCacheQueue = str5;
                    zzw zzwVar = zzajtVar.zzh;
                    requestQueue.mNetwork = zzwVar.isSuccessful() ? (String) zzwVar.getResult() : zzajtVar.zzf.getMlSdkInstanceId();
                    requestQueue.mFinishedListeners = 10;
                    requestQueue.mEventListeners = Integer.valueOf(zzajtVar.zzj);
                    zzfrVar.zzb = requestQueue;
                    zzajtVar.zze.zza(zzfrVar);
                    return;
                case 6:
                    zzwp zzwpVar = (zzwp) this.val$element;
                    HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) this.val$txtValue;
                    zzrc zzrcVar = (zzrc) this.this$0;
                    String str6 = (String) this.val$cardNumber;
                    SubtreeManager subtreeManager = (SubtreeManager) huffmanTreeGroup.codes;
                    subtreeManager.contextForChildren = zzrcVar;
                    zzvd zzvdVar = (zzvd) subtreeManager.snapshotCache;
                    if (zzvdVar == null || (str2 = zzvdVar.zzd) == null || str2.isEmpty()) {
                        str2 = "NA";
                    } else {
                        zzae.checkNotNull(str2);
                    }
                    RequestQueue requestQueue2 = new RequestQueue();
                    requestQueue2.mSequenceGenerator = zzwpVar.zzc;
                    requestQueue2.mCurrentRequests = zzwpVar.zzd;
                    synchronized (zzwp.class) {
                        try {
                            zzdkVar = zzwp.zza;
                            if (zzdkVar == null) {
                                LocaleListCompat locales2 = PlatformKt.getLocales(Resources.getSystem().getConfiguration());
                                zzfz zzfzVar = new zzfz();
                                while (i < locales2.size()) {
                                    Locale locale2 = locales2.get(i);
                                    PatternRedaction patternRedaction2 = CommonUtils.zza;
                                    zzfzVar.zza$com$google$android$gms$internal$mlkit_vision_barcode$zzcl(locale2.toLanguageTag());
                                    i++;
                                }
                                zzdkVar = zzfzVar.zzf();
                                zzwp.zza = zzdkVar;
                            }
                        } finally {
                        }
                    }
                    requestQueue2.mCache = zzdkVar;
                    requestQueue2.mDispatchers = Boolean.TRUE;
                    requestQueue2.mNetworkQueue = str2;
                    requestQueue2.mCacheQueue = str6;
                    requestQueue2.mNetwork = zzwpVar.zzh.isSuccessful() ? (String) zzwpVar.zzh.getResult() : zzwpVar.zzf.getMlSdkInstanceId();
                    requestQueue2.mFinishedListeners = 10;
                    requestQueue2.mEventListeners = Integer.valueOf(zzwpVar.zzj);
                    huffmanTreeGroup.trees = requestQueue2;
                    zzwpVar.zze.zza(huffmanTreeGroup);
                    return;
                case 7:
                    zzoc zzocVar = (zzoc) this.val$element;
                    HuffmanTreeGroup huffmanTreeGroup2 = (HuffmanTreeGroup) this.val$txtValue;
                    zzkt zzktVar = (zzkt) this.this$0;
                    String str7 = (String) this.val$cardNumber;
                    e0 e0Var = (e0) huffmanTreeGroup2.codes;
                    e0Var.b = zzktVar;
                    zzmv zzmvVar = (zzmv) e0Var.a;
                    if (zzmvVar != null) {
                        str3 = zzmvVar.zzd;
                        int i4 = zzaa.$r8$clinit;
                        if (str3 != null) {
                            break;
                        }
                    }
                    str3 = "NA";
                    RequestQueue requestQueue3 = new RequestQueue();
                    requestQueue3.mSequenceGenerator = zzocVar.zzc;
                    requestQueue3.mCurrentRequests = zzocVar.zzd;
                    synchronized (zzoc.class) {
                        try {
                            zzccVar = zzoc.zza;
                            if (zzccVar == null) {
                                LocaleListCompat locales3 = PlatformKt.getLocales(Resources.getSystem().getConfiguration());
                                Object[] objArr2 = new Object[4];
                                int i5 = 0;
                                while (i < locales3.size()) {
                                    Locale locale3 = locales3.get(i);
                                    PatternRedaction patternRedaction3 = CommonUtils.zza;
                                    String languageTag2 = locale3.toLanguageTag();
                                    languageTag2.getClass();
                                    int i6 = i5 + 1;
                                    int length2 = objArr2.length;
                                    if (length2 < i6) {
                                        int i7 = length2 + (length2 >> 1) + 1;
                                        if (i7 < i6) {
                                            int highestOneBit = Integer.highestOneBit(i5);
                                            i7 = highestOneBit + highestOneBit;
                                        }
                                        if (i7 < 0) {
                                            i7 = Integer.MAX_VALUE;
                                        }
                                        objArr2 = Arrays.copyOf(objArr2, i7);
                                    }
                                    objArr2[i5] = languageTag2;
                                    i++;
                                    i5 = i6;
                                }
                                zzbl zzblVar = zzbn.zza;
                                zzccVar = i5 == 0 ? zzcc.zza : new zzcc(i5, objArr2);
                                zzoc.zza = zzccVar;
                            }
                        } finally {
                        }
                    }
                    requestQueue3.mCache = zzccVar;
                    requestQueue3.mDispatchers = Boolean.TRUE;
                    requestQueue3.mNetworkQueue = str3;
                    requestQueue3.mCacheQueue = str7;
                    requestQueue3.mNetwork = zzocVar.zzh.isSuccessful() ? (String) zzocVar.zzh.getResult() : zzocVar.zzf.getMlSdkInstanceId();
                    requestQueue3.mFinishedListeners = 10;
                    requestQueue3.mEventListeners = Integer.valueOf(zzocVar.zzj);
                    huffmanTreeGroup2.trees = requestQueue3;
                    zzocVar.zze.zza$7(huffmanTreeGroup2);
                    return;
                case 8:
                    zzuc zzucVar = (zzuc) this.val$element;
                    HuffmanTreeGroup huffmanTreeGroup3 = (HuffmanTreeGroup) this.val$txtValue;
                    zzov zzovVar = (zzov) this.this$0;
                    String str8 = (String) this.val$cardNumber;
                    e0 e0Var2 = (e0) huffmanTreeGroup3.codes;
                    e0Var2.b = zzovVar;
                    zzst zzstVar = (zzst) e0Var2.a;
                    if (zzstVar != null) {
                        str4 = zzstVar.zzd;
                        if (!CameraPropertiesKt.zzb(str4)) {
                            zzae.checkNotNull(str4);
                            RequestQueue requestQueue4 = new RequestQueue();
                            requestQueue4.mSequenceGenerator = zzucVar.zzc;
                            requestQueue4.mCurrentRequests = zzucVar.zzd;
                            synchronized (zzuc.class) {
                                try {
                                    zzceVar = zzuc.zza;
                                    if (zzceVar == null) {
                                        LocaleListCompat locales4 = PlatformKt.getLocales(Resources.getSystem().getConfiguration());
                                        Object[] objArr3 = new Object[4];
                                        int i8 = 0;
                                        while (i < locales4.size()) {
                                            Locale locale4 = locales4.get(i);
                                            PatternRedaction patternRedaction4 = CommonUtils.zza;
                                            String languageTag3 = locale4.toLanguageTag();
                                            languageTag3.getClass();
                                            int i9 = i8 + 1;
                                            int length3 = objArr3.length;
                                            if (length3 < i9) {
                                                int i10 = length3 + (length3 >> 1) + 1;
                                                if (i10 < i9) {
                                                    int highestOneBit2 = Integer.highestOneBit(i8);
                                                    i10 = highestOneBit2 + highestOneBit2;
                                                }
                                                if (i10 < 0) {
                                                    i10 = Integer.MAX_VALUE;
                                                }
                                                objArr3 = Arrays.copyOf(objArr3, i10);
                                            }
                                            objArr3[i8] = languageTag3;
                                            i++;
                                            i8 = i9;
                                        }
                                        zzceVar = zzbk.zzg(i8, objArr3);
                                        zzuc.zza = zzceVar;
                                    }
                                } finally {
                                }
                            }
                            requestQueue4.mCache = zzceVar;
                            requestQueue4.mDispatchers = Boolean.TRUE;
                            requestQueue4.mNetworkQueue = str4;
                            requestQueue4.mCacheQueue = str8;
                            requestQueue4.mNetwork = zzucVar.zzh.isSuccessful() ? (String) zzucVar.zzh.getResult() : zzucVar.zzf.getMlSdkInstanceId();
                            requestQueue4.mFinishedListeners = 10;
                            requestQueue4.mEventListeners = Integer.valueOf(zzucVar.zzj);
                            huffmanTreeGroup3.trees = requestQueue4;
                            zzucVar.zze.zza$8(huffmanTreeGroup3);
                            return;
                        }
                    }
                    str4 = "NA";
                    RequestQueue requestQueue42 = new RequestQueue();
                    requestQueue42.mSequenceGenerator = zzucVar.zzc;
                    requestQueue42.mCurrentRequests = zzucVar.zzd;
                    synchronized (zzuc.class) {
                    }
                case 9:
                    zzjd zzjdVar = (zzjd) this.val$element;
                    String str9 = (String) this.val$cardNumber;
                    zzoo zzooVar = (zzoo) this.val$txtValue;
                    zzgh zzghVar = (zzgh) this.this$0;
                    zzpg zzpgVar = zzjdVar.zza;
                    zzpgVar.zzaa$1();
                    zzpgVar.zzaX().zzg();
                    zzpgVar.zzu$3();
                    zzaw zzawVar = zzpgVar.zze;
                    zzpg.zzaT(zzawVar);
                    List<zzpj> zzC = zzawVar.zzC(str9, zzooVar, ((Integer) zzfy.zzA.zzb(null)).intValue());
                    ArrayList arrayList = new ArrayList();
                    for (zzpj zzpjVar : zzC) {
                        String str10 = zzpjVar.zzc;
                        long j2 = zzpjVar.zzh;
                        long j3 = zzpjVar.zza;
                        if (zzpgVar.zzO(str9, str10)) {
                            int i11 = zzpjVar.zzi;
                            if (i11 > 0) {
                                if (i11 <= ((Integer) zzfy.zzy.zzb(bArr)).intValue()) {
                                    long min = Math.min(((Long) zzfy.zzw.zzb(bArr)).longValue() * (1 << (i11 - 1)), ((Long) zzfy.zzx.zzb(bArr)).longValue());
                                    zzpgVar.zzba().getClass();
                                    break;
                                }
                                zzpgVar.zzaW().zzl.zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str9, Long.valueOf(j3), Long.valueOf(j2));
                                bArr = null;
                            }
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : zzpjVar.zzd.entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            zzom zzomVar = new zzom(zzpjVar.zza, zzpjVar.zzb.zzcd(), zzpjVar.zzc, bundle, zzpjVar.zze.zzg, zzpjVar.zzg, "");
                            zzhz zzhzVar = (zzhz) zzpk.zzw(zzib.zzi(), zzomVar.zzb);
                            for (int i12 = 0; i12 < zzhzVar.zzb(); i12++) {
                                com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((zzib) zzhzVar.zza).zzc(i12).zzco();
                                zzpgVar.zzba().getClass();
                                zzicVar.zzs(System.currentTimeMillis());
                                zzhzVar.zzd(i12, zzicVar);
                            }
                            zzomVar.zzb = ((zzib) zzhzVar.zzbd()).zzcd();
                            if (Log.isLoggable(zzpgVar.zzaW().zzn(), 2)) {
                                zzpk zzpkVar = zzpgVar.zzi;
                                zzpg.zzaT(zzpkVar);
                                zzomVar.zzg = zzpkVar.zzi((zzib) zzhzVar.zzbd());
                            }
                            arrayList.add(zzomVar);
                            bArr = null;
                        } else {
                            zzpgVar.zzaW().zzl.zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str9, Long.valueOf(j3), zzpjVar.zzc);
                        }
                    }
                    try {
                        zzghVar.zze(new zzoq(arrayList));
                        zzpgVar.zzaW().zzl.zzc("[sgtm] Sending queued upload batches to client. appId, count", str9, Integer.valueOf(arrayList.size()));
                        return;
                    } catch (RemoteException e2) {
                        zzpgVar.zzaW().zzd.zzc("[sgtm] Failed to return upload batches for app", str9, e2);
                        return;
                    }
                case 10:
                    zznl zzt = ((AppMeasurementDynamiteService) this.this$0).zza.zzt();
                    zzcs zzcsVar = (zzcs) this.val$element;
                    zzbh zzbhVar = (zzbh) this.val$txtValue;
                    String str11 = (String) this.val$cardNumber;
                    zzt.zzg();
                    zzt.zzb$1();
                    zzic zzicVar2 = (zzic) zzt.$$delegate_0;
                    zzpp zzppVar = zzicVar2.zzl;
                    zzic.zzN(zzppVar);
                    if (GoogleApiAvailabilityLight.zza.isGooglePlayServicesAvailable(((zzic) zzppVar.$$delegate_0).zzd, 12451000) == 0) {
                        zzt.zzaf(new AnonymousClass8(14, zzt, zzbhVar, zzcsVar, str11));
                        return;
                    }
                    zzgu zzguVar = zzicVar2.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzg.zza("Not bundling data. Service unavailable or out of date");
                    zzpp zzppVar2 = zzicVar2.zzl;
                    zzic.zzN(zzppVar2);
                    zzppVar2.zzar(zzcsVar, new byte[0]);
                    return;
                case 11:
                    zzjd zzjdVar2 = (zzjd) this.val$element;
                    Bundle bundle2 = (Bundle) this.val$txtValue;
                    String str12 = (String) this.val$cardNumber;
                    zzr zzrVar = (zzr) this.this$0;
                    boolean isEmpty = bundle2.isEmpty();
                    zzpg zzpgVar2 = zzjdVar2.zza;
                    if (isEmpty) {
                        zzaw zzawVar2 = zzpgVar2.zze;
                        zzpg.zzaT(zzawVar2);
                        zzawVar2.zzg();
                        zzawVar2.zzay();
                        try {
                            zzawVar2.zze().execSQL("delete from default_event_params where app_id=?", new String[]{str12});
                            return;
                        } catch (SQLiteException e3) {
                            zzgu zzguVar2 = ((zzic) zzawVar2.$$delegate_0).zzi;
                            zzic.zzP(zzguVar2);
                            zzguVar2.zzd.zzb(e3, "Error clearing default event params");
                            return;
                        }
                    }
                    zzaw zzawVar3 = zzpgVar2.zze;
                    zzpg.zzaT(zzawVar3);
                    zzic zzicVar3 = (zzic) zzawVar3.$$delegate_0;
                    zzawVar3.zzg();
                    zzawVar3.zzay();
                    zzbc zzbcVar = new zzbc((zzic) zzawVar3.$$delegate_0, "", str12, "dep", 0L, 0L, 0L, bundle2);
                    zzpk zzpkVar2 = zzawVar3.zzg.zzi;
                    zzpg.zzaT(zzpkVar2);
                    byte[] zzcd = zzpkVar2.zzh(zzbcVar).zzcd();
                    zzgu zzguVar3 = zzicVar3.zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzl.zzc("Saving default event parameters, appId, data size", str12, Integer.valueOf(zzcd.length));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str12);
                    contentValues.put("parameters", zzcd);
                    try {
                        if (zzawVar3.zze().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                            zzic.zzP(zzguVar3);
                            zzguVar3.zzd.zzb(zzgu.zzl(str12), "Failed to insert default event parameters (got -1). appId");
                        }
                    } catch (SQLiteException e4) {
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzd.zzc("Error storing default event parameters. appId", zzgu.zzl(str12), e4);
                    }
                    zzaw zzawVar4 = zzpgVar2.zze;
                    zzpg.zzaT(zzawVar4);
                    long j4 = zzrVar.zzD;
                    try {
                        if (zzawVar4.zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str12, String.valueOf(j4)}, 0L) > 0) {
                            return;
                        }
                        if (zzawVar4.zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str12, String.valueOf(j4)}, 0L) > 0) {
                            zzaw zzawVar5 = zzpgVar2.zze;
                            zzpg.zzaT(zzawVar5);
                            zzawVar5.zzX(str12, Long.valueOf(j4), null, bundle2);
                            return;
                        }
                        return;
                    } catch (SQLiteException e5) {
                        zzgu zzguVar4 = ((zzic) zzawVar4.$$delegate_0).zzi;
                        zzic.zzP(zzguVar4);
                        zzguVar4.zzd.zzb(e5, "Error checking backfill conditions");
                        return;
                    }
                case 12:
                    String str13 = (String) this.val$cardNumber;
                    String str14 = (String) this.val$txtValue;
                    zznl zzt2 = ((zzic) ((zzlj) this.this$0).$$delegate_0).zzt();
                    AtomicReference atomicReference = (AtomicReference) this.val$element;
                    zzt2.zzg();
                    zzt2.zzb$1();
                    zzt2.zzaf(new zzn(4, zzt2, atomicReference, str13, str14, zzt2.zzah(false), false));
                    return;
                case 13:
                    zznl zzt3 = ((AppMeasurementDynamiteService) this.this$0).zza.zzt();
                    zzcs zzcsVar2 = (zzcs) this.val$element;
                    String str15 = (String) this.val$cardNumber;
                    String str16 = (String) this.val$txtValue;
                    zzt3.zzg();
                    zzt3.zzb$1();
                    zzt3.zzaf(new zzn(5, zzt3, str15, str16, zzt3.zzah(false), zzcsVar2, false));
                    return;
                case 14:
                    zzcs zzcsVar3 = (zzcs) this.val$txtValue;
                    zznl zznlVar = (zznl) this.this$0;
                    try {
                        try {
                            zzgbVar = zznlVar.zzb;
                        } finally {
                            zzpp zzppVar3 = ((zzic) zznlVar.$$delegate_0).zzl;
                            zzic.zzN(zzppVar3);
                            zzppVar3.zzar(zzcsVar3, null);
                        }
                    } catch (RemoteException e6) {
                        zzgu zzguVar5 = ((zzic) zznlVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar5);
                        zzguVar5.zzd.zzb(e6, "Failed to send event to the service to bundle");
                    }
                    if (zzgbVar != null) {
                        bArr = zzgbVar.zzk((zzbh) this.val$element, (String) this.val$cardNumber);
                        zznlVar.zzae();
                        return;
                    }
                    zzic zzicVar4 = (zzic) zznlVar.$$delegate_0;
                    zzgu zzguVar6 = zzicVar4.zzi;
                    zzic.zzP(zzguVar6);
                    zzguVar6.zzd.zza("Discarding data. Failed to send event to service to bundle");
                    zzpp zzppVar4 = zzicVar4.zzl;
                    zzic.zzN(zzppVar4);
                    zzppVar4.zzar(zzcsVar3, null);
                    return;
                case 15:
                    run$com$google$android$gms$measurement$internal$zznh();
                    return;
                case 16:
                    run$com$google$android$gms$measurement$internal$zzni();
                    return;
                case 17:
                    zzpg zzpgVar3 = (zzpg) ((Extras.Key) this.this$0).f61default;
                    zzpp zzt4 = zzpgVar3.zzt();
                    zzpgVar3.zzba().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (zzpgVar3.zzd().zzp(null, zzfy.zzbe)) {
                        zzpgVar3.zzba().getClass();
                        j = SystemClock.elapsedRealtime();
                    }
                    Bundle bundle3 = (Bundle) this.val$txtValue;
                    String str17 = (String) this.val$element;
                    String str18 = (String) this.val$cardNumber;
                    zzbh zzaf = zzt4.zzaf(str17, bundle3, "auto", currentTimeMillis, j, false);
                    zzae.checkNotNull(zzaf);
                    zzpgVar3.zzD(zzaf, str18);
                    return;
                default:
                    OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) this.val$cardNumber;
                    Function1 function1 = oldCheckRequestPermissionRationaleStateView.callback;
                    if (((Pi2CheckRequestPermissionRationaleStateBinding) this.val$element).rootView.isAttachedToWindow()) {
                        OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView2 = (OldCheckRequestPermissionRationaleStateView) this.val$txtValue;
                        if (oldCheckRequestPermissionRationaleStateView2.permission != Permission.RecordAudio || oldCheckRequestPermissionRationaleStateView2.isPermanentPermissionRejectionCheck) {
                            function1.invoke(Boolean.valueOf(ActivityCompat.shouldShowRequestPermissionRationale((AppCompatActivity) this.this$0, PermissionsStateKt.toPermissionString(oldCheckRequestPermissionRationaleStateView.permission))));
                            return;
                        } else {
                            function1.invoke(Boolean.TRUE);
                            return;
                        }
                    }
                    return;
            }
        }

        public /* synthetic */ AnonymousClass8(zzjd zzjdVar, String str, zzoo zzooVar, zzgh zzghVar) {
            this.$r8$classId = 9;
            this.val$element = zzjdVar;
            this.val$cardNumber = str;
            this.val$txtValue = zzooVar;
            this.this$0 = zzghVar;
        }

        public /* synthetic */ AnonymousClass8(Object obj, Object obj2, Enum r3, String str, int i) {
            this.$r8$classId = i;
            this.val$element = obj;
            this.val$txtValue = obj2;
            this.this$0 = r3;
            this.val$cardNumber = str;
        }

        public /* synthetic */ AnonymousClass8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$element = obj2;
            this.val$txtValue = obj3;
            this.val$cardNumber = obj4;
        }

        public /* synthetic */ AnonymousClass8(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
            this.$r8$classId = i;
            this.val$element = obj;
            this.val$txtValue = obj2;
            this.val$cardNumber = obj3;
            this.this$0 = obj4;
        }

        public AnonymousClass8(Extras.Key key, String str, String str2, Bundle bundle) {
            this.$r8$classId = 17;
            this.val$cardNumber = str;
            this.val$element = str2;
            this.val$txtValue = bundle;
            this.this$0 = key;
        }

        public AnonymousClass8(zzlj zzljVar, AtomicReference atomicReference, String str, String str2) {
            this.$r8$classId = 12;
            this.val$element = atomicReference;
            this.val$cardNumber = str;
            this.val$txtValue = str2;
            Objects.requireNonNull(zzljVar);
            this.this$0 = zzljVar;
        }

        public /* synthetic */ AnonymousClass8(int i, Object obj, Object obj2, Object obj3, String str) {
            this.$r8$classId = i;
            this.val$element = obj2;
            this.val$cardNumber = str;
            this.val$txtValue = obj3;
            this.this$0 = obj;
        }
    }
}
