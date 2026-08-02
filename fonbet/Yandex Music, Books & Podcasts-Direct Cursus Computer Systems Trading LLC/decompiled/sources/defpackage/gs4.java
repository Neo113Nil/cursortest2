package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class gs4 implements adu {
    public static gs4 f;
    public static gs4 h;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public static final mvn g = new mvn(17);
    public static final ehv i = new ehv(12);

    public gs4(int i2) {
        int i3 = 1;
        switch (i2) {
            case 3:
                l18 l18Var = l18.b;
                bdt I = hag.I(ms.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                this.a = (ms) qdcVar.C(I);
                bdt I2 = hag.I(ay.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                this.b = (ay) qdcVar2.C(I2);
                this.c = l18Var.b(hag.I(k2i.class), true);
                this.d = l18Var.b(hag.I(v7a.class), true);
                this.e = l18Var.b(hag.I(jhq.class), true);
                break;
            case 8:
                this.a = new gw5(wct.t());
                this.b = new wy5(R.string.artist_concerts_buy_from, R.string.artist_concerts_buy, R.string.artist_concerts_buy);
                this.c = btf.b(new cp5(8));
                this.d = l18.b.b(hag.I(Context.class), true);
                this.e = new o6c(18);
                break;
            case 18:
                this.a = l18.b.b(hag.I(tge.class), true);
                rjq rjqVar = new rjq(false);
                this.b = rjqVar;
                this.c = hld.s(rjqVar, dm6.b());
                this.e = new n7b(this);
                break;
            case 27:
                this.a = new btl();
                this.b = new p2m();
                l18 l18Var2 = l18.b;
                this.c = l18Var2.b(hag.I(i5h.class), false);
                bdt I3 = hag.I(i2m.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                this.d = new cus();
                this.e = new g51();
                l18Var2.b(hag.I(frt.class), true);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l18 l18Var3 = l18.b;
                this.a = l18Var3.b(hag.I(o8q.class), true);
                this.b = l18Var3.b(hag.I(qfl.class), true);
                this.c = l18Var3.b(hag.I(oq7.class), true);
                this.d = l18Var3.b(hag.I(fw5.class), true);
                this.e = new ufl(i3);
                break;
            default:
                this.a = new Handler(Looper.getMainLooper());
                Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                newSetFromMap.getClass();
                this.b = newSetFromMap;
                this.c = new LinkedHashSet();
                this.d = new HashSet();
                this.e = new HashMap();
                break;
        }
    }

    public static final void a(gs4 gs4Var, JSONObject jSONObject, String str) {
        gs4Var.getClass();
        jSONObject.getJSONObject("div").put("buttonText", str);
    }

    public static final void b(gs4 gs4Var, JSONObject jSONObject, String str) {
        gs4Var.getClass();
        jSONObject.getJSONObject("div").put("text", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(gs4 gs4Var, boolean z, cg6 cg6Var) {
        b8c b8cVar;
        int i2;
        gs4Var.getClass();
        if (cg6Var instanceof b8c) {
            b8cVar = (b8c) cg6Var;
            int i3 = b8cVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b8cVar.l = i3 - Integer.MIN_VALUE;
                Object obj = b8cVar.j;
                nm6 nm6Var = nm6.a;
                i2 = b8cVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) gs4Var.e;
                    ze1 ze1Var = new ze1(gs4Var, z, null, 2);
                    b8cVar.l = 1;
                    obj = x97.V(coroutineContext, ze1Var, b8cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                jSONObject2.getClass();
                jSONObject3.getClass();
                return new uv8(jSONObject2, jSONObject3);
            }
        }
        b8cVar = new b8c(gs4Var, cg6Var);
        Object obj2 = b8cVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = b8cVar.l;
        if (i2 != 0) {
        }
        JSONObject jSONObject4 = (JSONObject) obj2;
        JSONObject jSONObject22 = jSONObject4.getJSONObject("templates");
        JSONObject jSONObject32 = jSONObject4.getJSONObject("card");
        jSONObject22.getClass();
        jSONObject32.getClass();
        return new uv8(jSONObject22, jSONObject32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(gs4 gs4Var, boolean z, cg6 cg6Var) {
        e8c e8cVar;
        int i2;
        gs4Var.getClass();
        if (cg6Var instanceof e8c) {
            e8cVar = (e8c) cg6Var;
            int i3 = e8cVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e8cVar.l = i3 - Integer.MIN_VALUE;
                Object obj = e8cVar.j;
                nm6 nm6Var = nm6.a;
                i2 = e8cVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) gs4Var.e;
                    ze1 ze1Var = new ze1(gs4Var, z, null, 3);
                    e8cVar.l = 1;
                    obj = x97.V(coroutineContext, ze1Var, e8cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                jSONObject2.getClass();
                jSONObject3.getClass();
                return new uv8(jSONObject2, jSONObject3);
            }
        }
        e8cVar = new e8c(gs4Var, cg6Var);
        Object obj2 = e8cVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = e8cVar.l;
        if (i2 != 0) {
        }
        JSONObject jSONObject4 = (JSONObject) obj2;
        JSONObject jSONObject22 = jSONObject4.getJSONObject("templates");
        JSONObject jSONObject32 = jSONObject4.getJSONObject("card");
        jSONObject22.getClass();
        jSONObject32.getClass();
        return new uv8(jSONObject22, jSONObject32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(gs4 gs4Var, String str, cg6 cg6Var) {
        ink inkVar;
        int i2;
        gs4Var.getClass();
        if (cg6Var instanceof ink) {
            inkVar = (ink) cg6Var;
            int i3 = inkVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inkVar.m = i3 - Integer.MIN_VALUE;
                Object obj = inkVar.k;
                nm6 nm6Var = nm6.a;
                i2 = inkVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    i5h x = gs4Var.x();
                    inkVar.j = str;
                    inkVar.m = 1;
                    obj = x.b(str, inkVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = inkVar.j;
                    qgg.h0(obj);
                }
                r4m I = ((MainDatabase) obj).I();
                inkVar.j = null;
                inkVar.m = 2;
                Object G = up6.G(I.a, true, false, new q1h(str, 18), inkVar);
                return G != nm6Var ? nm6Var : G;
            }
        }
        inkVar = new ink(gs4Var, cg6Var);
        Object obj2 = inkVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = inkVar.m;
        if (i2 != 0) {
        }
        r4m I2 = ((MainDatabase) obj2).I();
        inkVar.j = null;
        inkVar.m = 2;
        Object G2 = up6.G(I2.a, true, false, new q1h(str, 18), inkVar);
        if (G2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(gs4 gs4Var, String str, cg6 cg6Var) {
        jnk jnkVar;
        int i2;
        gs4Var.getClass();
        if (cg6Var instanceof jnk) {
            jnkVar = (jnk) cg6Var;
            int i3 = jnkVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jnkVar.m = i3 - Integer.MIN_VALUE;
                Object obj = jnkVar.k;
                nm6 nm6Var = nm6.a;
                i2 = jnkVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    i5h x = gs4Var.x();
                    jnkVar.j = str;
                    jnkVar.m = 1;
                    obj = x.b(str, jnkVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = jnkVar.j;
                    qgg.h0(obj);
                }
                r4m I = ((MainDatabase) obj).I();
                jnkVar.j = null;
                jnkVar.m = 2;
                Object G = up6.G(I.a, true, false, new q1h(str, 19), jnkVar);
                return G != nm6Var ? nm6Var : G;
            }
        }
        jnkVar = new jnk(gs4Var, cg6Var);
        Object obj2 = jnkVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = jnkVar.m;
        if (i2 != 0) {
        }
        r4m I2 = ((MainDatabase) obj2).I();
        jnkVar.j = null;
        jnkVar.m = 2;
        Object G2 = up6.G(I2.a, true, false, new q1h(str, 19), jnkVar);
        if (G2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r7 != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[LOOP:0: B:39:0x0090->B:41:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[LOOP:1: B:44:0x00b3->B:46:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(gs4 gs4Var, List list, cg6 cg6Var) {
        nt7 nt7Var;
        int i2;
        rj6 rj6Var;
        Iterator it;
        Iterator it2;
        Object c;
        gs4Var.getClass();
        if (cg6Var instanceof nt7) {
            nt7Var = (nt7) cg6Var;
            int i3 = nt7Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nt7Var.m = i3 - Integer.MIN_VALUE;
                Object obj = nt7Var.k;
                nm6 nm6Var = nm6.a;
                i2 = nt7Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    qzc qzcVar = (qzc) gs4Var.b;
                    nt7Var.j = list;
                    nt7Var.m = 1;
                    obj = qzcVar.D(list, nt7Var);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = nt7Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    if (rj6Var instanceof mj6) {
                        int i4 = ((mj6) rj6Var).a;
                        if (i4 != 401 && i4 != 408 && i4 != 429 && 400 <= i4 && i4 < 500) {
                            v3w.k("Unexpected client HTTP error while sending feedback: ", i4, 5, "LeftoverFeedbackReporter", null);
                        }
                    } else if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    return Unit.a;
                }
                sml smlVar = (sml) gs4Var.a;
                ArrayList arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    z75.t(arrayList, ((xlp) it.next()).c);
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Long(((bpu) it2.next()).a));
                }
                nt7Var.j = null;
                nt7Var.m = 2;
                c = ((uou) ((oou) smlVar.a)).c(arrayList2, nt7Var);
                if (c != nm6.a) {
                    c = Unit.a;
                }
            }
        }
        nt7Var = new nt7(gs4Var, cg6Var);
        Object obj2 = nt7Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = nt7Var.m;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        sml smlVar2 = (sml) gs4Var.a;
        ArrayList arrayList3 = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(v75.o(arrayList3, 10));
        it2 = arrayList3.iterator();
        while (it2.hasNext()) {
        }
        nt7Var.j = null;
        nt7Var.m = 2;
        c = ((uou) ((oou) smlVar2.a)).c(arrayList22, nt7Var);
        if (c != nm6.a) {
        }
    }

    public static gs4 j(ConstraintLayout constraintLayout) {
        int i2 = R.id.paymentsdkSnackbarImage;
        ImageView imageView = (ImageView) dag.v(R.id.paymentsdkSnackbarImage, constraintLayout);
        if (imageView != null) {
            i2 = R.id.paymentsdkSnackbarSubtitle;
            TextView textView = (TextView) dag.v(R.id.paymentsdkSnackbarSubtitle, constraintLayout);
            if (textView != null) {
                i2 = R.id.paymentsdkSnackbarTitle;
                TextView textView2 = (TextView) dag.v(R.id.paymentsdkSnackbarTitle, constraintLayout);
                if (textView2 != null) {
                    i2 = R.id.snackBarLayout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) dag.v(R.id.snackBarLayout, constraintLayout);
                    if (constraintLayout2 != null) {
                        return new gs4(constraintLayout, imageView, textView, textView2, constraintLayout2);
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i2)));
        return null;
    }

    public Object A(aur aurVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        try {
            rar rarVar = (rar) this.e;
            if (rarVar == null) {
                return Unit.a;
            }
            Object j0 = rarVar.j0(aurVar);
            return j0 == nm6.a ? j0 : Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int C(int i2, int i3) {
        while (i2 > i3) {
            char charAt = ((Layout) this.a).getText().charAt(i2 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.e(charAt, RemoteCameraConfig.Notification.ID) < 0 || Intrinsics.e(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i2;
            }
            i2--;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(String str, cg6 cg6Var) {
        zz zzVar;
        int i2;
        Pair pair;
        if (cg6Var instanceof zz) {
            zzVar = (zz) cg6Var;
            int i3 = zzVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zzVar.l = i3 - Integer.MIN_VALUE;
                Object obj = zzVar.j;
                Object obj2 = nm6.a;
                i2 = zzVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    ms msVar = (ms) this.a;
                    zzVar.l = 1;
                    obj = msVar.e(str, zzVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pair = (Pair) obj;
                if (pair != null) {
                    mt mtVar = (mt) pair.a;
                    if (!mtVar.a.F.isEmpty()) {
                        return mtVar;
                    }
                }
                return null;
            }
        }
        zzVar = new zz(this, cg6Var);
        Object obj3 = zzVar.j;
        Object obj22 = nm6.a;
        i2 = zzVar.l;
        if (i2 != 0) {
        }
        pair = (Pair) obj3;
        if (pair != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(String str, cg6 cg6Var) {
        a00 a00Var;
        int i2;
        List list;
        if (cg6Var instanceof a00) {
            a00Var = (a00) cg6Var;
            int i3 = a00Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a00Var.l = i3 - Integer.MIN_VALUE;
                Object obj = a00Var.j;
                nm6 nm6Var = nm6.a;
                i2 = a00Var.l;
                Continuation continuation = null;
                if (i2 != 0) {
                    qgg.h0(obj);
                    v7a v7aVar = (v7a) ((jyr) this.d).getValue();
                    a00Var.l = 1;
                    v7aVar.getClass();
                    obj = x97.V(dm6.b, new f98(v7aVar, str, continuation, 4), a00Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                list = (List) jf0.F((rj6) obj);
                if (list != null || list.isEmpty()) {
                    return null;
                }
                return list;
            }
        }
        a00Var = new a00(this, cg6Var);
        Object obj2 = a00Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = a00Var.l;
        Continuation continuation2 = null;
        if (i2 != 0) {
        }
        list = (List) jf0.F((rj6) obj2);
        if (list != null) {
        }
        return null;
    }

    public v89 H(String str) {
        str.getClass();
        rdk rdkVar = (rdk) this.a;
        ((AtomicInteger) rdkVar.b).incrementAndGet();
        ffg b = ((a39) ((jyr) this.c).getValue()).b(str, new jh9(rdkVar, str));
        b.getClass();
        return new v89(1, b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(c01 c01Var, cg6 cg6Var) {
        b00 b00Var;
        int i2;
        rj6 rj6Var;
        if (cg6Var instanceof b00) {
            b00Var = (b00) cg6Var;
            int i3 = b00Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b00Var.l = i3 - Integer.MIN_VALUE;
                Object obj = b00Var.j;
                nm6 nm6Var = nm6.a;
                i2 = b00Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    ay ayVar = (ay) this.b;
                    String str = c01Var.a;
                    b00Var.l = 1;
                    obj = ayVar.c(str, b00Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return (List) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    return c5b.a;
                }
                b6e.s();
                return null;
            }
        }
        b00Var = new b00(this, cg6Var);
        Object obj2 = b00Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = b00Var.l;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable J(String str, cg6 cg6Var) {
        c00 c00Var;
        int i2;
        rj6 rj6Var;
        if (cg6Var instanceof c00) {
            c00Var = (c00) cg6Var;
            int i3 = c00Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c00Var.l = i3 - Integer.MIN_VALUE;
                c00 c00Var2 = c00Var;
                Object obj = c00Var2.j;
                nm6 nm6Var = nm6.a;
                i2 = c00Var2.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    k2i k2iVar = (k2i) ((jyr) this.c).getValue();
                    ap0 ap0Var = new ap0(0, 25);
                    c00Var2.l = 1;
                    obj = k2iVar.a(str, null, ap0Var, null, c00Var2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    o0i o0iVar = (o0i) ((qj6) rj6Var).a;
                    return new Pair(o0iVar.a, o0iVar.c);
                }
                if (rj6Var instanceof pj6) {
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        c00Var = new c00(this, cg6Var);
        c00 c00Var22 = c00Var;
        Object obj2 = c00Var22.j;
        nm6 nm6Var2 = nm6.a;
        i2 = c00Var22.l;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(String str, cg6 cg6Var) {
        d00 d00Var;
        int i2;
        rj6 rj6Var;
        if (cg6Var instanceof d00) {
            d00Var = (d00) cg6Var;
            int i3 = d00Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d00Var.l = i3 - Integer.MIN_VALUE;
                Object obj = d00Var.j;
                nm6 nm6Var = nm6.a;
                i2 = d00Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    jhq jhqVar = (jhq) ((jyr) this.e).getValue();
                    d00Var.l = 1;
                    obj = jhqVar.a(str, d00Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return (List) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    return c5b.a;
                }
                b6e.s();
                return null;
            }
        }
        d00Var = new d00(this, cg6Var);
        Object obj2 = d00Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = d00Var.l;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    public zqn M(Set set) {
        set.getClass();
        if (!((Boolean) ((qkp) this.b).invoke()).booleanValue()) {
            return yqn.a;
        }
        ze9 ze9Var = (ze9) ((jyr) this.d).getValue();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(v75.o(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse((String) it.next()));
        }
        return new v89(2, ze9Var.a(arrayList));
    }

    public void N(ArrayList arrayList, p43 p43Var) {
        this.d = arrayList;
        this.e = p43Var != null ? p43Var.a : null;
        f70 f70Var = (f70) CollectionsKt.firstOrNull(arrayList);
        q43 r = r();
        s63 s63Var = (s63) this.a;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((f70) it.next()).d;
        }
        r.b(s63Var, i2, (String) this.e, f70Var);
        if (f70Var != null) {
            q(f70Var.a);
        }
    }

    public void O() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            for (Activity activity : (Set) this.b) {
                if (activity != null) {
                    ((LinkedHashSet) this.c).add(new fs4(ot0.E(activity), (Handler) this.a, (HashSet) this.d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public void P() {
        mhh mhhVar = new mhh(this, (nuh) this.e);
        this.b = mhhVar;
        mhhVar.onCreate();
    }

    public void Q() {
        ja jaVar = (ja) this.a;
        if (jaVar != null && ((AtomicBoolean) this.b).compareAndSet(false, true)) {
            this.c = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ma maVar = new ma();
            pa paVar = new pa(atomicBoolean, hashSet, hashSet2, hashSet3);
            Bundle bundle = new Bundle();
            z6e z6eVar = z6e.a;
            ood oodVar = new ood(jaVar, "me/permissions", bundle, z6eVar, paVar, 0);
            qa qaVar = new qa(0, maVar);
            String str = jaVar.k;
            if (str == null) {
                str = "facebook";
            }
            na y9wVar = (str.hashCode() == 28903346 && str.equals("instagram")) ? new y9w(12) : new i9w();
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", y9wVar.e());
            bundle2.putString("client_id", jaVar.h);
            qod qodVar = new qod(oodVar, new ood(jaVar, y9wVar.D(), bundle2, z6eVar, qaVar, 0));
            oa oaVar = new oa(this, maVar, jaVar, atomicBoolean, hashSet, hashSet2, hashSet3);
            ArrayList arrayList = qodVar.d;
            if (!arrayList.contains(oaVar)) {
                arrayList.add(oaVar);
            }
            wxf.G(qodVar);
            new pod(qodVar).executeOnExecutor(j3c.d(), new Void[0]);
        }
    }

    public void S(Activity activity) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            if (currentThread != mainLooper.getThread()) {
                throw new c3c("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            ((Set) this.b).remove(activity);
            ((LinkedHashSet) this.c).clear();
            HashMap hashMap = (HashMap) this.e;
            Integer valueOf = Integer.valueOf(activity.hashCode());
            Object clone = ((HashSet) this.d).clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashSet<kotlin.String> /* = java.util.HashSet<kotlin.String> */");
            }
            hashMap.put(valueOf, (HashSet) clone);
            ((HashSet) this.d).clear();
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (defpackage.tyf.N(r6, r5, r1) != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object T(String str, long j, String str2, Long l, cg6 cg6Var) {
        lnk lnkVar;
        int i2;
        String str3;
        String str4;
        Long l2;
        long j2;
        if (cg6Var instanceof lnk) {
            lnkVar = (lnk) cg6Var;
            int i3 = lnkVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lnkVar.p = i3 - Integer.MIN_VALUE;
                Object obj = lnkVar.n;
                nm6 nm6Var = nm6.a;
                i2 = lnkVar.p;
                if (i2 != 0) {
                    qgg.h0(obj);
                    i5h x = x();
                    lnkVar.j = str;
                    str3 = str2;
                    lnkVar.k = str3;
                    lnkVar.l = l;
                    lnkVar.m = j;
                    lnkVar.p = 1;
                    obj = x.b(str, lnkVar);
                    if (obj != nm6Var) {
                        str4 = str;
                        l2 = l;
                        j2 = j;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j3 = lnkVar.m;
                Long l3 = lnkVar.l;
                str3 = lnkVar.k;
                String str5 = lnkVar.j;
                qgg.h0(obj);
                l2 = l3;
                j2 = j3;
                str4 = str5;
                ueo ueoVar = (ueo) obj;
                wlg wlgVar = new wlg(ueoVar, null, this, str4, j2, str3, l2);
                lnkVar.j = null;
                lnkVar.k = null;
                lnkVar.l = null;
                lnkVar.m = j2;
                lnkVar.p = 2;
            }
        }
        lnkVar = new lnk(this, cg6Var);
        Object obj2 = lnkVar.n;
        nm6 nm6Var2 = nm6.a;
        i2 = lnkVar.p;
        if (i2 != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        wlg wlgVar2 = new wlg(ueoVar2, null, this, str4, j2, str3, l2);
        lnkVar.j = null;
        lnkVar.k = null;
        lnkVar.l = null;
        lnkVar.m = j2;
        lnkVar.p = 2;
    }

    public void U(ja jaVar, ja jaVar2) {
        Intent intent = new Intent(j3c.b(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", jaVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", jaVar2);
        ((phg) this.d).c(intent);
    }

    public void V(ja jaVar, boolean z) {
        ja jaVar2 = (ja) this.a;
        this.a = jaVar;
        ((AtomicBoolean) this.b).set(false);
        this.c = new Date(0L);
        if (z) {
            SharedPreferences sharedPreferences = ((sk2) this.e).a;
            if (jaVar != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", jaVar.d().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                gvt.c(j3c.b());
            }
        }
        if (jaVar2 == null ? jaVar == null : jaVar2.equals(jaVar)) {
            return;
        }
        U(jaVar2, jaVar);
        Context b = j3c.b();
        Date date = ja.l;
        ja N = n7w.N();
        AlarmManager alarmManager = (AlarmManager) b.getSystemService("alarm");
        if (n7w.P()) {
            if ((N != null ? N.a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(b, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, N.a.getTime(), PendingIntent.getBroadcast(b, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }

    public void W(am4 am4Var) {
        FrameLayout frameLayout = (FrameLayout) this.b;
        if (am4Var == null) {
            this.d = null;
        } else {
            am4 am4Var2 = (am4) this.d;
            if (am4Var2 == null) {
                this.d = new am4(am4Var);
            } else {
                float f2 = am4Var.a;
                float f3 = am4Var.b;
                float f4 = am4Var.c;
                am4Var2.a = f2;
                am4Var2.b = f3;
                am4Var2.c = f4;
            }
            if (am4Var.c + 1.0E-4f >= wxf.t(am4Var.a, am4Var.b, frameLayout.getWidth(), frameLayout.getHeight())) {
                ((am4) this.d).c = Float.MAX_VALUE;
            }
        }
        frameLayout.invalidate();
    }

    @Override // defpackage.adu
    public View getRoot() {
        throw null;
    }

    public void h(Activity activity) {
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            if (currentThread != mainLooper.getThread()) {
                throw new c3c("Can't add activity to CodelessMatcher on non-UI thread");
            }
            ((Set) this.b).add(activity);
            ((HashSet) this.d).clear();
            HashSet hashSet = (HashSet) ((HashMap) this.e).get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.d = hashSet;
            }
            if (set.contains(this)) {
                return;
            }
            try {
                Thread currentThread2 = Thread.currentThread();
                Looper mainLooper2 = Looper.getMainLooper();
                mainLooper2.getClass();
                if (currentThread2 == mainLooper2.getThread()) {
                    O();
                } else {
                    ((Handler) this.a).post(new q9(13, this));
                }
            } catch (Throwable th) {
                bp6.a(this, th);
            }
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi i(int i2) {
        Bidi bidi;
        Layout layout = (Layout) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i2]) {
            return (Bidi) arrayList2.get(i2);
        }
        int intValue = i2 == 0 ? 0 : ((Number) arrayList.get(i2 - 1)).intValue();
        int intValue2 = ((Number) arrayList.get(i2)).intValue();
        int i3 = intValue2 - intValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i3) {
            cArr = new char[i3];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i3)) {
            bidi = new Bidi(cArr2, 0, null, 0, i3, layout.getParagraphDirection(layout.getLineForOffset(z(i2))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList2.set(i2, bidi);
        zArr[i2] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (defpackage.tyf.N(r7, r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(mqs mqsVar, cg6 cg6Var) {
        gnk gnkVar;
        int i2;
        mqs mqsVar2;
        String str;
        int i3;
        int i4;
        if (cg6Var instanceof gnk) {
            gnkVar = (gnk) cg6Var;
            int i5 = gnkVar.p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gnkVar.p = i5 - Integer.MIN_VALUE;
                Object obj = gnkVar.n;
                nm6 nm6Var = nm6.a;
                i2 = gnkVar.p;
                if (i2 != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str2 = ((frt) qdcVar.C(I)).c().a;
                    str2.getClass();
                    i5h x = x();
                    gnkVar.j = mqsVar;
                    gnkVar.k = str2;
                    gnkVar.l = 0;
                    gnkVar.m = 0;
                    gnkVar.p = 1;
                    Object b = x.b(str2, gnkVar);
                    if (b != nm6Var) {
                        mqsVar2 = mqsVar;
                        str = str2;
                        obj = b;
                        i3 = 0;
                        i4 = 0;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = gnkVar.m;
                i4 = gnkVar.l;
                String str3 = gnkVar.k;
                mqs mqsVar3 = gnkVar.j;
                qgg.h0(obj);
                str = str3;
                mqsVar2 = mqsVar3;
                ueo ueoVar = (ueo) obj;
                hnk hnkVar = new hnk(ueoVar, null, this, str, mqsVar2);
                gnkVar.j = null;
                gnkVar.k = null;
                gnkVar.l = i4;
                gnkVar.m = i3;
                gnkVar.p = 2;
            }
        }
        gnkVar = new gnk(this, cg6Var);
        Object obj2 = gnkVar.n;
        nm6 nm6Var2 = nm6.a;
        i2 = gnkVar.p;
        if (i2 != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        hnk hnkVar2 = new hnk(ueoVar2, null, this, str, mqsVar2);
        gnkVar.j = null;
        gnkVar.k = null;
        gnkVar.l = i4;
        gnkVar.m = i3;
        gnkVar.p = 2;
    }

    public eno l() {
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        return x().f(str, new String[]{"artist"}, new qs(this, null, 6));
    }

    public eno m() {
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        return x().f(str, new String[]{"playlist_track"}, new aa0(this, str, (Continuation) null, 8));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.FrameLayout, bm4] */
    public void n(Canvas canvas) {
        Canvas canvas2;
        Paint paint = (Paint) this.c;
        FrameLayout frameLayout = (FrameLayout) this.b;
        am4 am4Var = (am4) this.d;
        boolean z = am4Var == null || am4Var.c == Float.MAX_VALUE;
        ?? r2 = (FrameLayout) this.a;
        if (z) {
            canvas2 = canvas;
            r2.c(canvas2);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2.drawRect(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), paint);
            }
        } else {
            r2.c(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = (Drawable) this.e;
        if (drawable == null || ((am4) this.d) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float width = ((am4) this.d).a - (bounds.width() / 2.0f);
        float height = ((am4) this.d).b - (bounds.height() / 2.0f);
        canvas2.translate(width, height);
        ((Drawable) this.e).draw(canvas2);
        canvas2.translate(-width, -height);
    }

    public Object p(cg6 cg6Var) {
        nuj nujVar = (nuj) this.b;
        nujVar.getClass();
        UUID.randomUUID().getClass();
        x4b x4bVar = (x4b) this.c;
        x4bVar.getClass();
        ArrayList arrayList = (ArrayList) this.d;
        dp0 dp0Var = (dp0) this.a;
        Boolean bool = (Boolean) this.e;
        int i2 = 1;
        boolean z = bool == null || bool.equals(Boolean.TRUE);
        dp0Var.getClass();
        a46 a46Var = dp0Var.f;
        fx6 fx6Var = dp0Var.b;
        a46Var.getClass();
        pob b = (fx6Var == x4b.a ? a46Var : (pob) fx6Var.c(a46Var)).b(dp0Var.e).b(x4bVar);
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        pob b2 = a46Var.b(fx6Var);
        b2.getClass();
        b.getClass();
        pob b3 = b2.b(b);
        b3.getClass();
        pob b4 = b3.b(x4bVar);
        b4.getClass();
        if (arrayList == null) {
            arrayList = null;
        } else if (!z) {
            arrayList = CollectionsKt.g0(c5b.a, arrayList);
        }
        kkp kkpVar = new kkp(13, nujVar, randomUUID, b4, arrayList, false);
        ArrayList h0 = CollectionsKt.h0(dp0Var.d, dp0Var.g);
        if (h0.size() > 0) {
            return zsd.E0(((gp0) h0.get(0)).a(kkpVar, new c11(h0, i2)), cg6Var);
        }
        xq0.q("Check failed.");
        return null;
    }

    public void q(String str) {
        Object obj;
        str.getClass();
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((f70) obj).a, str)) {
                    break;
                }
            }
        }
        f70 f70Var = (f70) obj;
        if (f70Var == null) {
            return;
        }
        r().f((s63) this.a, f70Var.d, (String) this.e, f70Var);
    }

    public q43 r() {
        return (q43) ((jyr) this.c).getValue();
    }

    public xth s() {
        jhh jhhVar = ((nuh) this.d).f;
        if (jhhVar != null) {
            return jhhVar.d;
        }
        xq0.q("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        return null;
    }

    public float t(int i2, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i2));
        if (i2 > lineEnd) {
            i2 = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i2) : layout.getSecondaryHorizontal(i2);
    }

    public float u(int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5 = i2;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return t(i2, z);
        }
        int L = irf.L(layout, i5, z2);
        int lineStart = layout.getLineStart(L);
        int lineEnd = layout.getLineEnd(L);
        if (i5 != lineStart && i5 != lineEnd) {
            return t(i2, z);
        }
        if (i5 == 0 || i5 == layout.getText().length()) {
            return t(i2, z);
        }
        int y = y(i5, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(z(y))) == -1;
        int C = C(lineEnd, lineStart);
        int z4 = z(y);
        int i6 = lineStart - z4;
        int i7 = C - z4;
        Bidi i8 = i(y);
        Bidi createLineBidi = i8 != null ? i8.createLineBidi(i6, i7) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i5 == lineStart ? z3 : !z3 ? layout.getLineLeft(L) : layout.getLineRight(L);
        }
        int runCount = createLineBidi.getRunCount();
        yof[] yofVarArr = new yof[runCount];
        for (int i9 = 0; i9 < runCount; i9++) {
            yofVarArr[i9] = new yof(createLineBidi.getRunStart(i9) + lineStart, createLineBidi.getRunLimit(i9) + lineStart, createLineBidi.getRunLevel(i9) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i10 = 0; i10 < runCount2; i10++) {
            bArr[i10] = (byte) createLineBidi.getRunLevel(i10);
        }
        Bidi.reorderVisually(bArr, 0, yofVarArr, 0, runCount);
        if (i5 == lineStart) {
            int i11 = 0;
            while (true) {
                if (i11 >= runCount) {
                    i4 = -1;
                    break;
                }
                if (yofVarArr[i11].a == i5) {
                    i4 = i11;
                    break;
                }
                i11++;
            }
            boolean z5 = (z || z3 == yofVarArr[i4].c) ? !z3 : z3;
            return (i4 == 0 && z5) ? layout.getLineLeft(L) : (i4 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(yofVarArr[i4 - 1].a) : layout.getPrimaryHorizontal(yofVarArr[i4 + 1].a) : layout.getLineRight(L);
        }
        if (i5 > C) {
            i5 = C(i5, lineStart);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= runCount) {
                i3 = -1;
                break;
            }
            if (yofVarArr[i12].b == i5) {
                i3 = i12;
                break;
            }
            i12++;
        }
        boolean z6 = (z || z3 == yofVarArr[i3].c) ? z3 : !z3;
        return (i3 == 0 && z6) ? layout.getLineLeft(L) : (i3 != runCount - 1 || z6) ? z6 ? layout.getPrimaryHorizontal(yofVarArr[i3 - 1].b) : layout.getPrimaryHorizontal(yofVarArr[i3 + 1].b) : layout.getLineRight(L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(String str, cg6 cg6Var) {
        yz yzVar;
        int i2;
        mt mtVar;
        if (cg6Var instanceof yz) {
            yzVar = (yz) cg6Var;
            int i3 = yzVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yzVar.l = i3 - Integer.MIN_VALUE;
                Object obj = yzVar.j;
                nm6 nm6Var = nm6.a;
                i2 = yzVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    ms msVar = (ms) this.a;
                    yzVar.l = 1;
                    obj = msVar.b(str, yzVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                mtVar = (mt) obj;
                if (mtVar == null && !mtVar.a.F.isEmpty()) {
                    return mtVar;
                }
                return null;
            }
        }
        yzVar = new yz(this, cg6Var);
        Object obj2 = yzVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = yzVar.l;
        if (i2 != 0) {
        }
        mtVar = (mt) obj2;
        if (mtVar == null) {
            return null;
        }
        return mtVar;
    }

    public i5h x() {
        return (i5h) ((jyr) this.c).getValue();
    }

    public int y(int i2, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int e = u75.e(arrayList, Integer.valueOf(i2));
        int i3 = e < 0 ? -(e + 1) : e + 1;
        if (z && i3 > 0) {
            int i4 = i3 - 1;
            if (i2 == ((Number) arrayList.get(i4)).intValue()) {
                return i4;
            }
        }
        return i3;
    }

    public int z(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i2 - 1)).intValue();
    }

    public gs4(s63 s63Var, jnq jnqVar) {
        jnqVar.getClass();
        this.a = s63Var;
        this.b = jnqVar;
        this.c = btf.b(new ita(18, this));
    }

    public gs4(dp0 dp0Var, nuj nujVar) {
        dp0Var.getClass();
        nujVar.getClass();
        this.a = dp0Var;
        this.b = nujVar;
        this.c = x4b.a;
    }

    public /* synthetic */ gs4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gs4(bm4 bm4Var) {
        this.a = (FrameLayout) bm4Var;
        View view = (View) bm4Var;
        this.b = (FrameLayout) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(0);
    }

    public gs4(nuh nuhVar) {
        this.e = nuhVar;
        this.d = nuhVar;
        this.a = new ArrayList();
    }
}
