package com.onesignal.core.activities;

import D.AbstractC0276f;
import D.G;
import E2.M;
import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import V7.l;
import W7.n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.p;
import androidx.lifecycle.L;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import com.onesignal.core.internal.permissions.h;
import h0.AbstractC4559b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import u7.InterfaceC5079e;
import u7.v;
import w.AbstractC5128c;
import w4.C5150a;
import z7.C5246j;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class PermissionsActivity extends p {
    private final InterfaceC5079e viewModel$delegate = new M(s.a(h.class), new f(this), new e(this), new g(null, this));

    public static final class a extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PermissionsActivity.this.handleBundleParams(null, this);
        }
    }

    public static final class b extends B7.h implements I7.p {
        int label;

        public static final class a extends B7.h implements I7.p {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PermissionsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PermissionsActivity permissionsActivity, InterfaceC5240d interfaceC5240d) {
                super(2, interfaceC5240d);
                this.this$0 = permissionsActivity;
            }

            @Override // B7.a
            public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
                a aVar = new a(this.this$0, interfaceC5240d);
                aVar.Z$0 = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // I7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC5240d) obj2);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                A7.a aVar = A7.a.f215n;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
                if (this.Z$0) {
                    this.this$0.finishActivity();
                }
                return v.f41073a;
            }

            public final Object invoke(boolean z6, InterfaceC5240d interfaceC5240d) {
                return ((a) create(Boolean.valueOf(z6), interfaceC5240d)).invokeSuspend(v.f41073a);
            }
        }

        public b(InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return PermissionsActivity.this.new b(interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            v vVar = v.f41073a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
                return vVar;
            }
            Q3.b.s(obj);
            l shouldFinish = PermissionsActivity.this.getViewModel().getShouldFinish();
            a aVar2 = new a(PermissionsActivity.this, null);
            this.label = 1;
            int i4 = V7.h.f3471a;
            V7.g gVar = new V7.g(aVar2, null);
            InterfaceC5245i interfaceC5245i = C5246j.f42241n;
            U7.a aVar3 = U7.a.f3342n;
            interfaceC5245i.n(interfaceC5245i);
            kotlin.jvm.internal.h.a(interfaceC5245i, interfaceC5245i);
            Object l9 = new G(gVar, shouldFinish, interfaceC5245i, 0, aVar3).l(n.f3609n, this);
            if (l9 != aVar) {
                l9 = vVar;
            }
            if (l9 != aVar) {
                l9 = vVar;
            }
            return l9 == aVar ? aVar : vVar;
        }
    }

    public static final class c extends B7.h implements I7.p {
        int label;

        public c(InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return PermissionsActivity.this.new c(interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                if (PermissionsActivity.this.getViewModel().getPermissionRequestType() == null) {
                    PermissionsActivity permissionsActivity = PermissionsActivity.this;
                    Bundle extras = permissionsActivity.getIntent().getExtras();
                    this.label = 1;
                    if (permissionsActivity.handleBundleParams(extras, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }
    }

    public static final class d extends B7.h implements I7.p {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$intent = intent;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return PermissionsActivity.this.new d(this.$intent, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((d) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                PermissionsActivity permissionsActivity = PermissionsActivity.this;
                Bundle extras = this.$intent.getExtras();
                this.label = 1;
                if (permissionsActivity.handleBundleParams(extras, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }
    }

    public static final class e extends i implements I7.a {
        final /* synthetic */ p $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p pVar) {
            super(0);
            this.$this_viewModels = pVar;
        }

        @Override // I7.a
        public final V invoke() {
            V defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.h.d(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class f extends i implements I7.a {
        final /* synthetic */ p $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p pVar) {
            super(0);
            this.$this_viewModels = pVar;
        }

        @Override // I7.a
        public final X invoke() {
            X viewModelStore = this.$this_viewModels.getViewModelStore();
            kotlin.jvm.internal.h.d(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public static final class g extends i implements I7.a {
        final /* synthetic */ I7.a $extrasProducer;
        final /* synthetic */ p $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(I7.a aVar, p pVar) {
            super(0);
            this.$extrasProducer = aVar;
            this.$this_viewModels = pVar;
        }

        @Override // I7.a
        public final AbstractC4559b invoke() {
            AbstractC4559b abstractC4559b;
            I7.a aVar = this.$extrasProducer;
            if (aVar != null && (abstractC4559b = (AbstractC4559b) aVar.invoke()) != null) {
                return abstractC4559b;
            }
            AbstractC4559b defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.h.d(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivity() {
        finish();
        overridePendingTransition(C5150a.onesignal_fade_in, C5150a.onesignal_fade_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getViewModel() {
        return (h) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBundleParams(Bundle bundle, InterfaceC5240d interfaceC5240d) {
        a aVar;
        Object obj;
        int i;
        String string;
        PermissionsActivity permissionsActivity;
        if (interfaceC5240d instanceof a) {
            aVar = (a) interfaceC5240d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                obj = aVar.result;
                A7.a aVar2 = A7.a.f215n;
                i = aVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    if (bundle != null) {
                        reregisterCallbackHandlers(bundle);
                        String string2 = bundle.getString(h.INTENT_EXTRA_PERMISSION_TYPE);
                        string = bundle.getString(h.INTENT_EXTRA_ANDROID_PERMISSION_STRING);
                        h viewModel = getViewModel();
                        aVar.L$0 = this;
                        aVar.L$1 = string;
                        aVar.label = 1;
                        obj = viewModel.initialize(this, string2, string, aVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        permissionsActivity = this;
                    }
                    return v.f41073a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                string = (String) aVar.L$1;
                permissionsActivity = (PermissionsActivity) aVar.L$0;
                Q3.b.s(obj);
                if (((Boolean) obj).booleanValue()) {
                    permissionsActivity.finishActivity();
                } else if (string != null) {
                    permissionsActivity.requestPermission(string);
                }
                return v.f41073a;
            }
        }
        aVar = new a(interfaceC5240d);
        obj = aVar.result;
        A7.a aVar22 = A7.a.f215n;
        i = aVar.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return v.f41073a;
    }

    private final void requestPermission(String str) {
        if (getViewModel().shouldRequestPermission()) {
            getViewModel().recordRationaleState(AbstractC0276f.e(this, str));
            AbstractC0276f.d(this, new String[]{str}, 2);
        }
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        kotlin.jvm.internal.h.b(bundle);
        String string = bundle.getString(h.INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(AbstractC5128c.f("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            finishActivity();
        } else {
            AbstractC0410y.o(L.e(this), null, new b(null), 3);
            AbstractC0410y.o(L.e(this), null, new c(null), 3);
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.onNewIntent(intent);
        AbstractC0410y.o(L.e(this), null, new d(intent, null), 3);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModel().resetWaitingState();
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.h.e(permissions, "permissions");
        kotlin.jvm.internal.h.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        if (i == 2) {
            getViewModel().onRequestPermissionsResult(permissions, grantResults, permissions.length != 0 ? AbstractC0276f.e(this, permissions[0]) : false);
        }
    }
}
