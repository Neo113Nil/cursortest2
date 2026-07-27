package kotlin.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishGradleLifecycle extends CatchingFishSharedFlowAdMob implements SubMenu {
    public final CatchingFishSharedFlowAdMob CatchingFishCardViewRealm;
    public final CatchingFishKtorAdMob CatchingFishPayPal;

    public CatchingFishGradleLifecycle(Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, CatchingFishKtorAdMob catchingFishKtorAdMob) {
        super(context);
        this.CatchingFishCardViewRealm = catchingFishSharedFlowAdMob;
        this.CatchingFishPayPal = catchingFishKtorAdMob;
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final boolean CatchingFishAnimationMockk() {
        return this.CatchingFishCardViewRealm.CatchingFishAnimationMockk();
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final CatchingFishSharedFlowAdMob CatchingFishCloudMessaging() {
        return this.CatchingFishCardViewRealm.CatchingFishCloudMessaging();
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final boolean CatchingFishDaggerWebsocket(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        return super.CatchingFishDaggerWebsocket(catchingFishSharedFlowAdMob, menuItem) || this.CatchingFishCardViewRealm.CatchingFishDaggerWebsocket(catchingFishSharedFlowAdMob, menuItem);
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final String CatchingFishFragmentHandler() {
        CatchingFishKtorAdMob catchingFishKtorAdMob = this.CatchingFishPayPal;
        int i = catchingFishKtorAdMob != null ? catchingFishKtorAdMob.CatchingFishParcelableFAB : 0;
        if (i == 0) {
            return null;
        }
        return CatchingFishMVPLiveData.CatchingFishCloudMessaging("android:menu:actionviewstates:", i);
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final boolean CatchingFishOkHttp() {
        return this.CatchingFishCardViewRealm.CatchingFishOkHttp();
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final boolean CatchingFishReduxKtor(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return this.CatchingFishCardViewRealm.CatchingFishReduxKtor(catchingFishKtorAdMob);
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final boolean CatchingFishUnitTesting() {
        return this.CatchingFishCardViewRealm.CatchingFishUnitTesting();
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob
    public final boolean CatchingFishWorkManager(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return this.CatchingFishCardViewRealm.CatchingFishWorkManager(catchingFishKtorAdMob);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.CatchingFishPayPal;
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.CatchingFishCardViewRealm.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        CatchingFishCoroutineFlow(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        CatchingFishCoroutineFlow(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        CatchingFishCoroutineFlow(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.CatchingFishPayPal.setIcon(drawable);
        return this;
    }

    @Override // kotlin.text.CatchingFishSharedFlowAdMob, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.CatchingFishCardViewRealm.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        CatchingFishCoroutineFlow(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        CatchingFishCoroutineFlow(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.CatchingFishPayPal.setIcon(i);
        return this;
    }
}
