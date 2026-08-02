package ru.yandex.taxi.messenger.notification;

import com.yandex.go.messenger_native.d;
import com.yandex.messenger.websdk.api.Notification;
import com.yandex.messenger.websdk.api.WebMessenger;
import defpackage.h3y;
import defpackage.i120;
import defpackage.ny61;
import defpackage.rs2;
import defpackage.s350;
import defpackage.sls;
import defpackage.w511;
import defpackage.x020;
import defpackage.x320;
import defpackage.xww0;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;
import ru.yandex.taxi.messenger.notification.a;

/* loaded from: classes6.dex */
public final class a implements xww0 {
    public final h3y a;
    public final x020 b;
    public final rs2 c;
    public final i120 d;
    public final s350 e;
    public final d f;

    public a(h3y h3yVar, x020 x020Var, rs2 rs2Var, i120 i120Var, s350 s350Var, d dVar) {
        this.a = h3yVar;
        this.b = x020Var;
        this.c = rs2Var;
        this.d = i120Var;
        this.e = s350Var;
        this.f = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
    
        if (r11 == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
    
        if (r11 == r1) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(final Map map, ContinuationImpl continuationImpl) {
        MessengerPushHandler$handle$1 messengerPushHandler$handle$1;
        int i;
        String str;
        MessengerChatOwner messengerChatOwner;
        if (continuationImpl instanceof MessengerPushHandler$handle$1) {
            messengerPushHandler$handle$1 = (MessengerPushHandler$handle$1) continuationImpl;
            int i2 = messengerPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerPushHandler$handle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerPushHandler$handle$1.label;
                d dVar = this.f;
                final int i3 = 2;
                final int i4 = 1;
                switch (i) {
                    case 0:
                        b.b(obj);
                        String str2 = (String) map.get("messenger");
                        if (str2 == null) {
                            return Boolean.FALSE;
                        }
                        JSONObject jSONObject = new JSONObject(str2);
                        if (!jSONObject.has("Chat") || (str = jSONObject.getString("Chat")) == null || str.length() == 0) {
                            str = null;
                        }
                        if (str == null) {
                            return Boolean.FALSE;
                        }
                        MessengerChatOwner a = this.b.a(str);
                        int i5 = a == null ? -1 : x320.a[a.ordinal()];
                        if (i5 == -1) {
                            messengerChatOwner = null;
                        } else if (i5 == 1) {
                            messengerChatOwner = MessengerChatOwner.DELIVERY;
                        } else if (i5 == 2) {
                            messengerChatOwner = MessengerChatOwner.TAXI_ORDER;
                        } else {
                            if (i5 != 3) {
                                w511.b();
                                return null;
                            }
                            this.c.getClass();
                            messengerChatOwner = MessengerChatOwner.MARKETPLACE;
                        }
                        int i6 = messengerChatOwner == null ? -1 : x320.a[messengerChatOwner.ordinal()];
                        if (i6 != -1 && i6 != 1) {
                            s350 s350Var = this.e;
                            if (i6 == 2) {
                                messengerPushHandler$handle$1.L$0 = map;
                                messengerPushHandler$handle$1.L$1 = null;
                                messengerPushHandler$handle$1.L$2 = null;
                                messengerPushHandler$handle$1.L$3 = null;
                                messengerPushHandler$handle$1.label = 2;
                                obj = s350Var.a.a.b(messengerPushHandler$handle$1);
                                break;
                            } else {
                                if (i6 != 3) {
                                    w511.b();
                                    return null;
                                }
                                messengerPushHandler$handle$1.L$0 = map;
                                messengerPushHandler$handle$1.L$1 = null;
                                messengerPushHandler$handle$1.L$2 = null;
                                messengerPushHandler$handle$1.L$3 = null;
                                messengerPushHandler$handle$1.label = 5;
                                obj = s350Var.a.a.b(messengerPushHandler$handle$1);
                                break;
                            }
                        } else {
                            final int i7 = 0;
                            sls slsVar = new sls(this) { // from class: w320
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    boolean a2;
                                    int i8 = i7;
                                    Map map2 = map;
                                    a aVar = this.b;
                                    switch (i8) {
                                        case 0:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                        case 1:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                        default:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                    }
                                    return Boolean.valueOf(a2);
                                }
                            };
                            messengerPushHandler$handle$1.L$0 = null;
                            messengerPushHandler$handle$1.L$1 = null;
                            messengerPushHandler$handle$1.L$2 = null;
                            messengerPushHandler$handle$1.L$3 = null;
                            messengerPushHandler$handle$1.label = 1;
                            Object c = c(slsVar, messengerPushHandler$handle$1);
                            if (c != obj2) {
                                return c;
                            }
                        }
                        return obj2;
                    case 1:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                        b.b(obj);
                        return obj;
                    case 2:
                        map = (Map) messengerPushHandler$handle$1.L$0;
                        b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            messengerPushHandler$handle$1.L$0 = null;
                            messengerPushHandler$handle$1.L$1 = null;
                            messengerPushHandler$handle$1.L$2 = null;
                            messengerPushHandler$handle$1.L$3 = null;
                            messengerPushHandler$handle$1.label = 3;
                            Object b = dVar.b(map, messengerPushHandler$handle$1);
                            if (b != obj2) {
                                return b;
                            }
                        } else {
                            sls slsVar2 = new sls(this) { // from class: w320
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    boolean a2;
                                    int i8 = i4;
                                    Map map2 = map;
                                    a aVar = this.b;
                                    switch (i8) {
                                        case 0:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                        case 1:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                        default:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                    }
                                    return Boolean.valueOf(a2);
                                }
                            };
                            messengerPushHandler$handle$1.L$0 = null;
                            messengerPushHandler$handle$1.L$1 = null;
                            messengerPushHandler$handle$1.L$2 = null;
                            messengerPushHandler$handle$1.L$3 = null;
                            messengerPushHandler$handle$1.label = 4;
                            Object c2 = c(slsVar2, messengerPushHandler$handle$1);
                            if (c2 != obj2) {
                                return c2;
                            }
                        }
                        return obj2;
                    case 5:
                        map = (Map) messengerPushHandler$handle$1.L$0;
                        b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            messengerPushHandler$handle$1.L$0 = null;
                            messengerPushHandler$handle$1.L$1 = null;
                            messengerPushHandler$handle$1.L$2 = null;
                            messengerPushHandler$handle$1.L$3 = null;
                            messengerPushHandler$handle$1.label = 6;
                            Object b2 = dVar.b(map, messengerPushHandler$handle$1);
                            if (b2 != obj2) {
                                return b2;
                            }
                        } else {
                            sls slsVar3 = new sls(this) { // from class: w320
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    boolean a2;
                                    int i8 = i3;
                                    Map map2 = map;
                                    a aVar = this.b;
                                    switch (i8) {
                                        case 0:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                        case 1:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                        default:
                                            a2 = ((vh60) ((Notification) ((WebMessenger) aVar.a.get()).b.getValue())).a(map2);
                                            break;
                                    }
                                    return Boolean.valueOf(a2);
                                }
                            };
                            messengerPushHandler$handle$1.L$0 = null;
                            messengerPushHandler$handle$1.L$1 = null;
                            messengerPushHandler$handle$1.L$2 = null;
                            messengerPushHandler$handle$1.L$3 = null;
                            messengerPushHandler$handle$1.label = 7;
                            Object c3 = c(slsVar3, messengerPushHandler$handle$1);
                            if (c3 != obj2) {
                                return c3;
                            }
                        }
                        return obj2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        messengerPushHandler$handle$1 = new MessengerPushHandler$handle$1(this, continuationImpl);
        Object obj3 = messengerPushHandler$handle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerPushHandler$handle$1.label;
        d dVar2 = this.f;
        final int i32 = 2;
        final int i42 = 1;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sls slsVar, ContinuationImpl continuationImpl) {
        MessengerPushHandler$invokeIfExperimentEnabled$1 messengerPushHandler$invokeIfExperimentEnabled$1;
        int i;
        if (continuationImpl instanceof MessengerPushHandler$invokeIfExperimentEnabled$1) {
            messengerPushHandler$invokeIfExperimentEnabled$1 = (MessengerPushHandler$invokeIfExperimentEnabled$1) continuationImpl;
            int i2 = messengerPushHandler$invokeIfExperimentEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerPushHandler$invokeIfExperimentEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerPushHandler$invokeIfExperimentEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerPushHandler$invokeIfExperimentEnabled$1.label;
                if (i != 0) {
                    b.b(obj);
                    messengerPushHandler$invokeIfExperimentEnabled$1.L$0 = slsVar;
                    messengerPushHandler$invokeIfExperimentEnabled$1.label = 1;
                    obj = this.d.a.f(messengerPushHandler$invokeIfExperimentEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar = (sls) messengerPushHandler$invokeIfExperimentEnabled$1.L$0;
                    b.b(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue() ? ((Boolean) slsVar.invoke()).booleanValue() : false);
            }
        }
        messengerPushHandler$invokeIfExperimentEnabled$1 = new MessengerPushHandler$invokeIfExperimentEnabled$1(this, continuationImpl);
        Object obj2 = messengerPushHandler$invokeIfExperimentEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerPushHandler$invokeIfExperimentEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Boolean) obj2).booleanValue() ? ((Boolean) slsVar.invoke()).booleanValue() : false);
    }
}
