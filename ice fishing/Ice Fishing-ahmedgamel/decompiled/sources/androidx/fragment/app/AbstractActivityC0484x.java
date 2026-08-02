package androidx.fragment.app;

import D.AbstractC0271a;
import D.InterfaceC0275e;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.EnumC0501o;
import d.InterfaceC4448b;
import h.AbstractActivityC4555k;
import i0.AbstractC4581a;
import i0.C4582b;
import i0.C4583c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0484x extends androidx.activity.p implements InterfaceC0275e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C0486z mFragments;
    boolean mResumed;
    final C0509x mFragmentLifecycleRegistry = new C0509x(this);
    boolean mStopped = true;

    public AbstractActivityC0484x() {
        final AbstractActivityC4555k abstractActivityC4555k = (AbstractActivityC4555k) this;
        this.mFragments = new C0486z(new C0483w(abstractActivityC4555k));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C0480t(0, abstractActivityC4555k));
        final int i = 0;
        addOnConfigurationChangedListener(new N.a() { // from class: androidx.fragment.app.u
            @Override // N.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        abstractActivityC4555k.mFragments.a();
                        break;
                    default:
                        abstractActivityC4555k.mFragments.a();
                        break;
                }
            }
        });
        final int i4 = 1;
        addOnNewIntentListener(new N.a() { // from class: androidx.fragment.app.u
            @Override // N.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        abstractActivityC4555k.mFragments.a();
                        break;
                    default:
                        abstractActivityC4555k.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC4448b() { // from class: androidx.fragment.app.v
            @Override // d.InterfaceC4448b
            public final void a(androidx.activity.p pVar) {
                C0483w c0483w = AbstractActivityC4555k.this.mFragments.f5052a;
                c0483w.f5044C.b(c0483w, c0483w, null);
            }
        });
    }

    public static boolean d(N n9) {
        boolean z6 = false;
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : n9.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null) {
                C0483w c0483w = abstractComponentCallbacksC0479s.f5006L;
                if ((c0483w == null ? null : c0483w.f5045D) != null) {
                    z6 |= d(abstractComponentCallbacksC0479s.c());
                }
                X x9 = abstractComponentCallbacksC0479s.f5026o0;
                EnumC0501o enumC0501o = EnumC0501o.f5134w;
                if (x9 != null) {
                    x9.b();
                    if (x9.f4889w.f5145d.compareTo(enumC0501o) >= 0) {
                        abstractComponentCallbacksC0479s.f5026o0.f4889w.g();
                        z6 = true;
                    }
                }
                if (abstractComponentCallbacksC0479s.f5025n0.f5145d.compareTo(enumC0501o) >= 0) {
                    abstractComponentCallbacksC0479s.f5025n0.g();
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f5052a.f5044C.f4823f.onCreateView(view, str, context, attributeSet);
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
                s.l lVar = ((C4582b) new b3.e(getViewModelStore(), C4582b.f38143b).u(C4582b.class)).f38144a;
                if (lVar.f40280v > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (lVar.f40280v > 0) {
                        if (lVar.f40279u[0] != null) {
                            throw new ClassCastException();
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(lVar.f40278n[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            this.mFragments.f5052a.f5044C.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public N getSupportFragmentManager() {
        return this.mFragments.f5052a.f5044C;
    }

    @Deprecated
    public AbstractC4581a getSupportLoaderManager() {
        return new C4583c(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i4, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
    }

    @Override // androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0500n.ON_CREATE);
        O o4 = this.mFragments.f5052a.f5044C;
        o4.f4810E = false;
        o4.f4811F = false;
        o4.f4816L.f4858f = false;
        o4.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f5052a.f5044C.k();
        this.mFragmentLifecycleRegistry.e(EnumC0500n.ON_DESTROY);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f5052a.f5044C.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f5052a.f5044C.t(5);
        this.mFragmentLifecycleRegistry.e(EnumC0500n.ON_PAUSE);
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
        this.mFragments.f5052a.f5044C.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0500n.ON_RESUME);
        O o4 = this.mFragments.f5052a.f5044C;
        o4.f4810E = false;
        o4.f4811F = false;
        o4.f4816L.f4858f = false;
        o4.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            O o4 = this.mFragments.f5052a.f5044C;
            o4.f4810E = false;
            o4.f4811F = false;
            o4.f4816L.f4858f = false;
            o4.t(4);
        }
        this.mFragments.f5052a.f5044C.x(true);
        this.mFragmentLifecycleRegistry.e(EnumC0500n.ON_START);
        O o6 = this.mFragments.f5052a.f5044C;
        o6.f4810E = false;
        o6.f4811F = false;
        o6.f4816L.f4858f = false;
        o6.t(5);
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
        O o4 = this.mFragments.f5052a.f5044C;
        o4.f4811F = true;
        o4.f4816L.f4858f = true;
        o4.t(4);
        this.mFragmentLifecycleRegistry.e(EnumC0500n.ON_STOP);
    }

    public void setEnterSharedElementCallback(D.O o4) {
        AbstractC0271a.c(this, null);
    }

    public void setExitSharedElementCallback(D.O o4) {
        AbstractC0271a.d(this, null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC0479s.f5006L == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0479s + " not attached to Activity");
        }
        N f2 = abstractComponentCallbacksC0479s.f();
        if (f2.f4842z != null) {
            f2.f4808C.addLast(new K(abstractComponentCallbacksC0479s.f5034x, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            f2.f4842z.a(intent);
            return;
        }
        C0483w c0483w = f2.f4836t;
        if (i == -1) {
            c0483w.f5042A.startActivity(intent, bundle);
        } else {
            c0483w.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, IntentSender intentSender, int i, Intent intent, int i4, int i6, int i9, Bundle bundle) {
        Intent intent2;
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i4, i6, i9, bundle);
            return;
        }
        if (abstractComponentCallbacksC0479s.f5006L == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0479s + " not attached to Activity");
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0479s + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        N f2 = abstractComponentCallbacksC0479s.f();
        if (f2.f4806A == null) {
            C0483w c0483w = f2.f4836t;
            if (i == -1) {
                c0483w.f5046z.startIntentSenderForResult(intentSender, i, intent, i4, i6, i9, bundle);
                return;
            } else {
                c0483w.getClass();
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
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC0479s);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        kotlin.jvm.internal.h.e(intentSender, "intentSender");
        e.j jVar = new e.j(intentSender, intent2, i4, i6);
        f2.f4808C.addLast(new K(abstractComponentCallbacksC0479s.f5034x, i));
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0479s + "is launching an IntentSender for result ");
        }
        f2.f4806A.a(jVar);
    }

    public void supportFinishAfterTransition() {
        AbstractC0271a.a(this);
    }

    public void supportPostponeEnterTransition() {
        AbstractC0271a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0271a.e(this);
    }

    @Override // D.InterfaceC0275e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC0479s, intent, i, (Bundle) null);
    }
}
