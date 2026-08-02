package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import com.plaid.internal.C0217l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes5.dex */
public abstract class u8 extends ViewModel {
    public final r8 a;
    public final J4 b;
    public InterfaceC0298u2 c;
    public InterfaceC0338y6 d;
    public C0326x3 e;

    public u8(r8 r8Var, J4 j4) {
        r8Var.getClass();
        j4.getClass();
        this.a = r8Var;
        this.b = j4;
    }

    public final Object a(r8 r8Var, C0217l1.a aVar) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return JobKt.withContext(DefaultIoScheduler.INSTANCE, new s8(this, r8Var, null), aVar);
    }

    public final InterfaceC0338y6 b() {
        InterfaceC0338y6 interfaceC0338y6 = this.d;
        if (interfaceC0338y6 != null) {
            return interfaceC0338y6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paneStore");
        throw null;
    }

    public final C0326x3 a() {
        C0326x3 c0326x3 = this.e;
        if (c0326x3 != null) {
            return c0326x3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkWorkflowAnalytics");
        throw null;
    }
}
