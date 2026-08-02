package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.c1;
import defpackage.buc;
import defpackage.gzf;
import defpackage.hn5;
import defpackage.kyf;
import defpackage.lyf;
import defpackage.ntc;
import defpackage.rgg;
import defpackage.too;
import defpackage.vpj;
import defpackage.xa6;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class t extends hn5 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final gzf mFragmentLifecycleRegistry;
    final ntc mFragments;
    boolean mResumed;
    boolean mStopped;

    public t() {
        this.mFragments = new ntc(new s(this));
        this.mFragmentLifecycleRegistry = new gzf(this);
        this.mStopped = true;
        h();
    }

    public static boolean i(y yVar) {
        lyf lyfVar = lyf.c;
        boolean z = false;
        for (o oVar : yVar.c.f()) {
            if (oVar != null) {
                if (oVar.getHost() != null) {
                    z |= i(oVar.getChildFragmentManager());
                }
                d0 d0Var = oVar.mViewLifecycleOwner;
                if (d0Var != null) {
                    d0Var.b();
                    if (d0Var.e.d.compareTo(lyf.d) >= 0) {
                        oVar.mViewLifecycleOwner.e.i(lyfVar);
                        z = true;
                    }
                }
                if (oVar.mLifecycleRegistry.d.compareTo(lyf.d) >= 0) {
                    oVar.mLifecycleRegistry.i(lyfVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.a.d.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                rgg.a(this).b(str2, printWriter);
            }
            this.mFragments.a.d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public y getSupportFragmentManager() {
        return this.mFragments.a.d;
    }

    @NonNull
    @Deprecated
    public rgg getSupportLoaderManager() {
        return rgg.a(this);
    }

    public final void h() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new too() { // from class: androidx.fragment.app.p
            @Override // defpackage.too
            public final Bundle a() {
                t tVar = t.this;
                tVar.markFragmentsCreated();
                tVar.mFragmentLifecycleRegistry.g(kyf.ON_STOP);
                return new Bundle();
            }
        });
        final int i = 0;
        addOnConfigurationChangedListener(new xa6(this) { // from class: androidx.fragment.app.q
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.xa6
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.b.mFragments.a();
                        break;
                    default:
                        this.b.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new xa6(this) { // from class: androidx.fragment.app.q
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.xa6
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.mFragments.a();
                        break;
                    default:
                        this.b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new vpj() { // from class: androidx.fragment.app.r
            @Override // defpackage.vpj
            public final void a(hn5 hn5Var) {
                s sVar = t.this.mFragments.a;
                sVar.d.b(sVar, sVar, null);
            }
        });
    }

    public void markFragmentsCreated() {
        y supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            lyf lyfVar = lyf.a;
        } while (i(supportFragmentManager));
    }

    @Override // defpackage.hn5, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull o oVar) {
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.g(kyf.ON_CREATE);
        buc bucVar = this.mFragments.a.d;
        bucVar.J = false;
        bucVar.K = false;
        bucVar.Q.p = false;
        bucVar.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.d.l();
        this.mFragmentLifecycleRegistry.g(kyf.ON_DESTROY);
    }

    @Override // defpackage.hn5, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.d.u(5);
        this.mFragmentLifecycleRegistry.g(kyf.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.hn5, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.d.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.g(kyf.ON_RESUME);
        buc bucVar = this.mFragments.a.d;
        bucVar.J = false;
        bucVar.K = false;
        bucVar.Q.p = false;
        bucVar.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            buc bucVar = this.mFragments.a.d;
            bucVar.J = false;
            bucVar.K = false;
            bucVar.Q.p = false;
            bucVar.u(4);
        }
        this.mFragments.a.d.z(true);
        this.mFragmentLifecycleRegistry.g(kyf.ON_START);
        buc bucVar2 = this.mFragments.a.d;
        bucVar2.J = false;
        bucVar2.K = false;
        bucVar2.Q.p = false;
        bucVar2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        buc bucVar = this.mFragments.a.d;
        bucVar.K = true;
        bucVar.Q.p = true;
        bucVar.u(4);
        this.mFragmentLifecycleRegistry.g(kyf.ON_STOP);
    }

    public void setEnterSharedElementCallback(c1 c1Var) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(c1 c1Var) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(@NonNull o oVar, @NonNull Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            oVar.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull o oVar, @NonNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            oVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(@NonNull o oVar, @NonNull Intent intent, int i) {
        startActivityFromFragment(oVar, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public t(int i) {
        super(i);
        this.mFragments = new ntc(new s(this));
        this.mFragmentLifecycleRegistry = new gzf(this);
        this.mStopped = true;
        h();
    }
}
