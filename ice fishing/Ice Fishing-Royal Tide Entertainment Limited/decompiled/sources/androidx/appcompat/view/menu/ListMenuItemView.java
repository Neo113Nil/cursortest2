package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishKtorAdMob;
import kotlin.text.CatchingFishSharedFlowAdMob;
import kotlin.text.CatchingFishWidgetGlide;
import kotlin.text.CatchingFishWidgetStateFlow;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements CatchingFishWidgetStateFlow, AbsListView.SelectionBoundsAdjuster {
    public LayoutInflater CatchingFish;
    public final Context CatchingFishAnimationMockk;
    public ImageView CatchingFishCloudMessaging;
    public ImageView CatchingFishDaggerWebsocket;
    public LinearLayout CatchingFishEspressoTesting;
    public ImageView CatchingFishFragmentHandler;
    public boolean CatchingFishJetpackCompose;
    public TextView CatchingFishLayout;
    public final boolean CatchingFishNavigation;
    public final Drawable CatchingFishOkHttp;
    public CatchingFishKtorAdMob CatchingFishReduxKtor;
    public final Drawable CatchingFishRoomDatabase;
    public boolean CatchingFishStateLiveData;
    public final int CatchingFishUnitTesting;
    public CheckBox CatchingFishViewModelFAB;
    public TextView CatchingFishViewModelScope;
    public RadioButton CatchingFishWorkManager;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(getContext(), attributeSet, CatchingFishWidgetGlide.CatchingFishNavigation, R.attr.listMenuViewStyle);
        this.CatchingFishOkHttp = CatchingFishRecyclerView.CatchingFishMutableLiveData(5);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        this.CatchingFishUnitTesting = typedArray.getResourceId(1, -1);
        this.CatchingFishStateLiveData = typedArray.getBoolean(7, false);
        this.CatchingFishAnimationMockk = context;
        this.CatchingFishRoomDatabase = CatchingFishRecyclerView.CatchingFishMutableLiveData(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.CatchingFishNavigation = obtainStyledAttributes.hasValue(0);
        CatchingFishRecyclerView.CatchingFishAnimation();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.CatchingFish == null) {
            this.CatchingFish = LayoutInflater.from(getContext());
        }
        return this.CatchingFish;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.CatchingFishFragmentHandler;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // kotlin.text.CatchingFishWidgetStateFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishParcelableFAB(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        boolean z;
        String sb;
        boolean z2;
        this.CatchingFishReduxKtor = catchingFishKtorAdMob;
        int i = 0;
        setVisibility(catchingFishKtorAdMob.isVisible() ? 0 : 8);
        setTitle(catchingFishKtorAdMob.CatchingFishDaggerWebsocket);
        setCheckable(catchingFishKtorAdMob.isCheckable());
        if (catchingFishKtorAdMob.CatchingFishUnitTesting.CatchingFishAnimationMockk()) {
            if ((catchingFishKtorAdMob.CatchingFishUnitTesting.CatchingFishUnitTesting() ? catchingFishKtorAdMob.CatchingFishFragmentHandler : catchingFishKtorAdMob.CatchingFishViewModelFAB) != 0) {
                z = true;
                catchingFishKtorAdMob.CatchingFishUnitTesting.CatchingFishUnitTesting();
                if (z) {
                    CatchingFishKtorAdMob catchingFishKtorAdMob2 = this.CatchingFishReduxKtor;
                    if (catchingFishKtorAdMob2.CatchingFishUnitTesting.CatchingFishAnimationMockk()) {
                        if ((catchingFishKtorAdMob2.CatchingFishUnitTesting.CatchingFishUnitTesting() ? catchingFishKtorAdMob2.CatchingFishFragmentHandler : catchingFishKtorAdMob2.CatchingFishViewModelFAB) != 0) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.CatchingFishLayout;
                    CatchingFishKtorAdMob catchingFishKtorAdMob3 = this.CatchingFishReduxKtor;
                    CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishKtorAdMob3.CatchingFishUnitTesting;
                    Context context = catchingFishSharedFlowAdMob.CatchingFishParcelableFAB;
                    char c = catchingFishSharedFlowAdMob.CatchingFishUnitTesting() ? catchingFishKtorAdMob3.CatchingFishFragmentHandler : catchingFishKtorAdMob3.CatchingFishViewModelFAB;
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = catchingFishSharedFlowAdMob.CatchingFishUnitTesting() ? catchingFishKtorAdMob3.CatchingFishCloudMessaging : catchingFishKtorAdMob3.CatchingFishLayout;
                        CatchingFishKtorAdMob.CatchingFishCoroutine(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        CatchingFishKtorAdMob.CatchingFishCoroutine(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        CatchingFishKtorAdMob.CatchingFishCoroutine(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        CatchingFishKtorAdMob.CatchingFishCoroutine(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        CatchingFishKtorAdMob.CatchingFishCoroutine(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        CatchingFishKtorAdMob.CatchingFishCoroutine(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.CatchingFishLayout.getVisibility() != i) {
                    this.CatchingFishLayout.setVisibility(i);
                }
                setIcon(catchingFishKtorAdMob.getIcon());
                setEnabled(catchingFishKtorAdMob.isEnabled());
                setSubMenuArrowVisible(catchingFishKtorAdMob.hasSubMenu());
                setContentDescription(catchingFishKtorAdMob.CatchingFishRoomDatabase);
            }
        }
        z = false;
        catchingFishKtorAdMob.CatchingFishUnitTesting.CatchingFishUnitTesting();
        if (z) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.CatchingFishLayout.getVisibility() != i) {
        }
        setIcon(catchingFishKtorAdMob.getIcon());
        setEnabled(catchingFishKtorAdMob.isEnabled());
        setSubMenuArrowVisible(catchingFishKtorAdMob.hasSubMenu());
        setContentDescription(catchingFishKtorAdMob.CatchingFishRoomDatabase);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.CatchingFishCloudMessaging;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.CatchingFishCloudMessaging.getLayoutParams();
        rect.top = this.CatchingFishCloudMessaging.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // kotlin.text.CatchingFishWidgetStateFlow
    public CatchingFishKtorAdMob getItemData() {
        return this.CatchingFishReduxKtor;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.CatchingFishOkHttp);
        TextView textView = (TextView) findViewById(R.id.title);
        this.CatchingFishViewModelScope = textView;
        int i = this.CatchingFishUnitTesting;
        if (i != -1) {
            textView.setTextAppearance(this.CatchingFishAnimationMockk, i);
        }
        this.CatchingFishLayout = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.CatchingFishFragmentHandler = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.CatchingFishRoomDatabase);
        }
        this.CatchingFishCloudMessaging = (ImageView) findViewById(R.id.group_divider);
        this.CatchingFishEspressoTesting = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.CatchingFishDaggerWebsocket != null && this.CatchingFishStateLiveData) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.CatchingFishDaggerWebsocket.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.CatchingFishWorkManager == null && this.CatchingFishViewModelFAB == null) {
            return;
        }
        if ((this.CatchingFishReduxKtor.CatchingFishParcelableFlux & 4) != 0) {
            if (this.CatchingFishWorkManager == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.CatchingFishWorkManager = radioButton;
                LinearLayout linearLayout = this.CatchingFishEspressoTesting;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.CatchingFishWorkManager;
            view = this.CatchingFishViewModelFAB;
        } else {
            if (this.CatchingFishViewModelFAB == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.CatchingFishViewModelFAB = checkBox;
                LinearLayout linearLayout2 = this.CatchingFishEspressoTesting;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.CatchingFishViewModelFAB;
            view = this.CatchingFishWorkManager;
        }
        if (z) {
            compoundButton.setChecked(this.CatchingFishReduxKtor.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.CatchingFishViewModelFAB;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.CatchingFishWorkManager;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.CatchingFishReduxKtor.CatchingFishParcelableFlux & 4) != 0) {
            if (this.CatchingFishWorkManager == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.CatchingFishWorkManager = radioButton;
                LinearLayout linearLayout = this.CatchingFishEspressoTesting;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.CatchingFishWorkManager;
        } else {
            if (this.CatchingFishViewModelFAB == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.CatchingFishViewModelFAB = checkBox;
                LinearLayout linearLayout2 = this.CatchingFishEspressoTesting;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.CatchingFishViewModelFAB;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.CatchingFishJetpackCompose = z;
        this.CatchingFishStateLiveData = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.CatchingFishCloudMessaging;
        if (imageView != null) {
            imageView.setVisibility((this.CatchingFishNavigation || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishReduxKtor.CatchingFishUnitTesting;
        boolean z = this.CatchingFishJetpackCompose;
        if (z || this.CatchingFishStateLiveData) {
            ImageView imageView = this.CatchingFishDaggerWebsocket;
            if (imageView == null && drawable == null && !this.CatchingFishStateLiveData) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.CatchingFishDaggerWebsocket = imageView2;
                LinearLayout linearLayout = this.CatchingFishEspressoTesting;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.CatchingFishStateLiveData) {
                this.CatchingFishDaggerWebsocket.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.CatchingFishDaggerWebsocket;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.CatchingFishDaggerWebsocket.getVisibility() != 0) {
                this.CatchingFishDaggerWebsocket.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.CatchingFishViewModelScope.getVisibility() != 8) {
                this.CatchingFishViewModelScope.setVisibility(8);
            }
        } else {
            this.CatchingFishViewModelScope.setText(charSequence);
            if (this.CatchingFishViewModelScope.getVisibility() != 0) {
                this.CatchingFishViewModelScope.setVisibility(0);
            }
        }
    }
}
