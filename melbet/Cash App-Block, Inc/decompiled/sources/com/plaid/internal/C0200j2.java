package com.plaid.internal;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.link.LinkActivity;
import kotlin.Function;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0200j2 extends ViewModel {
    public final C0234n0 a;
    public final G2 b;
    public final InterfaceC0298u2 c;
    public final Z2 d;
    public final A2 e;
    public Job f;

    /* renamed from: com.plaid.internal.j2$a */
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ LinkActivity.b a;

        public a(LinkActivity.b bVar) {
            bVar.getClass();
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(this.a, ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public C0200j2(InterfaceC0092a3 interfaceC0092a3) {
        interfaceC0092a3.getClass();
        C0243o0 c0243o0 = (C0243o0) interfaceC0092a3;
        C0252p0 c0252p0 = c0243o0.a;
        C0234n0 c0234n0 = new C0234n0(c0252p0, c0243o0.b, new I1());
        this.b = (G2) c0234n0.d.get();
        this.c = (InterfaceC0298u2) c0234n0.n.get();
        this.d = (Z2) c0252p0.f.get();
        this.e = (A2) c0252p0.j.get();
        this.a = c0234n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0191i2 c0191i2;
        int i;
        if (continuationImpl instanceof C0191i2) {
            c0191i2 = (C0191i2) continuationImpl;
            int i2 = c0191i2.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0191i2.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0191i2.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0191i2.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InterfaceC0298u2 interfaceC0298u2 = this.c;
                    if (interfaceC0298u2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        throw null;
                    }
                    c0191i2.c = 1;
                    if (interfaceC0298u2.a(c0191i2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.TRUE;
            }
        }
        c0191i2 = new C0191i2(this, continuationImpl);
        Object obj2 = c0191i2.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0191i2.c;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }

    public final void a(D6 d6) {
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C0182h2(d6, this, null), 3);
    }
}
