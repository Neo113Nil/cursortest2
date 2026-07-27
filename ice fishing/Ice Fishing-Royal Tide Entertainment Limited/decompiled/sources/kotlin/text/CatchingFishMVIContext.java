package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishMVIContext implements CatchingFishViewFlux {
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public final Object CatchingFishWorkManager;

    public CatchingFishMVIContext(Context context) {
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishWorkManager = context;
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishAnimationMockk(Object obj, CatchingFishMockkView catchingFishMockkView) {
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishAnimationMockk(obj, catchingFishMockkView);
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishCoroutine(Object obj) {
        this.CatchingFishDaggerWebsocket++;
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishCoroutine(obj);
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishDaggerWebsocket() {
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket();
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishFragmentHandler(int i, int i2) {
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishFragmentHandler(i + (this.CatchingFishDaggerWebsocket == 0 ? this.CatchingFishReduxKtor : 0), i2);
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public Object CatchingFishLayout() {
        return ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishLayout();
    }

    public synchronized int CatchingFishParcelableFAB() {
        PackageInfo packageInfo;
        if (this.CatchingFishReduxKtor == 0) {
            try {
                packageInfo = CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB((Context) this.CatchingFishWorkManager).CatchingFishParcelableFAB.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.CatchingFishReduxKtor = packageInfo.versionCode;
            }
        }
        return this.CatchingFishReduxKtor;
    }

    public synchronized int CatchingFishReduxKtor() {
        try {
            int i = this.CatchingFishDaggerWebsocket;
            if (i != 0) {
                return i;
            }
            Context context = (Context) this.CatchingFishWorkManager;
            PackageManager packageManager = context.getPackageManager();
            if (CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB(context).CatchingFishParcelableFAB.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i2 = 1;
            if (!CatchingFishHiltMVPToast.CatchingFishSpannableWidget()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    this.CatchingFishDaggerWebsocket = i2;
                    return i2;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                i2 = 2;
                this.CatchingFishDaggerWebsocket = i2;
                return i2;
            }
            if (true == CatchingFishHiltMVPToast.CatchingFishSpannableWidget()) {
                i2 = 2;
            }
            this.CatchingFishDaggerWebsocket = i2;
            return i2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishSnackbar(int i, Object obj) {
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishSnackbar(i + (this.CatchingFishDaggerWebsocket == 0 ? this.CatchingFishReduxKtor : 0), obj);
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishStateLiveData() {
        if (!(this.CatchingFishDaggerWebsocket > 0)) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("OffsetApplier up called with no corresponding down");
        }
        this.CatchingFishDaggerWebsocket--;
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishStateLiveData();
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishViewModelFAB(int i, int i2, int i3) {
        int i4 = this.CatchingFishDaggerWebsocket == 0 ? this.CatchingFishReduxKtor : 0;
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishViewModelFAB(i + i4, i2 + i4, i3);
    }

    @Override // kotlin.text.CatchingFishViewFlux
    public void CatchingFishViewModelScope(int i, Object obj) {
        ((CatchingFishViewFlux) this.CatchingFishWorkManager).CatchingFishViewModelScope(i + (this.CatchingFishDaggerWebsocket == 0 ? this.CatchingFishReduxKtor : 0), obj);
    }

    public CatchingFishMVIContext(View view) {
        this.CatchingFishWorkManager = view;
    }

    public CatchingFishMVIContext(Context context, XmlResourceParser xmlResourceParser) {
        this.CatchingFishWorkManager = new ArrayList();
        this.CatchingFishDaggerWebsocket = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), CatchingFishFluxAndroidX.CatchingFishViewModelFAB);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.CatchingFishReduxKtor = obtainStyledAttributes.getResourceId(index, this.CatchingFishReduxKtor);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.CatchingFishDaggerWebsocket);
                this.CatchingFishDaggerWebsocket = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new CatchingFishAnimationBundle().CatchingFishSnackbar((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public CatchingFishMVIContext() {
        this.CatchingFishWorkManager = new CatchingFishMVIContext[256];
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = 0;
    }

    public CatchingFishMVIContext(int i, int i2) {
        this.CatchingFishWorkManager = null;
        this.CatchingFishReduxKtor = i;
        int i3 = i2 & 7;
        this.CatchingFishDaggerWebsocket = i3 == 0 ? 8 : i3;
    }

    public CatchingFishMVIContext(CatchingFishViewFlux catchingFishViewFlux, int i) {
        this.CatchingFishWorkManager = catchingFishViewFlux;
        this.CatchingFishReduxKtor = i;
    }
}
