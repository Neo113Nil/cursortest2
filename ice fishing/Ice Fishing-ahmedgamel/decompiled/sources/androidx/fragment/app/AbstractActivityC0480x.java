package androidx.fragment.app;

import D.AbstractC0283b;
import D.InterfaceC0287f;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.EnumC0497o;
import d.InterfaceC4433b;
import h.AbstractActivityC4551k;
import i0.AbstractC4576a;
import i0.C4577b;
import i0.C4578c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0480x extends androidx.activity.p implements InterfaceC0287f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C0482z mFragments;
    boolean mResumed;
    final C0505x mFragmentLifecycleRegistry = new C0505x(this);
    boolean mStopped = true;

    public AbstractActivityC0480x() {
        final AbstractActivityC4551k abstractActivityC4551k = (AbstractActivityC4551k) this;
        this.mFragments = new C0482z(new C0479w(abstractActivityC4551k));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C0476t(0, abstractActivityC4551k));
        final int i = 0;
        addOnConfigurationChangedListener(new N.a() { // from class: androidx.fragment.app.u
            @Override // N.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        abstractActivityC4551k.mFragments.a();
                        break;
                    default:
                        abstractActivityC4551k.mFragments.a();
                        break;
                }
            }
        });
        final int i6 = 1;
        addOnNewIntentListener(new N.a() { // from class: androidx.fragment.app.u
            @Override // N.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        abstractActivityC4551k.mFragments.a();
                        break;
                    default:
                        abstractActivityC4551k.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC4433b() { // from class: androidx.fragment.app.v
            @Override // d.InterfaceC4433b
            public final void a(androidx.activity.p pVar) {
                C0479w c0479w = AbstractActivityC4551k.this.mFragments.f5085a;
                c0479w.f5078w.b(c0479w, c0479w, null);
            }
        });
    }

    public static boolean d(N n9) {
        boolean z3 = false;
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : n9.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null) {
                C0479w c0479w = abstractComponentCallbacksC0475s.f5038L;
                if ((c0479w == null ? null : c0479w.f5079x) != null) {
                    z3 |= d(abstractComponentCallbacksC0475s.c());
                }
                X x9 = abstractComponentCallbacksC0475s.f5059t0;
                EnumC0497o enumC0497o = EnumC0497o.f5167w;
                if (x9 != null) {
                    x9.b();
                    if (x9.f4921w.f5178d.compareTo(enumC0497o) >= 0) {
                        abstractComponentCallbacksC0475s.f5059t0.f4921w.g();
                        z3 = true;
                    }
                }
                if (abstractComponentCallbacksC0475s.f5058s0.f5178d.compareTo(enumC0497o) >= 0) {
                    abstractComponentCallbacksC0475s.f5058s0.g();
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f5085a.f5078w.f4855f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
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
                s.l lVar = ((C4577b) new Z2.e(getViewModelStore(), C4577b.f38026b).r(C4577b.class)).f38027a;
                if (lVar.f40444v > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (lVar.f40444v > 0) {
                        if (lVar.f40443u[0] != null) {
                            throw new ClassCastException();
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(lVar.f40442n[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            this.mFragments.f5085a.f5078w.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public N getSupportFragmentManager() {
        return this.mFragments.f5085a.f5078w;
    }

    @Deprecated
    public AbstractC4576a getSupportLoaderManager() {
        return new C4578c(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onActivityResult(int i, int i6, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i6, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
    }

    @Override // androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0496n.ON_CREATE);
        O o6 = this.mFragments.f5085a.f5078w;
        o6.f4842E = false;
        o6.f4843F = false;
        o6.f4848L.f4890f = false;
        o6.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f5085a.f5078w.k();
        this.mFragmentLifecycleRegistry.e(EnumC0496n.ON_DESTROY);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f5085a.f5078w.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f5085a.f5078w.t(5);
        this.mFragmentLifecycleRegistry.e(EnumC0496n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f5085a.f5078w.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0496n.ON_RESUME);
        O o6 = this.mFragments.f5085a.f5078w;
        o6.f4842E = false;
        o6.f4843F = false;
        o6.f4848L.f4890f = false;
        o6.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            O o6 = this.mFragments.f5085a.f5078w;
            o6.f4842E = false;
            o6.f4843F = false;
            o6.f4848L.f4890f = false;
            o6.t(4);
        }
        this.mFragments.f5085a.f5078w.x(true);
        this.mFragmentLifecycleRegistry.e(EnumC0496n.ON_START);
        O o9 = this.mFragments.f5085a.f5078w;
        o9.f4842E = false;
        o9.f4843F = false;
        o9.f4848L.f4890f = false;
        o9.t(5);
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
        O o6 = this.mFragments.f5085a.f5078w;
        o6.f4843F = true;
        o6.f4848L.f4890f = true;
        o6.t(4);
        this.mFragmentLifecycleRegistry.e(EnumC0496n.ON_STOP);
    }

    public void setEnterSharedElementCallback(D.P p9) {
        AbstractC0283b.c(this, null);
    }

    public void setExitSharedElementCallback(D.P p9) {
        AbstractC0283b.d(this, null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC0475s.f5038L == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0475s + " not attached to Activity");
        }
        N f3 = abstractComponentCallbacksC0475s.f();
        if (f3.f4874z != null) {
            f3.f4840C.addLast(new K(abstractComponentCallbacksC0475s.f5066x, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            f3.f4874z.a(intent);
            return;
        }
        C0479w c0479w = f3.f4868t;
        if (i == -1) {
            c0479w.f5076u.startActivity(intent, bundle);
        } else {
            c0479w.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, IntentSender intentSender, int i, Intent intent, int i6, int i9, int i10, Bundle bundle) {
        Intent intent2;
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i6, i9, i10, bundle);
            return;
        }
        if (abstractComponentCallbacksC0475s.f5038L == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0475s + " not attached to Activity");
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0475s + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        N f3 = abstractComponentCallbacksC0475s.f();
        if (f3.f4838A == null) {
            C0479w c0479w = f3.f4868t;
            if (i == -1) {
                c0479w.f5075n.startIntentSenderForResult(intentSender, i, intent, i6, i9, i10, bundle);
                return;
            } else {
                c0479w.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (N.E(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC0475s);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        kotlin.jvm.internal.h.e(intentSender, "intentSender");
        e.j jVar = new e.j(intentSender, intent2, i6, i9);
        f3.f4840C.addLast(new K(abstractComponentCallbacksC0475s.f5066x, i));
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0475s + "is launching an IntentSender for result ");
        }
        f3.f4838A.a(jVar);
    }

    public void supportFinishAfterTransition() {
        AbstractC0283b.a(this);
    }

    public void supportPostponeEnterTransition() {
        AbstractC0283b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0283b.e(this);
    }

    @Override // D.InterfaceC0287f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC0475s, intent, i, (Bundle) null);
    }
}
