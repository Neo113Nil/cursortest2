package com.onesignal.core.internal.permissions;

import I7.p;
import N3.C;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import S7.o0;
import V7.k;
import V7.l;
import V7.n;
import X7.o;
import android.app.Activity;
import androidx.lifecycle.C0491e;
import androidx.lifecycle.S;
import kotlin.jvm.internal.i;
import u7.InterfaceC5079e;
import u7.v;
import w.AbstractC5128c;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class h extends S {
    public static final a Companion = new a(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private final k _shouldFinish;
    private final k _waiting;
    private String androidPermissionString;
    private String permissionRequestType;
    private final l shouldFinish;
    private final l waiting;
    private final InterfaceC5079e requestPermissionService$delegate = C.O(e.INSTANCE);
    private final InterfaceC5079e preferenceService$delegate = C.O(d.INSTANCE);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.initialize(null, null, null, this);
        }
    }

    public static final class c extends B7.h implements p {
        final /* synthetic */ int[] $grantResults;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ boolean $shouldShowRationaleAfter;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, int[] iArr, h hVar, boolean z6, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$permissions = strArr;
            this.$grantResults = iArr;
            this.this$0 = hVar;
            this.$shouldShowRationaleAfter = z6;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new c(this.$permissions, this.$grantResults, this.this$0, this.$shouldShowRationaleAfter, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            boolean z6;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                this.label = 1;
                if (AbstractC0410y.f(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            String[] strArr = this.$permissions;
            boolean z9 = false;
            if (strArr.length == 0) {
                z6 = false;
            } else {
                String str = strArr[0];
                int[] iArr = this.$grantResults;
                boolean z10 = !(iArr.length == 0) && iArr[0] == 0;
                if (z10) {
                    this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, AbstractC5128c.f("USER_RESOLVED_PERMISSION_", str), Boolean.TRUE);
                } else {
                    z9 = this.this$0.shouldShowSettings(str, this.$shouldShowRationaleAfter);
                }
                this.this$0.getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, AbstractC5128c.f("PROMPTED_PERMISSION_", str), Boolean.TRUE);
                z6 = z9;
                z9 = z10;
            }
            this.this$0.executeCallback(z9, z6);
            ((n) this.this$0._shouldFinish).F(Boolean.TRUE);
            return v.f41073a;
        }
    }

    public static final class d extends i implements I7.a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // I7.a
        public final J4.b invoke() {
            return (J4.b) p4.g.a().getService(J4.b.class);
        }
    }

    public static final class e extends i implements I7.a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.core.internal.permissions.impl.a invoke() {
            return (com.onesignal.core.internal.permissions.impl.a) p4.g.a().getService(com.onesignal.core.internal.permissions.impl.a.class);
        }
    }

    public h() {
        Boolean bool = Boolean.FALSE;
        n nVar = new n(bool);
        this._shouldFinish = nVar;
        this.shouldFinish = new n4.c(15, nVar);
        n nVar2 = new n(bool);
        this._waiting = nVar2;
        this.waiting = new n4.c(15, nVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeCallback(boolean z6, boolean z9) {
        v vVar;
        String str = this.permissionRequestType;
        if (str != null) {
            f callback = getRequestPermissionService().getCallback(str);
            if (callback == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: ".concat(str));
            }
            if (z6) {
                callback.onAccept();
            } else {
                callback.onReject(z9);
            }
            vVar = v.f41073a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            com.onesignal.debug.internal.logging.b.error$default("PermissionsViewModel: Cannot resolve callback because permissionRequestType is null. Ending permission flow.", null, 2, null);
            ((n) this._shouldFinish).F(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J4.b getPreferenceService() {
        return (J4.b) this.preferenceService$delegate.getValue();
    }

    private final com.onesignal.core.internal.permissions.impl.a getRequestPermissionService() {
        return (com.onesignal.core.internal.permissions.impl.a) this.requestPermissionService$delegate.getValue();
    }

    public static /* synthetic */ void onRequestPermissionsResult$default(h hVar, String[] strArr, int[] iArr, boolean z6, int i, Object obj) {
        if ((i & 4) != 0) {
            z6 = false;
        }
        hVar.onRequestPermissionsResult(strArr, iArr, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowSettings(String str, boolean z6) {
        if (!getRequestPermissionService().getFallbackToSettings()) {
            return false;
        }
        String f2 = AbstractC5128c.f("USER_RESOLVED_PERMISSION_", str);
        boolean shouldShowRequestPermissionRationaleBeforeRequest = getRequestPermissionService().getShouldShowRequestPermissionRationaleBeforeRequest();
        if (shouldShowRequestPermissionRationaleBeforeRequest && !z6) {
            getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f2, Boolean.TRUE);
            return false;
        }
        J4.b preferenceService = getPreferenceService();
        String f9 = AbstractC5128c.f("PROMPTED_PERMISSION_", str);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = preferenceService.getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f9, bool);
        if ((bool2 != null ? bool2.booleanValue() : false) && !shouldShowRequestPermissionRationaleBeforeRequest && !z6) {
            getPreferenceService().saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f2, Boolean.TRUE);
            return true;
        }
        Boolean bool3 = getPreferenceService().getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, f2, bool);
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        return false;
    }

    public final String getPermissionRequestType() {
        return this.permissionRequestType;
    }

    public final l getShouldFinish() {
        return this.shouldFinish;
    }

    public final l getWaiting() {
        return this.waiting;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(Activity activity, String str, String str2, InterfaceC5240d interfaceC5240d) {
        b bVar;
        Object obj;
        int i;
        h hVar;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                obj = bVar.result;
                A7.a aVar = A7.a.f215n;
                i = bVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = str;
                    bVar.L$2 = str2;
                    bVar.label = 1;
                    obj = p4.g.b(activity, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    hVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) bVar.L$2;
                    str = (String) bVar.L$1;
                    hVar = (h) bVar.L$0;
                    Q3.b.s(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ((n) hVar._shouldFinish).F(Boolean.TRUE);
                    return Boolean.FALSE;
                }
                if (str != null && str2 != null) {
                    hVar.permissionRequestType = str;
                    hVar.androidPermissionString = str2;
                    return Boolean.TRUE;
                }
                ((n) hVar._shouldFinish).F(Boolean.TRUE);
                return Boolean.FALSE;
            }
        }
        bVar = new b(interfaceC5240d);
        obj = bVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = bVar.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.lifecycle.S
    public void onCleared() {
    }

    public final void onRequestPermissionsResult(String[] permissions, int[] grantResults, boolean z6) {
        kotlin.jvm.internal.h.e(permissions, "permissions");
        kotlin.jvm.internal.h.e(grantResults, "grantResults");
        ((n) this._waiting).F(Boolean.FALSE);
        InterfaceC0408w interfaceC0408w = (InterfaceC0408w) getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC0408w == null) {
            o0 o0Var = new o0();
            Z7.e eVar = F.f2998a;
            Object tagIfAbsent = setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0491e(A8.b.t(o0Var, o.f3811a.f3217x)));
            kotlin.jvm.internal.h.d(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
            interfaceC0408w = (InterfaceC0408w) tagIfAbsent;
        }
        AbstractC0410y.o(interfaceC0408w, null, new c(permissions, grantResults, this, z6, null), 3);
    }

    public final void recordRationaleState(boolean z6) {
        getRequestPermissionService().setShouldShowRequestPermissionRationaleBeforeRequest(z6);
    }

    public final void resetWaitingState() {
        ((n) this._waiting).F(Boolean.FALSE);
    }

    public final boolean shouldRequestPermission() {
        if (((Boolean) ((n) this._waiting).E()).booleanValue()) {
            return false;
        }
        ((n) this._waiting).F(Boolean.TRUE);
        return true;
    }
}
