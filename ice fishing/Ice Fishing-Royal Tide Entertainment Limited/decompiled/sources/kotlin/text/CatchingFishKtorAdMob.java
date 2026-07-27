package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishKtorAdMob implements CatchingFishGlideSpannable {
    public CatchingFishGradleLifecycle CatchingFishAnimationMockk;
    public View CatchingFishCardViewRealm;
    public MenuItem.OnActionExpandListener CatchingFishCardViewView;
    public final int CatchingFishCoroutine;
    public CharSequence CatchingFishDaggerWebsocket;
    public Drawable CatchingFishEspressoTesting;
    public char CatchingFishFragmentHandler;
    public int CatchingFishGsonAppCompat;
    public CharSequence CatchingFishNavigation;
    public final int CatchingFishParcelableFAB;
    public CatchingFishJUnitAdMobKtor CatchingFishPayPal;
    public final int CatchingFishReduxKtor;
    public CharSequence CatchingFishRoomDatabase;
    public final int CatchingFishSnackbar;
    public MenuItem.OnMenuItemClickListener CatchingFishStateLiveData;
    public final CatchingFishSharedFlowAdMob CatchingFishUnitTesting;
    public char CatchingFishViewModelFAB;
    public Intent CatchingFishViewModelScope;
    public CharSequence CatchingFishWorkManager;
    public int CatchingFishLayout = 4096;
    public int CatchingFishCloudMessaging = 4096;
    public int CatchingFishOkHttp = 0;
    public ColorStateList CatchingFish = null;
    public PorterDuff.Mode CatchingFishJetpackCompose = null;
    public boolean CatchingFishCoroutineFlow = false;
    public boolean CatchingFishDaggerHiltFAB = false;
    public boolean CatchingFishSpannableWidget = false;
    public int CatchingFishParcelableFlux = 16;
    public boolean CatchingFishMVPRobolectric = false;

    public CatchingFishKtorAdMob(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.CatchingFishUnitTesting = catchingFishSharedFlowAdMob;
        this.CatchingFishParcelableFAB = i2;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = i3;
        this.CatchingFishReduxKtor = i4;
        this.CatchingFishDaggerWebsocket = charSequence;
        this.CatchingFishGsonAppCompat = i5;
    }

    public static void CatchingFishCoroutine(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final boolean CatchingFishDaggerWebsocket() {
        CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor;
        if ((this.CatchingFishGsonAppCompat & 8) != 0) {
            if (this.CatchingFishCardViewRealm == null && (catchingFishJUnitAdMobKtor = this.CatchingFishPayPal) != null) {
                this.CatchingFishCardViewRealm = catchingFishJUnitAdMobKtor.CatchingFishSnackbar.onCreateActionView(this);
            }
            if (this.CatchingFishCardViewRealm != null) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable
    public final CatchingFishJUnitAdMobKtor CatchingFishParcelableFAB() {
        return this.CatchingFishPayPal;
    }

    public final Drawable CatchingFishReduxKtor(Drawable drawable) {
        if (drawable != null && this.CatchingFishSpannableWidget && (this.CatchingFishCoroutineFlow || this.CatchingFishDaggerHiltFAB)) {
            drawable = drawable.mutate();
            if (this.CatchingFishCoroutineFlow) {
                drawable.setTintList(this.CatchingFish);
            }
            if (this.CatchingFishDaggerHiltFAB) {
                drawable.setTintMode(this.CatchingFishJetpackCompose);
            }
            this.CatchingFishSpannableWidget = false;
        }
        return drawable;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable
    public final CatchingFishGlideSpannable CatchingFishSnackbar(CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor) {
        this.CatchingFishCardViewRealm = null;
        this.CatchingFishPayPal = catchingFishJUnitAdMobKtor;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(true);
        CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor2 = this.CatchingFishPayPal;
        if (catchingFishJUnitAdMobKtor2 != null) {
            catchingFishJUnitAdMobKtor2.CatchingFishParcelableFAB = new CatchingFishViewPagerMockk(19, this);
            catchingFishJUnitAdMobKtor2.CatchingFishSnackbar.setVisibilityListener(catchingFishJUnitAdMobKtor2);
        }
        return this;
    }

    public final void CatchingFishWorkManager(boolean z) {
        if (z) {
            this.CatchingFishParcelableFlux |= 32;
        } else {
            this.CatchingFishParcelableFlux &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.CatchingFishGsonAppCompat & 8) == 0) {
            return false;
        }
        if (this.CatchingFishCardViewRealm == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.CatchingFishCardViewView;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.CatchingFishUnitTesting.CatchingFishReduxKtor(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!CatchingFishDaggerWebsocket()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.CatchingFishCardViewView;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.CatchingFishUnitTesting.CatchingFishWorkManager(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.CatchingFishCardViewRealm;
        if (view != null) {
            return view;
        }
        CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor = this.CatchingFishPayPal;
        if (catchingFishJUnitAdMobKtor == null) {
            return null;
        }
        View onCreateActionView = catchingFishJUnitAdMobKtor.CatchingFishSnackbar.onCreateActionView(this);
        this.CatchingFishCardViewRealm = onCreateActionView;
        return onCreateActionView;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.CatchingFishCloudMessaging;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.CatchingFishFragmentHandler;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.CatchingFishRoomDatabase;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.CatchingFishSnackbar;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.CatchingFishEspressoTesting;
        if (drawable != null) {
            return CatchingFishReduxKtor(drawable);
        }
        int i = this.CatchingFishOkHttp;
        if (i == 0) {
            return null;
        }
        Drawable CatchingFishCustomView = CatchingFishLayoutRoomFAB.CatchingFishCustomView(this.CatchingFishUnitTesting.CatchingFishParcelableFAB, i);
        this.CatchingFishOkHttp = 0;
        this.CatchingFishEspressoTesting = CatchingFishCustomView;
        return CatchingFishReduxKtor(CatchingFishCustomView);
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.CatchingFish;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.CatchingFishJetpackCompose;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.CatchingFishViewModelScope;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.CatchingFishParcelableFAB;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.CatchingFishLayout;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.CatchingFishViewModelFAB;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.CatchingFishCoroutine;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.CatchingFishAnimationMockk;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.CatchingFishWorkManager;
        return charSequence != null ? charSequence : this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.CatchingFishNavigation;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.CatchingFishAnimationMockk != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.CatchingFishMVPRobolectric;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.CatchingFishParcelableFlux & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.CatchingFishParcelableFlux & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.CatchingFishParcelableFlux & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor = this.CatchingFishPayPal;
        return (catchingFishJUnitAdMobKtor == null || !catchingFishJUnitAdMobKtor.CatchingFishSnackbar.overridesItemVisibility()) ? (this.CatchingFishParcelableFlux & 8) == 0 : (this.CatchingFishParcelableFlux & 8) == 0 && this.CatchingFishPayPal.CatchingFishSnackbar.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.CatchingFishCardViewRealm = view;
        this.CatchingFishPayPal = null;
        if (view != null && view.getId() == -1 && (i = this.CatchingFishParcelableFAB) > 0) {
            view.setId(i);
        }
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishUnitTesting;
        catchingFishSharedFlowAdMob.CatchingFishCloudMessaging = true;
        catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.CatchingFishFragmentHandler == c) {
            return this;
        }
        this.CatchingFishFragmentHandler = Character.toLowerCase(c);
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.CatchingFishParcelableFlux;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.CatchingFishParcelableFlux = i2;
        if (i != i2) {
            this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.CatchingFishParcelableFlux;
        if ((i & 4) == 0) {
            int i2 = (i & (-3)) | (z ? 2 : 0);
            this.CatchingFishParcelableFlux = i2;
            if (i != i2) {
                this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
            }
            return this;
        }
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishUnitTesting;
        ArrayList arrayList = catchingFishSharedFlowAdMob.CatchingFishWorkManager;
        int size = arrayList.size();
        catchingFishSharedFlowAdMob.CatchingFishSpannableWidget();
        for (int i3 = 0; i3 < size; i3++) {
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i3);
            if (catchingFishKtorAdMob.CatchingFishSnackbar == this.CatchingFishSnackbar && (catchingFishKtorAdMob.CatchingFishParcelableFlux & 4) != 0 && catchingFishKtorAdMob.isCheckable()) {
                boolean z2 = catchingFishKtorAdMob == this;
                int i4 = catchingFishKtorAdMob.CatchingFishParcelableFlux;
                int i5 = (z2 ? 2 : 0) | (i4 & (-3));
                catchingFishKtorAdMob.CatchingFishParcelableFlux = i5;
                if (i4 != i5) {
                    catchingFishKtorAdMob.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
                }
            }
        }
        catchingFishSharedFlowAdMob.CatchingFishDaggerHiltFAB();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.CatchingFishParcelableFlux |= 16;
        } else {
            this.CatchingFishParcelableFlux &= -17;
        }
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.CatchingFishOkHttp = 0;
        this.CatchingFishEspressoTesting = drawable;
        this.CatchingFishSpannableWidget = true;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.CatchingFish = colorStateList;
        this.CatchingFishCoroutineFlow = true;
        this.CatchingFishSpannableWidget = true;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.CatchingFishJetpackCompose = mode;
        this.CatchingFishDaggerHiltFAB = true;
        this.CatchingFishSpannableWidget = true;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.CatchingFishViewModelScope = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.CatchingFishViewModelFAB == c) {
            return this;
        }
        this.CatchingFishViewModelFAB = c;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.CatchingFishCardViewView = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.CatchingFishStateLiveData = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.CatchingFishViewModelFAB = c;
        this.CatchingFishFragmentHandler = Character.toLowerCase(c2);
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.CatchingFishGsonAppCompat = i;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishUnitTesting;
        catchingFishSharedFlowAdMob.CatchingFishCloudMessaging = true;
        catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.CatchingFishDaggerWebsocket = charSequence;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        CatchingFishGradleLifecycle catchingFishGradleLifecycle = this.CatchingFishAnimationMockk;
        if (catchingFishGradleLifecycle != null) {
            catchingFishGradleLifecycle.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.CatchingFishWorkManager = charSequence;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.CatchingFishParcelableFlux;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.CatchingFishParcelableFlux = i2;
        if (i != i2) {
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishUnitTesting;
            catchingFishSharedFlowAdMob.CatchingFishViewModelFAB = true;
            catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.CatchingFishDaggerWebsocket;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CatchingFishGlideSpannable setContentDescription(CharSequence charSequence) {
        this.CatchingFishRoomDatabase = charSequence;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CatchingFishGlideSpannable setTooltipText(CharSequence charSequence) {
        this.CatchingFishNavigation = charSequence;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.CatchingFishFragmentHandler == c && this.CatchingFishCloudMessaging == i) {
            return this;
        }
        this.CatchingFishFragmentHandler = Character.toLowerCase(c);
        this.CatchingFishCloudMessaging = KeyEvent.normalizeMetaState(i);
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.CatchingFishViewModelFAB == c && this.CatchingFishLayout == i) {
            return this;
        }
        this.CatchingFishViewModelFAB = c;
        this.CatchingFishLayout = KeyEvent.normalizeMetaState(i);
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.CatchingFishViewModelFAB = c;
        this.CatchingFishLayout = KeyEvent.normalizeMetaState(i);
        this.CatchingFishFragmentHandler = Character.toLowerCase(c2);
        this.CatchingFishCloudMessaging = KeyEvent.normalizeMetaState(i2);
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.CatchingFishEspressoTesting = null;
        this.CatchingFishOkHttp = i;
        this.CatchingFishSpannableWidget = true;
        this.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.CatchingFishUnitTesting.CatchingFishParcelableFAB.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.CatchingFishUnitTesting.CatchingFishParcelableFAB;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.CatchingFishCardViewRealm = inflate;
        this.CatchingFishPayPal = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.CatchingFishParcelableFAB) > 0) {
            inflate.setId(i2);
        }
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishUnitTesting;
        catchingFishSharedFlowAdMob.CatchingFishCloudMessaging = true;
        catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
        return this;
    }
}
