package com.plaid.internal;

import androidx.core.os.BundleKt;
import com.plaid.internal.N2;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0341z0 {

    /* renamed from: com.plaid.internal.z0$a */
    public static final class a extends AbstractC0341z0 {
    }

    /* renamed from: com.plaid.internal.z0$b */
    public static final class b extends AbstractC0341z0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.z0$c */
    public static final class c extends AbstractC0341z0 {
        public final N2.i a;

        public c(N2.i iVar) {
            iVar.getClass();
            this.a = iVar;
        }

        public final N2.i a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.z0$d */
    public static final class d extends AbstractC0341z0 {
        public final LinkExit a;

        public d(LinkExit linkExit) {
            linkExit.getClass();
            this.a = linkExit;
        }

        public final LinkExit a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.z0$e */
    public static final class e extends AbstractC0341z0 {
        public static final e a = new e();
    }

    /* renamed from: com.plaid.internal.z0$f */
    public static final class f extends AbstractC0341z0 {
        public final String a;

        public f(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.z0$g */
    public static final class g extends AbstractC0341z0 {
        public final AbstractC0282s4 a;

        public g(AbstractC0282s4 abstractC0282s4) {
            abstractC0282s4.getClass();
            this.a = abstractC0282s4;
        }

        public final AbstractC0282s4 a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.z0$h */
    public static final class h extends AbstractC0341z0 {
        public h(String str, String str2, A a) {
            str.getClass();
            str2.getClass();
            a.getClass();
        }
    }

    /* renamed from: com.plaid.internal.z0$j */
    public static final class j extends AbstractC0341z0 {
        public final LinkSuccess a;

        public j(LinkSuccess linkSuccess) {
            linkSuccess.getClass();
            this.a = linkSuccess;
        }

        public final LinkSuccess a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.z0$k */
    public static final class k extends AbstractC0341z0 {
        public final EnumC0151d7 a;

        public k(String str, String str2, EnumC0151d7 enumC0151d7) {
            str.getClass();
            str2.getClass();
            enumC0151d7.getClass();
            this.a = enumC0151d7;
        }

        public final EnumC0151d7 a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.z0$i */
    public static abstract class i<F extends p8<?>> extends AbstractC0341z0 {
        public final a.C0056a a;

        /* renamed from: com.plaid.internal.z0$i$a */
        public static final class a extends i<C0208k1> {
            public final r8 b;

            /* renamed from: com.plaid.internal.z0$i$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0056a extends FunctionReferenceImpl implements Function1<r8, C0208k1> {
                public C0056a(q8 q8Var) {
                    super(1, 0, q8.class, q8Var, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;");
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    r8 r8Var = (r8) obj;
                    r8Var.getClass();
                    p8 p8Var = (p8) C0208k1.class.newInstance();
                    p8Var.getClass();
                    r8Var.getClass();
                    r8Var.getClass();
                    p8Var.setArguments(BundleKt.bundleOf(new Pair("workflow_pane_id", r8Var)));
                    return (C0208k1) p8Var;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r8 r8Var) {
                super(new C0056a(q8.a));
                r8Var.getClass();
                this.b = r8Var;
            }

            @Override // com.plaid.internal.AbstractC0341z0.i
            public final r8 b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "HeadlessOAuth(pane=" + this.b + ")";
            }
        }

        public i(a.C0056a c0056a) {
            this.a = c0056a;
        }

        public final Function1<r8, F> a() {
            return this.a;
        }

        public abstract r8 b();

        public i() {
            throw null;
        }
    }
}
