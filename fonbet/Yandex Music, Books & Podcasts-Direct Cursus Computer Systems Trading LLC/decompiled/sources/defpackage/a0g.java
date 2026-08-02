package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AtomicFile;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import io.appmetrica.analytics.BuildConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;
import ru.yandex.music.YMApplication;
import ru.yandex.music.concert.ticket.PurchaseTicketActivity;

/* loaded from: classes3.dex */
public abstract class a0g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0c A(View view) {
        if (view instanceof a0c) {
            return (a0c) view;
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        q4r q4rVar = tag instanceof q4r ? (q4r) tag : null;
        if (q4rVar == null) {
            q4rVar = new q4r(0);
            view.setTag(R.id.div_releasable_list, q4rVar);
        }
        Object c = q4rVar.c(0);
        a0c a0cVar = c instanceof a0c ? (a0c) c : null;
        if (a0cVar != null) {
            return a0cVar;
        }
        b0c b0cVar = new b0c();
        q4rVar.e(0, b0cVar);
        return b0cVar;
    }

    public static final boolean B(qbs qbsVar, boolean z) {
        wof c;
        axf axfVar = qbsVar.d;
        if (axfVar == null || (c = axfVar.c()) == null) {
            return false;
        }
        return weo.n(weo.U(c), qbsVar.j(z));
    }

    public static final wn5 C(Function2 function2) {
        return new wn5(new y5(22, new jfi(new wn5(new kfi(function2, 0), -514040016, true))), -642339857, true);
    }

    public static void D(Activity activity, String str, String str2) {
        activity.getClass();
        str.getClass();
        str2.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!Intrinsics.d(((ogs) ((byb) qdcVar.C(I)).c(ern.a(ogs.class))).b(), "on_external_browser")) {
            int i = PurchaseTicketActivity.v;
            y7g.O(activity, new Intent(activity, (Class<?>) PurchaseTicketActivity.class).putExtra("extra.concertId", str).putExtra("extra.dataSessionId", str2));
        } else {
            String uri = lp.a(str2).toString();
            uri.getClass();
            w1g.y(activity, uri, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w4k E(int i, int i2, hq5 hq5Var) {
        TypedValue typedValue;
        int i3;
        long j;
        int i4;
        int i5;
        int eventType;
        dde ddeVar;
        int i6;
        int i7;
        int i8;
        Shader shader;
        ai3 f3rVar;
        oq5 oq5Var = (oq5) hq5Var;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        oq5Var.j(AndroidCompositionLocals_androidKt.a);
        Resources resources = context.getResources();
        u2o u2oVar = (u2o) oq5Var.j(AndroidCompositionLocals_androidKt.d);
        synchronized (u2oVar) {
            typedValue = (TypedValue) u2oVar.a.b(i);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                soi soiVar = u2oVar.a;
                int d = soiVar.d(i);
                Object[] objArr = soiVar.c;
                Object obj = objArr[d];
                soiVar.b[d] = i;
                objArr[d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !StringsKt.P(charSequence, ".xml")) {
            oq5Var.Z(-802887899);
            boolean f = oq5Var.f(context.getTheme()) | oq5Var.f(charSequence) | ((((i2 & 14) ^ 6) > 4 && oq5Var.d(i)) || (i2 & 6) == 4);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    K = new yg0(((BitmapDrawable) drawable).getBitmap());
                    oq5Var.k0(K);
                } catch (Exception e) {
                    throw new wp3("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            q33 q33Var = new q33((yg0) K);
            oq5Var.p(false);
            return q33Var;
        }
        oq5Var.Z(-803043333);
        Resources.Theme theme = context.getTheme();
        int i9 = typedValue.changingConfigurations;
        ede edeVar = (ede) oq5Var.j(AndroidCompositionLocals_androidKt.c);
        dde ddeVar2 = new dde(i, theme);
        WeakReference weakReference = (WeakReference) edeVar.a.get(ddeVar2);
        cde cdeVar = weakReference != null ? (cde) weakReference.get() : null;
        if (cdeVar == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.d(xml.getName(), "vector")) {
                xq0.x("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            fj0 fj0Var = new fj0(xml);
            TypedArray I = pcg.I(resources, theme, asAttributeSet, vq1.a);
            fj0Var.b(I.getChangingConfigurations());
            boolean z = !pcg.F("autoMirrored", xml) ? false : I.getBoolean(5, false);
            fj0Var.b(I.getChangingConfigurations());
            float a = fj0Var.a(I, "viewportWidth", 7, 0.0f);
            float a2 = fj0Var.a(I, "viewportHeight", 8, 0.0f);
            if (a <= 0.0f) {
                throw new XmlPullParserException(I.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (a2 <= 0.0f) {
                throw new XmlPullParserException(I.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = I.getDimension(3, 0.0f);
            fj0Var.b(I.getChangingConfigurations());
            float dimension2 = I.getDimension(2, 0.0f);
            fj0Var.b(I.getChangingConfigurations());
            if (I.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                I.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j = d85.n;
                } else {
                    ColorStateList C = pcg.C(I, xml, theme);
                    fj0Var.b(I.getChangingConfigurations());
                    j = C != null ? c3x.f(C.getDefaultColor()) : d85.n;
                }
            } else {
                j = d85.n;
            }
            long j2 = j;
            int i10 = I.getInt(6, -1);
            fj0Var.b(I.getChangingConfigurations());
            if (i10 != -1) {
                if (i10 == 3) {
                    i4 = 3;
                } else if (i10 != 5) {
                    if (i10 != 9) {
                        switch (i10) {
                            case 14:
                                i4 = 13;
                                break;
                            case 15:
                                i4 = 14;
                                break;
                            case 16:
                                i4 = 12;
                                break;
                        }
                    } else {
                        i4 = 9;
                    }
                }
                float f2 = dimension / resources.getDisplayMetrics().density;
                float f3 = dimension2 / resources.getDisplayMetrics().density;
                I.recycle();
                ade adeVar = new ade(null, f2, f3, a, a2, j2, i4, z, 1);
                i5 = 0;
                for (int i11 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i11); i11 = 3) {
                    XmlPullParser xmlPullParser = fj0Var.a;
                    int i12 = i3;
                    g8c g8cVar = fj0Var.c;
                    XmlResourceParser xmlResourceParser = xml;
                    eventType = xmlPullParser.getEventType();
                    int i13 = i5;
                    if (eventType != 2) {
                        String name = xmlPullParser.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            if (hashCode == -1649314686) {
                                ddeVar = ddeVar2;
                                if (name.equals("clip-path")) {
                                    TypedArray I2 = pcg.I(resources, theme, asAttributeSet, vq1.d);
                                    fj0Var.b(I2.getChangingConfigurations());
                                    String string = I2.getString(0);
                                    fj0Var.b(I2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    i6 = 1;
                                    String string2 = I2.getString(1);
                                    fj0Var.b(I2.getChangingConfigurations());
                                    List m = string2 == null ? nzt.a : g8c.m(g8cVar, string2);
                                    I2.recycle();
                                    if (adeVar.k) {
                                        sme.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    adeVar.i.add(new zce(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, m, RemoteCameraConfig.Mic.BUFFER_SIZE));
                                    i5 = i13 + 1;
                                } else {
                                    i6 = 1;
                                }
                            } else if (hashCode != 3433509) {
                                if (hashCode == 98629247 && name.equals("group")) {
                                    TypedArray I3 = pcg.I(resources, theme, asAttributeSet, vq1.b);
                                    fj0Var.b(I3.getChangingConfigurations());
                                    float a3 = fj0Var.a(I3, CameraProperty.ROTATION, 5, 0.0f);
                                    float f4 = I3.getFloat(1, 0.0f);
                                    fj0Var.b(I3.getChangingConfigurations());
                                    float f5 = I3.getFloat(2, 0.0f);
                                    fj0Var.b(I3.getChangingConfigurations());
                                    float a4 = fj0Var.a(I3, "scaleX", 3, 1.0f);
                                    float a5 = fj0Var.a(I3, "scaleY", 4, 1.0f);
                                    float a6 = fj0Var.a(I3, "translateX", 6, 0.0f);
                                    float a7 = fj0Var.a(I3, "translateY", 7, 0.0f);
                                    String string3 = I3.getString(0);
                                    fj0Var.b(I3.getChangingConfigurations());
                                    String str2 = string3 == null ? "" : string3;
                                    I3.recycle();
                                    c5b c5bVar = nzt.a;
                                    if (adeVar.k) {
                                        sme.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    adeVar.i.add(new zce(str2, a3, f4, f5, a4, a5, a6, a7, c5bVar, RemoteCameraConfig.Mic.BUFFER_SIZE));
                                    ddeVar = ddeVar2;
                                    i5 = i13;
                                    i6 = 1;
                                }
                            } else if (name.equals("path")) {
                                TypedArray I4 = pcg.I(resources, theme, asAttributeSet, vq1.c);
                                fj0Var.b(I4.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    xq0.x("No path data available");
                                    return null;
                                }
                                String string4 = I4.getString(0);
                                fj0Var.b(I4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                String string5 = I4.getString(2);
                                fj0Var.b(I4.getChangingConfigurations());
                                List m2 = string5 == null ? nzt.a : g8c.m(g8cVar, string5);
                                x0 D = pcg.D(I4, fj0Var.a, theme, "fillColor", 1);
                                fj0Var.b(I4.getChangingConfigurations());
                                float a8 = fj0Var.a(I4, "fillAlpha", 12, 1.0f);
                                int i14 = !pcg.F("strokeLineCap", fj0Var.a) ? -1 : I4.getInt(8, -1);
                                fj0Var.b(I4.getChangingConfigurations());
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        i7 = 2;
                                        if (i14 == 2) {
                                            i8 = 2;
                                        }
                                    } else {
                                        i7 = 2;
                                        i8 = 1;
                                    }
                                    int i15 = pcg.F("strokeLineJoin", fj0Var.a) ? -1 : I4.getInt(9, -1);
                                    fj0Var.b(I4.getChangingConfigurations());
                                    int i16 = i15 == 0 ? i15 != 1 ? i7 : 1 : 0;
                                    float a9 = fj0Var.a(I4, "strokeMiterLimit", 10, 1.0f);
                                    x0 D2 = pcg.D(I4, fj0Var.a, theme, "strokeColor", 3);
                                    fj0Var.b(I4.getChangingConfigurations());
                                    float a10 = fj0Var.a(I4, "strokeAlpha", 11, 1.0f);
                                    float a11 = fj0Var.a(I4, "strokeWidth", 4, 1.0f);
                                    float a12 = fj0Var.a(I4, "trimPathEnd", 6, 1.0f);
                                    float a13 = fj0Var.a(I4, "trimPathOffset", 7, 0.0f);
                                    float a14 = fj0Var.a(I4, "trimPathStart", 5, 0.0f);
                                    int i17 = pcg.F("fillType", fj0Var.a) ? 0 : I4.getInt(13, 0);
                                    fj0Var.b(I4.getChangingConfigurations());
                                    I4.recycle();
                                    shader = (Shader) D.c;
                                    if (shader == null && D.b == 0) {
                                        ddeVar = ddeVar2;
                                        f3rVar = null;
                                    } else if (shader == null) {
                                        f3rVar = new bi3(shader);
                                        ddeVar = ddeVar2;
                                    } else {
                                        ddeVar = ddeVar2;
                                        f3rVar = new f3r(c3x.f(D.b));
                                    }
                                    Shader shader2 = (Shader) D2.c;
                                    ai3 bi3Var = (shader2 == null && D2.b == 0) ? null : shader2 != null ? new bi3(shader2) : new f3r(c3x.f(D2.b));
                                    int i18 = i17 != 0 ? 0 : 1;
                                    if (adeVar.k) {
                                        sme.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((zce) vz1.m(adeVar.i, 1)).j.add(new qzt(str3, m2, i18, f3rVar, a8, bi3Var, a10, a11, i8, i16, a9, a14, a12, a13));
                                    i5 = i13;
                                    i6 = 1;
                                } else {
                                    i7 = 2;
                                }
                                i8 = 0;
                                if (pcg.F("strokeLineJoin", fj0Var.a)) {
                                }
                                fj0Var.b(I4.getChangingConfigurations());
                                if (i15 == 0) {
                                }
                                float a92 = fj0Var.a(I4, "strokeMiterLimit", 10, 1.0f);
                                x0 D22 = pcg.D(I4, fj0Var.a, theme, "strokeColor", 3);
                                fj0Var.b(I4.getChangingConfigurations());
                                float a102 = fj0Var.a(I4, "strokeAlpha", 11, 1.0f);
                                float a112 = fj0Var.a(I4, "strokeWidth", 4, 1.0f);
                                float a122 = fj0Var.a(I4, "trimPathEnd", 6, 1.0f);
                                float a132 = fj0Var.a(I4, "trimPathOffset", 7, 0.0f);
                                float a142 = fj0Var.a(I4, "trimPathStart", 5, 0.0f);
                                if (pcg.F("fillType", fj0Var.a)) {
                                }
                                fj0Var.b(I4.getChangingConfigurations());
                                I4.recycle();
                                shader = (Shader) D.c;
                                if (shader == null) {
                                    ddeVar = ddeVar2;
                                    f3rVar = null;
                                    Shader shader22 = (Shader) D22.c;
                                    if (shader22 == null) {
                                        if (i17 != 0) {
                                        }
                                        if (adeVar.k) {
                                        }
                                        ((zce) vz1.m(adeVar.i, 1)).j.add(new qzt(str3, m2, i18, f3rVar, a8, bi3Var, a102, a112, i8, i16, a92, a142, a122, a132));
                                        i5 = i13;
                                        i6 = 1;
                                    }
                                    if (i17 != 0) {
                                    }
                                    if (adeVar.k) {
                                    }
                                    ((zce) vz1.m(adeVar.i, 1)).j.add(new qzt(str3, m2, i18, f3rVar, a8, bi3Var, a102, a112, i8, i16, a92, a142, a122, a132));
                                    i5 = i13;
                                    i6 = 1;
                                }
                                if (shader == null) {
                                }
                                Shader shader222 = (Shader) D22.c;
                                if (shader222 == null) {
                                }
                                if (i17 != 0) {
                                }
                                if (adeVar.k) {
                                }
                                ((zce) vz1.m(adeVar.i, 1)).j.add(new qzt(str3, m2, i18, f3rVar, a8, bi3Var, a102, a112, i8, i16, a92, a142, a122, a132));
                                i5 = i13;
                                i6 = 1;
                            }
                            xmlResourceParser.next();
                            i3 = i6;
                            ddeVar2 = ddeVar;
                            xml = xmlResourceParser;
                        }
                        ddeVar = ddeVar2;
                        i6 = 1;
                    } else if (eventType != i11) {
                        ddeVar = ddeVar2;
                        i6 = i12;
                    } else {
                        if ("group".equals(xmlPullParser.getName())) {
                            int i19 = i13 + 1;
                            int i20 = 0;
                            while (i20 < i19) {
                                ArrayList arrayList = adeVar.i;
                                if (adeVar.k) {
                                    sme.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                zce zceVar = (zce) arrayList.remove(arrayList.size() - 1);
                                ((zce) vz1.m(arrayList, i12)).j.add(new mzt(zceVar.a, zceVar.b, zceVar.c, zceVar.d, zceVar.e, zceVar.f, zceVar.g, zceVar.h, zceVar.i, zceVar.j));
                                i20++;
                                i12 = 1;
                            }
                            ddeVar = ddeVar2;
                            i6 = 1;
                            i5 = 0;
                            xmlResourceParser.next();
                            i3 = i6;
                            ddeVar2 = ddeVar;
                            xml = xmlResourceParser;
                        }
                        ddeVar = ddeVar2;
                        i6 = 1;
                    }
                    i5 = i13;
                    xmlResourceParser.next();
                    i3 = i6;
                    ddeVar2 = ddeVar;
                    xml = xmlResourceParser;
                }
                dde ddeVar3 = ddeVar2;
                cdeVar = new cde(adeVar.b(), i9);
                edeVar.a.put(ddeVar3, new WeakReference(cdeVar));
            }
            i4 = 5;
            float f22 = dimension / resources.getDisplayMetrics().density;
            float f32 = dimension2 / resources.getDisplayMetrics().density;
            I.recycle();
            ade adeVar2 = new ade(null, f22, f32, a, a2, j2, i4, z, 1);
            i5 = 0;
            while (xml.getEventType() != i3) {
                XmlPullParser xmlPullParser2 = fj0Var.a;
                int i122 = i3;
                g8c g8cVar2 = fj0Var.c;
                XmlResourceParser xmlResourceParser2 = xml;
                eventType = xmlPullParser2.getEventType();
                int i132 = i5;
                if (eventType != 2) {
                }
                i5 = i132;
                xmlResourceParser2.next();
                i3 = i6;
                ddeVar2 = ddeVar;
                xml = xmlResourceParser2;
            }
            dde ddeVar32 = ddeVar2;
            cdeVar = new cde(adeVar2.b(), i9);
            edeVar.a.put(ddeVar32, new WeakReference(cdeVar));
        }
        pzt Z = wyf.Z(cdeVar.a, oq5Var);
        oq5Var.p(false);
        return Z;
    }

    public static final void F(e4 e4Var, psd psdVar, int i) {
        psdVar.getClass();
        Map e = uah.e(new Pair("trace", psdVar.b), new Pair("trackCount", Integer.valueOf(i)));
        y70 y70Var = new y70("TRACKS_REQUEST", e);
        jyr jyrVar = e4Var.a;
        it0 it0Var = (it0) jyrVar.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : e.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        it0Var.a("TRACKS_REQUEST", linkedHashMap);
        ((it0) jyrVar.getValue()).getClass();
        it0.b.e().c(y70Var, "Network");
    }

    public static final void G(Context context, mqs mqsVar, Function0 function0) {
        ezd ezdVar;
        drt drtVar;
        context.getClass();
        mqsVar.getClass();
        function0.getClass();
        n8g b = t75.b();
        b.add(st.c);
        b.add(st.e);
        n8g a = t75.a(b);
        l18 l18Var = l18.b;
        bdt I = hag.I(qqs.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        qqs qqsVar = (qqs) qdcVar.C(I);
        yxc a2 = qqsVar.a();
        boolean z = true;
        if (((a2 == null || (drtVar = a2.a) == null || drtVar.d) ? q5g.N(mqsVar, qqsVar.c(true)) : new fa(new IllegalStateException("User not authorized"))).equals(ea.a)) {
            if (a == null || !a.isEmpty()) {
                ListIterator listIterator = a.listIterator(0);
                do {
                    ezdVar = (ezd) listIterator;
                    if (ezdVar.hasNext()) {
                    }
                } while (((nlm) ezdVar.next()).apply(mqsVar));
            }
            function0.invoke();
            return;
        }
        ayk aykVar = new ayk(context);
        bdt I2 = hag.I(byb.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        if (!((i4j) ((byb) qdcVar2.C(I2)).b(i4j.class)).h()) {
            z = true ^ mqsVar.g().contains(h94.c);
        } else if (lxe.o(mqsVar.h()) != null) {
            z = false;
        }
        if (z) {
            aykVar.c(mqsVar);
            return;
        }
        if (!frc.a.a()) {
            hag.x(context, R.string.bottom_sheet_track_no_rights_title, 0);
            return;
        }
        t a3 = aykVar.a();
        if (a3 == null) {
            ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
            hag.x(context, R.string.bottom_sheet_track_no_rights_title, 0);
            return;
        }
        n58 K = ild.K(mqsVar);
        if (K != null) {
            i58 i58Var = new i58();
            i58Var.l = K;
            i58Var.m = function0;
            i58Var.n = null;
            i58Var.o = null;
            y supportFragmentManager = a3.getSupportFragmentManager();
            supportFragmentManager.getClass();
            x7f.B(i58Var, supportFragmentManager, "DISCLAIMER_DIALOG");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H(Context context, List list, String str, Integer num, boolean z, Function0 function0) {
        Object obj;
        context.getClass();
        list.getClass();
        mqs mqsVar = null;
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((mqs) obj).a, str)) {
                        break;
                    }
                }
            }
            mqs mqsVar2 = (mqs) obj;
            if (mqsVar2 != null) {
                mqsVar = mqsVar2;
                if (mqsVar == null) {
                    G(context, mqsVar, function0);
                    return;
                } else {
                    function0.invoke();
                    return;
                }
            }
        }
        mqs mqsVar3 = num != null ? (mqs) CollectionsKt.S(list, num.intValue()) : null;
        if (mqsVar3 == null) {
            if (list.size() != 1 || !z) {
                list = null;
            }
            if (list != null) {
                mqsVar = (mqs) list.get(0);
            }
        } else {
            mqsVar = mqsVar3;
        }
        if (mqsVar == null) {
        }
    }

    public static final List I(X509Certificate x509Certificate) {
        byte[] bArr;
        l38 l38Var;
        r0u r0uVar;
        k38 k38Var;
        x509Certificate.getClass();
        s0 y = s0.y(o0.B(x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.4.2")).a);
        y.getClass();
        byte[] bArr2 = ((a07) y).a;
        bArr2.getClass();
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        byteArrayInputStream.read();
        if (byteArrayInputStream.read() < 0) {
            xq0.v();
            return null;
        }
        while (byteArrayInputStream.available() > 2) {
            int read = byteArrayInputStream.read();
            int read2 = byteArrayInputStream.read();
            if (read2 < 0) {
                xq0.v();
                return null;
            }
            int i = (read << 8) | read2;
            if (i < 1) {
                bArr = ox6.i;
            } else {
                byte[] bArr3 = new byte[i];
                if (i != zdg.C(byteArrayInputStream, bArr3, i)) {
                    xq0.v();
                    return null;
                }
                bArr = bArr3;
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            ovk ovkVar = r0u.b;
            int Q = (int) c3x.Q(byteArrayInputStream2, 1);
            ovkVar.getClass();
            r0u[] values = r0u.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                l38Var = null;
                if (i2 >= length) {
                    r0uVar = null;
                    break;
                }
                r0uVar = values[i2];
                if (r0uVar.a == Q) {
                    break;
                }
                i2++;
            }
            if (r0uVar == null) {
                r0uVar = r0u.UNKNOWN_VERSION;
            }
            r0u r0uVar2 = r0uVar;
            if (r0uVar2 != r0u.V1) {
                throw new yhp("Unknown version: " + r0uVar2);
            }
            byte[] bArr4 = new byte[32];
            int read3 = byteArrayInputStream2.read(bArr4);
            if (read3 < 32) {
                kac.f(hrg.o("Not enough bytes: Expected 32, got ", read3, '.'));
                return null;
            }
            long Q2 = c3x.Q(byteArrayInputStream2, 8);
            byte[] R = c3x.R(byteArrayInputStream2);
            int Q3 = (int) c3x.Q(byteArrayInputStream2, 1);
            k38.b.getClass();
            k38[] values2 = k38.values();
            int length2 = values2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    k38Var = null;
                    break;
                }
                k38Var = values2[i3];
                if (k38Var.a == Q3) {
                    break;
                }
                i3++;
            }
            if (k38Var == null) {
                String num = Integer.toString(Q3, CharsKt.checkRadix(16));
                num.getClass();
                throw new yhp("Unknown hash algorithm: ".concat(num));
            }
            int Q4 = (int) c3x.Q(byteArrayInputStream2, 1);
            l38.b.getClass();
            l38[] values3 = l38.values();
            int length3 = values3.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    break;
                }
                l38 l38Var2 = values3[i4];
                if (l38Var2.a == Q4) {
                    l38Var = l38Var2;
                    break;
                }
                i4++;
            }
            if (l38Var == null) {
                String num2 = Integer.toString(Q4, CharsKt.checkRadix(16));
                num2.getClass();
                throw new yhp("Unknown signature algorithm: ".concat(num2));
            }
            arrayList.add(new yfq(r0uVar2, new erg(bArr4), Q2, new m38(k38Var, l38Var, c3x.R(byteArrayInputStream2)), R));
        }
        return CollectionsKt.w0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(fan fanVar, k1l k1lVar, uyk uykVar, Function1 function1, cg6 cg6Var) {
        bgh bghVar;
        int i;
        if (cg6Var instanceof bgh) {
            bghVar = (bgh) cg6Var;
            int i2 = bghVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bghVar.k = i2 - Integer.MIN_VALUE;
                Object obj = bghVar.j;
                nm6 nm6Var = nm6.a;
                i = bghVar.k;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    NoopCallbackCommand noopCallbackCommand = new NoopCallbackCommand();
                    yk3 yk3Var = new yk3(11);
                    zi3 g = men.g(-1, 6, null);
                    yk3Var.k(new uvg(4, g));
                    k1lVar.b(((e3q) fanVar).c(uykVar, yk3Var, function1, false, noopCallbackCommand), new b3t("start_queue"));
                    msa msaVar = nsa.b;
                    long M = yd5.M(45, ssa.SECONDS);
                    zig zigVar = new zig(noopCallbackCommand, g, continuation, 13);
                    bghVar.k = 1;
                    obj = tyf.K(M, zigVar, bghVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        bghVar = new bgh(cg6Var);
        Object obj2 = bghVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bghVar.k;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    public static final ArrayList M(List list, Function1 function1) {
        String w;
        String w2;
        List<oq> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (oq oqVar : list2) {
            oqVar.getClass();
            v1g v1gVar = new v1g(oqVar.b, vz1.w(oqVar.D.a), oqVar.i(), qo6.g);
            l18 l18Var = l18.b;
            bdt I = hag.I(k8w.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            x1g x1gVar = new x1g(v1gVar, ((m8w) ((k8w) qdcVar.C(I))).a(oqVar));
            boolean booleanValue = ((Boolean) function1.invoke(oqVar.a)).booleanValue();
            int i = oqVar.q;
            if (i >= 0) {
                int i2 = i + (booleanValue ? 1 : 0);
                w = y3g.a(i2);
                w2 = dag.A(i2, booleanValue);
            } else {
                w = etn.w(oqVar);
                w2 = etn.w(oqVar);
            }
            arrayList.add(new b9j(x1gVar, new w3g(w, w2, booleanValue), oqVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String N(YMApplication yMApplication) {
        Object obj;
        vju.a.lock();
        Object obj2 = null;
        try {
            r7o r7oVar = z7o.b;
            byte[] readFully = new AtomicFile(new File(quj.i0(yMApplication), "puid")).readFully();
            readFully.getClass();
            String obj3 = StringsKt.t0(new String(readFully, Charsets.UTF_8)).toString();
            int length = obj3.length();
            obj = obj3;
            if (length <= 0) {
                obj = null;
            }
        } finally {
            if (obj instanceof t7o) {
            }
            return (String) obj2;
        }
        if (obj instanceof t7o) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public static final Object O(y3l y3lVar, oow oowVar, Function2 function2, cg6 cg6Var) {
        if (oowVar instanceof kow) {
            kow kowVar = (kow) oowVar;
            Object P = P(y3lVar, kowVar, kowVar.a, kowVar.i, function2, cg6Var);
            nm6 nm6Var = nm6.a;
            if (P != nm6Var) {
                P = Unit.a;
            }
            return P == nm6Var ? P : Unit.a;
        }
        if (!(oowVar instanceof low)) {
            if ((oowVar instanceof now) || (oowVar instanceof jow)) {
                return Unit.a;
            }
            b6e.s();
            return null;
        }
        low lowVar = (low) oowVar;
        Object P2 = P(y3lVar, lowVar, lowVar.a, lowVar.i, function2, cg6Var);
        nm6 nm6Var2 = nm6.a;
        if (P2 != nm6Var2) {
            P2 = Unit.a;
        }
        return P2 == nm6Var2 ? P2 : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(y3l y3lVar, mow mowVar, eu7 eu7Var, mqs mqsVar, Function2 function2, cg6 cg6Var) {
        m0u m0uVar;
        Object obj;
        int i;
        if (cg6Var instanceof m0u) {
            m0uVar = (m0u) cg6Var;
            int i2 = m0uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0uVar.n = i2 - Integer.MIN_VALUE;
                obj = m0uVar.m;
                Object obj2 = nm6.a;
                i = m0uVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!eu7Var.f()) {
                        throw new PlaybackQueueStartValidator$InvalidQueueException((Throwable) function2.invoke(mowVar, "WaveQueuePointer has no current element"), null);
                    }
                    mwk b = eu7Var.b();
                    m0uVar.j = mowVar;
                    m0uVar.k = mqsVar;
                    m0uVar.l = function2;
                    m0uVar.n = 1;
                    obj = Boolean.valueOf(Intrinsics.d(((z3l) y3lVar).a.b(b, true), ea.a));
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function2 = m0uVar.l;
                    mqsVar = m0uVar.k;
                    mowVar = m0uVar.j;
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                throw new PlaybackQueueStartValidator$InvalidQueueException((Throwable) function2.invoke(mowVar, hrg.s("Track(id=", mqsVar.a, ", title=", mqsVar.c, ") is illegal")), null);
            }
        }
        m0uVar = new m0u(cg6Var);
        obj = m0uVar.m;
        Object obj22 = nm6.a;
        i = m0uVar.n;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static final wcx Q(edx edxVar) {
        try {
            bdx o = edxVar.o();
            if (o == null) {
                throw new kcx("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = o.b;
                byte b2 = o.a;
                int i = 0;
                if (b2 == Byte.MIN_VALUE) {
                    long a = edxVar.a();
                    if (a > 1000) {
                        throw new kcx("Parser being asked to read a large CBOR array");
                    }
                    R(b, a);
                    wcx[] wcxVarArr = new wcx[(int) a];
                    while (i < a) {
                        wcxVarArr[i] = Q(edxVar);
                        i++;
                    }
                    return new dcx(q5x.v(wcxVarArr));
                }
                try {
                    if (b2 != -96) {
                        if (b2 == -64) {
                            throw new kcx("Tags are currently unsupported");
                        }
                        if (b2 == -32) {
                            return new gcx(edxVar.z());
                        }
                        if (b2 == 0 || b2 == 32) {
                            long b3 = edxVar.b();
                            R(b, b3 > 0 ? b3 : ~b3);
                            return new lcx(b3);
                        }
                        if (b2 == 64) {
                            edxVar.I((byte) 64);
                            byte[] P = edxVar.P();
                            int length = P.length;
                            R(b, length);
                            return new icx(obx.t(length, P));
                        }
                        if (b2 != 96) {
                            throw new kcx("Unidentifiable major type: " + ((b2 >> 5) & 7));
                        }
                        edxVar.I((byte) 96);
                        String str = new String(edxVar.P(), StandardCharsets.UTF_8);
                        R(b, str.length());
                        return new scx(str);
                    }
                    long g = edxVar.g();
                    if (g > 1000) {
                        throw new kcx("Parser being asked to read a large CBOR map");
                    }
                    R(b, g);
                    int i2 = (int) g;
                    y8p[] y8pVarArr = new y8p[i2];
                    wcx wcxVar = null;
                    int i3 = 0;
                    while (i3 < g) {
                        wcx Q = Q(edxVar);
                        if (wcxVar != null && Q.compareTo(wcxVar) <= 0) {
                            throw new pg5("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + wcxVar.toString() + "\nCurrent key: " + Q.toString());
                        }
                        y8pVarArr[i3] = new y8p(Q, Q(edxVar), false, 18);
                        i3++;
                        wcxVar = Q;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        y8p y8pVar = y8pVarArr[i];
                        if (treeMap.containsKey((wcx) y8pVar.b)) {
                            throw new pg5("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((wcx) y8pVar.b, (wcx) y8pVar.c);
                        i++;
                    }
                    return new pcx(z5x.b(treeMap));
                } catch (RuntimeException e) {
                    e = e;
                    throw new kcx(e);
                }
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            throw new kcx(e3);
        }
    }

    public static final void R(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new pg5(dfi.e(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new pg5(dfi.e(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new pg5(dfi.e(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new pg5(dfi.e(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static final void a(wf wfVar, Function0 function0, yci yciVar, String str, String str2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1350370220);
        int i2 = i | (oq5Var.f(wfVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.f(str) ? 2048 : 1024) | (oq5Var.f(str2) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            yci d = d.d(d.g(yciVar, 56, 0.0f, 2), 1.0f);
            agr agrVar = eq0.a;
            yci b = a.b(d, ((dq0) oq5Var.j(agrVar)).c.c, vnj.i);
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new or(25, function0);
                oq5Var.k0(K);
            }
            yci e = a.e(b, false, null, null, (Function0) K, 7);
            boolean z2 = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new cb(str2, str, 5);
                oq5Var.k0(K2);
            }
            yci b2 = nfp.b(e, true, (Function1) K2);
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            w4k E = E(wfVar.a, 0, oq5Var);
            float f = 16;
            vci vciVar = vci.a;
            gae.b(E, null, d.m(androidx.compose.foundation.layout.a.q(vciVar, f, 0.0f, 0.0f, 0.0f, 14), 24), wfVar.a(oq5Var), oq5Var, 432, 0);
            String M = rvf.M(wfVar.c, oq5Var);
            ges j = nu0.j();
            long j2 = ((dq0) oq5Var.j(agrVar)).b.a;
            yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), f, 0.0f, 0.0f, 0.0f, 14);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new brg(4);
                oq5Var.k0(K3);
            }
            xv7.j(M, nfp.a(q, (Function1) K3), j2, 0L, 0L, 0, 0L, 2, false, 1, 0, null, j, oq5Var, 0, 3120, 55288);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(wfVar, function0, yciVar, str, str2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0073  */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, String str2, Function0 function0, yci yciVar, Integer num, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        Integer num2;
        oq5 oq5Var;
        yci yciVar3;
        Integer num3;
        xmn r;
        Integer valueOf;
        int i3;
        int i4;
        vci vciVar;
        agr agrVar;
        ?? r15;
        oq5 oq5Var2;
        int i5;
        str.getClass();
        function0.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-385971111);
        int i6 = (oq5Var3.f(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= oq5Var3.f(str2) ? 32 : 16;
        }
        int i7 = i6 | (oq5Var3.h(function0) ? 256 : 128);
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i7 |= oq5Var3.f(yciVar2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    num2 = num;
                    if (oq5Var3.f(num2)) {
                        i5 = 16384;
                        i7 |= i5;
                    }
                } else {
                    num2 = num;
                }
                i5 = RemoteCameraConfig.Notification.ID;
                i7 |= i5;
            } else {
                num2 = num;
            }
            if (oq5Var3.P(i7 & 1, (i7 & 9363) == 9362)) {
                oq5Var3.S();
                oq5Var = oq5Var3;
                yciVar3 = yciVar2;
                num3 = num2;
            } else {
                oq5Var3.U();
                int i9 = i & 1;
                vci vciVar2 = vci.a;
                if (i9 == 0 || oq5Var3.y()) {
                    if (i8 != 0) {
                        yciVar2 = vciVar2;
                    }
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                        valueOf = Integer.valueOf(R.drawable.ic_arrow_mid_right_edge_24);
                        oq5Var3.q();
                        hz2 hz2Var = b2c.l;
                        yci yciVar4 = yciVar2;
                        float f = 16;
                        yci m = androidx.compose.foundation.layout.a.m(a.e(yciVar2, false, null, null, function0, 7), f);
                        nho a = lho.a(qx0.a, hz2Var, oq5Var3, 48);
                        i3 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l = oq5Var3.l();
                        yci H = vnj.H(oq5Var3, m);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.n0();
                        } else {
                            oq5Var3.k(grbVar);
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(oq5Var3, a, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(oq5Var3, l, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (!oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                            ouj.x(i3, oq5Var3, i3, kb5Var3);
                        }
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(oq5Var3, H, kb5Var4);
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                        ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                        i4 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                        yci H2 = vnj.H(oq5Var3, layoutWeightElement);
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.n0();
                        } else {
                            oq5Var3.k(grbVar);
                        }
                        g0g.U(oq5Var3, a2, kb5Var);
                        g0g.U(oq5Var3, l2, kb5Var2);
                        if (!oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                            ouj.x(i4, oq5Var3, i4, kb5Var3);
                        }
                        g0g.U(oq5Var3, H2, kb5Var4);
                        agr agrVar2 = eq0.a;
                        xcs.b(str, null, ((dq0) oq5Var3.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var3, i7 & 14, 0, 65530);
                        oq5 oq5Var4 = oq5Var3;
                        if (str2 != null) {
                            oq5Var4.Z(391490542);
                            oq5Var4.p(false);
                            r15 = 0;
                            vciVar = vciVar2;
                            agrVar = agrVar2;
                            oq5Var2 = oq5Var4;
                        } else {
                            oq5Var4.Z(391490543);
                            u1g.l(oq5Var4, d.e(vciVar2, 4));
                            vciVar = vciVar2;
                            agrVar = agrVar2;
                            xcs.b(str2, null, ((dq0) oq5Var4.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var4, 0, 0, 65530);
                            oq5 oq5Var5 = oq5Var4;
                            r15 = 0;
                            oq5Var5.p(false);
                            oq5Var2 = oq5Var5;
                        }
                        oq5Var2.p(true);
                        vci vciVar3 = vciVar;
                        u1g.l(oq5Var2, d.r(vciVar3, f));
                        if (valueOf != null) {
                            oq5Var2.Z(-430745350);
                        } else {
                            oq5Var2.Z(-430745349);
                            gae.b(E(valueOf.intValue(), r15, oq5Var2), null, d.m(vciVar3, 24), ((dq0) oq5Var2.j(agrVar)).a.c, oq5Var2, 432, 0);
                        }
                        oq5Var2.p(r15);
                        oq5Var2.p(true);
                        oq5Var = oq5Var2;
                        num3 = valueOf;
                        yciVar3 = yciVar4;
                    }
                } else {
                    oq5Var3.S();
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                    }
                }
                valueOf = num2;
                oq5Var3.q();
                hz2 hz2Var2 = b2c.l;
                yci yciVar42 = yciVar2;
                float f2 = 16;
                yci m2 = androidx.compose.foundation.layout.a.m(a.e(yciVar2, false, null, null, function0, 7), f2);
                nho a3 = lho.a(qx0.a, hz2Var2, oq5Var3, 48);
                i3 = oq5Var3.P;
                androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                yci H3 = vnj.H(oq5Var3, m2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                }
                kb5 kb5Var5 = wp5.f;
                g0g.U(oq5Var3, a3, kb5Var5);
                kb5 kb5Var22 = wp5.e;
                g0g.U(oq5Var3, l3, kb5Var22);
                kb5 kb5Var32 = wp5.g;
                if (!oq5Var3.O) {
                }
                ouj.x(i3, oq5Var3, i3, kb5Var32);
                kb5 kb5Var42 = wp5.d;
                g0g.U(oq5Var3, H3, kb5Var42);
                if (1.0f <= 0.0d) {
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, 1.0f);
                ta5 a22 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                i4 = oq5Var3.P;
                androidx.compose.runtime.internal.a l22 = oq5Var3.l();
                yci H22 = vnj.H(oq5Var3, layoutWeightElement2);
                oq5Var3.d0();
                if (oq5Var3.O) {
                }
                g0g.U(oq5Var3, a22, kb5Var5);
                g0g.U(oq5Var3, l22, kb5Var22);
                if (!oq5Var3.O) {
                }
                ouj.x(i4, oq5Var3, i4, kb5Var32);
                g0g.U(oq5Var3, H22, kb5Var42);
                agr agrVar22 = eq0.a;
                xcs.b(str, null, ((dq0) oq5Var3.j(agrVar22)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var3, i7 & 14, 0, 65530);
                oq5 oq5Var42 = oq5Var3;
                if (str2 != null) {
                }
                oq5Var2.p(true);
                vci vciVar32 = vciVar;
                u1g.l(oq5Var2, d.r(vciVar32, f2));
                if (valueOf != null) {
                }
                oq5Var2.p(r15);
                oq5Var2.p(true);
                oq5Var = oq5Var2;
                num3 = valueOf;
                yciVar3 = yciVar42;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new cj((Object) str, str2, function0, yciVar3, (Object) num3, i, i2, 15);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 24576) != 0) {
        }
        if (oq5Var3.P(i7 & 1, (i7 & 9363) == 9362)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(boolean z, yci yciVar, Integer num, hq5 hq5Var, int i, int i2) {
        Integer num2;
        yci yciVar2;
        yci yciVar3;
        boolean z2;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(577976238);
        int i4 = i | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                num2 = num;
                if (oq5Var.f(num2)) {
                    i3 = 256;
                    i4 |= i3;
                }
            } else {
                num2 = num;
            }
            i3 = 128;
            i4 |= i3;
        } else {
            num2 = num;
        }
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            oq5Var.U();
            int i5 = i & 1;
            vci vciVar = vci.a;
            if (i5 == 0 || oq5Var.y()) {
                if ((i2 & 4) != 0) {
                    num2 = Integer.valueOf(R.drawable.ic_arrow_mid_right_edge_24);
                }
                yciVar3 = vciVar;
            } else {
                oq5Var.S();
                yciVar3 = yciVar;
            }
            oq5Var.q();
            hz2 hz2Var = b2c.l;
            float f = 16;
            yci m = androidx.compose.foundation.layout.a.m(yciVar3, f);
            nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            pm0.d(d.r(vciVar, BuildConfig.API_LEVEL), nu0.j(), oq5Var, 6);
            if (z) {
                oq5Var.Z(1649622440);
                pm0.d(d.r(vciVar, 100), nu0.i(), oq5Var, 6);
                z2 = false;
            } else {
                z2 = false;
                oq5Var.Z(1643269486);
            }
            oq5Var.p(z2);
            oq5Var.p(true);
            u1g.l(oq5Var, d.r(vciVar, f));
            if (num2 == null) {
                oq5Var.Z(-299578643);
            } else {
                oq5Var.Z(-299578642);
                gae.b(E(num2.intValue(), z2 ? 1 : 0, oq5Var), null, d.m(vciVar, 24), ((dq0) oq5Var.j(eq0.a)).c.c, oq5Var, 432, 0);
                z2 = false;
            }
            oq5Var.p(z2);
            oq5Var.p(true);
            yciVar2 = yciVar3;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        Integer num3 = num2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu(z, yciVar2, num3, i, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final Function0 function0, final boolean z, final long j, final long j2, final long j3, final yci yciVar, float f, boolean z2, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        boolean z3;
        long j4;
        float f2;
        int i4;
        final boolean z4;
        xmn r;
        function0.getClass();
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(818920208);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i3 |= oq5Var.g(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i3 |= oq5Var.e(j4) ? 2048 : 1024;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.e(j3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i) == 0) {
            f2 = f;
            i3 |= oq5Var.c(f2) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= oq5Var.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
            if ((i & 100663296) == 0) {
                i3 |= oq5Var.h(wn5Var) ? 67108864 : 33554432;
            }
            if ((i3 & 38347923) == 38347922 || !oq5Var.z()) {
                if (i5 != 0) {
                    f2 = 64;
                }
                boolean z5 = i4 == 0 ? false : z2;
                yci m = d.m(yciVar, f2);
                tgo tgoVar = ugo.a;
                yci u = xp3.u(a.b(m, j, tgoVar), tgoVar);
                int i6 = i3 >> 3;
                int i7 = (i3 & 126) | (i6 & 896) | (i6 & 7168);
                int i8 = i3 >> 6;
                pd.o(i7 | (458752 & i8) | (i8 & 3670016), 0, j4, j3, wn5Var, oq5Var, u, function0, z3, z5);
                z4 = z5;
            } else {
                oq5Var.S();
                z4 = z2;
            }
            final float f3 = f2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: cgo
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int R = rvf.R(i | 1);
                        a0g.d(Function0.this, z, j, j2, j3, yciVar, f3, z4, wn5Var, (hq5) obj, R, i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        if (i5 != 0) {
        }
        if (i4 == 0) {
        }
        yci m2 = d.m(yciVar, f2);
        tgo tgoVar2 = ugo.a;
        yci u2 = xp3.u(a.b(m2, j, tgoVar2), tgoVar2);
        int i62 = i3 >> 3;
        int i72 = (i3 & 126) | (i62 & 896) | (i62 & 7168);
        int i82 = i3 >> 6;
        pd.o(i72 | (458752 & i82) | (i82 & 3670016), 0, j4, j3, wn5Var, oq5Var, u2, function0, z3, z5);
        z4 = z5;
        final float f32 = f2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00df  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(boolean z, yci yciVar, yci yciVar2, long j, long j2, b0g b0gVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar3;
        int i4;
        yci yciVar4;
        long j3;
        long j4;
        int i5;
        b0g b0gVar2;
        int i6;
        Object K;
        Object obj;
        Object K2;
        aqi aqiVar;
        boolean z2;
        Object K3;
        t6k t6kVar;
        ?? r15;
        yci yciVar5;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1242496984);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar3 = yciVar;
            i3 |= oq5Var.f(yciVar3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                yciVar4 = yciVar2;
                i3 |= oq5Var.f(yciVar4) ? 256 : 128;
                if ((i & 3072) == 0) {
                    j3 = j;
                    i3 |= ((i2 & 8) == 0 && oq5Var.e(j3)) ? 2048 : 1024;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 16) == 0 && oq5Var.e(j4)) ? 16384 : RemoteCameraConfig.Notification.ID;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    b0gVar2 = b0gVar;
                    i3 |= oq5Var.f(b0gVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((74899 & i3) == 74898 || !oq5Var.z()) {
                        oq5Var.U();
                        if ((i & 1) != 0 || oq5Var.y()) {
                            vci vciVar = vci.a;
                            if (i7 != 0) {
                                yciVar3 = vciVar;
                            }
                            if (i4 != 0) {
                                yciVar4 = vciVar;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                j3 = ((dq0) oq5Var.j(eq0.a)).a.a;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                j4 = ((dq0) oq5Var.j(eq0.a)).a.a;
                            }
                            if (i5 != 0) {
                                b0gVar2 = b0g.d;
                            }
                        } else {
                            oq5Var.S();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        oq5Var.q();
                        int i8 = i3 >> 3;
                        kfh d = ug3.d(b2c.b, false);
                        i6 = oq5Var.P;
                        androidx.compose.runtime.internal.a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, yciVar3);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        yci yciVar6 = yciVar3;
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, d, wp5.f);
                        g0g.U(oq5Var, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                            ouj.x(i6, oq5Var, i6, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        K = oq5Var.K();
                        obj = gq5.a;
                        if (K == obj) {
                            K = tlm.h(z ? 1.0f : 0.0f, oq5Var);
                        }
                        poi poiVar = (poi) K;
                        K2 = oq5Var.K();
                        if (K2 == obj) {
                            K2 = szf.g0(Boolean.valueOf(!z));
                            oq5Var.k0(K2);
                        }
                        aqiVar = (aqi) K2;
                        Boolean valueOf = Boolean.valueOf(z);
                        z2 = (i3 & 14) != 4;
                        K3 = oq5Var.K();
                        if (!z2 || K3 == obj) {
                            K3 = new cg1(z, poiVar, aqiVar, (Continuation) null, 9);
                            oq5Var.k0(K3);
                        }
                        gld.w(oq5Var, valueOf, (Function2) K3);
                        t6kVar = (t6k) poiVar;
                        if (t6kVar.e() <= 0.0f) {
                            oq5Var.Z(-1549490779);
                            w4k E = E(b0gVar2.a, 0, oq5Var);
                            Object K4 = oq5Var.K();
                            if (K4 == obj) {
                                K4 = new lhd(18, t6kVar);
                                oq5Var.k0(K4);
                            }
                            gae.b(E, null, androidx.compose.ui.graphics.a.a(yciVar4, (Function1) K4), j3, oq5Var, (i3 & 7168) | 48, 0);
                            r15 = 0;
                        } else {
                            r15 = 0;
                            oq5Var.Z(-1551754864);
                        }
                        oq5Var.p(r15);
                        if (((Boolean) aqiVar.getValue()).booleanValue()) {
                            oq5Var.Z(-1551754864);
                        } else {
                            oq5Var.Z(-1549113571);
                            gae.b(E(b0gVar2.b, r15, oq5Var), null, yciVar4, j4, oq5Var, (i3 & 896) | 48 | (i8 & 7168), 0);
                        }
                        oq5Var.p(r15);
                        oq5Var.p(true);
                        yciVar5 = yciVar6;
                    } else {
                        oq5Var.S();
                        yciVar5 = yciVar3;
                    }
                    yci yciVar7 = yciVar4;
                    long j5 = j3;
                    long j6 = j4;
                    b0g b0gVar3 = b0gVar2;
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new sl3(z, yciVar5, yciVar7, j5, j6, b0gVar3, i, i2);
                        return;
                    }
                    return;
                }
                b0gVar2 = b0gVar;
                if ((74899 & i3) == 74898) {
                }
                oq5Var.U();
                if ((i & 1) != 0) {
                }
                vci vciVar2 = vci.a;
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                oq5Var.q();
                int i82 = i3 >> 3;
                kfh d2 = ug3.d(b2c.b, false);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, yciVar3);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                yci yciVar62 = yciVar3;
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i6, oq5Var, i6, kb5Var2);
                g0g.U(oq5Var, H2, wp5.d);
                K = oq5Var.K();
                obj = gq5.a;
                if (K == obj) {
                }
                poi poiVar2 = (poi) K;
                K2 = oq5Var.K();
                if (K2 == obj) {
                }
                aqiVar = (aqi) K2;
                Boolean valueOf2 = Boolean.valueOf(z);
                if ((i3 & 14) != 4) {
                }
                K3 = oq5Var.K();
                if (!z2) {
                }
                K3 = new cg1(z, poiVar2, aqiVar, (Continuation) null, 9);
                oq5Var.k0(K3);
                gld.w(oq5Var, valueOf2, (Function2) K3);
                t6kVar = (t6k) poiVar2;
                if (t6kVar.e() <= 0.0f) {
                }
                oq5Var.p(r15);
                if (((Boolean) aqiVar.getValue()).booleanValue()) {
                }
                oq5Var.p(r15);
                oq5Var.p(true);
                yciVar5 = yciVar62;
                yci yciVar72 = yciVar4;
                long j52 = j3;
                long j62 = j4;
                b0g b0gVar32 = b0gVar2;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            yciVar4 = yciVar2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            b0gVar2 = b0gVar;
            if ((74899 & i3) == 74898) {
            }
            oq5Var.U();
            if ((i & 1) != 0) {
            }
            vci vciVar22 = vci.a;
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            oq5Var.q();
            int i822 = i3 >> 3;
            kfh d22 = ug3.d(b2c.b, false);
            i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, yciVar3);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var.d0();
            yci yciVar622 = yciVar3;
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d22, wp5.f);
            g0g.U(oq5Var, l22, wp5.e);
            kb5 kb5Var22 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i6, oq5Var, i6, kb5Var22);
            g0g.U(oq5Var, H22, wp5.d);
            K = oq5Var.K();
            obj = gq5.a;
            if (K == obj) {
            }
            poi poiVar22 = (poi) K;
            K2 = oq5Var.K();
            if (K2 == obj) {
            }
            aqiVar = (aqi) K2;
            Boolean valueOf22 = Boolean.valueOf(z);
            if ((i3 & 14) != 4) {
            }
            K3 = oq5Var.K();
            if (!z2) {
            }
            K3 = new cg1(z, poiVar22, aqiVar, (Continuation) null, 9);
            oq5Var.k0(K3);
            gld.w(oq5Var, valueOf22, (Function2) K3);
            t6kVar = (t6k) poiVar22;
            if (t6kVar.e() <= 0.0f) {
            }
            oq5Var.p(r15);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
            }
            oq5Var.p(r15);
            oq5Var.p(true);
            yciVar5 = yciVar622;
            yci yciVar722 = yciVar4;
            long j522 = j3;
            long j622 = j4;
            b0g b0gVar322 = b0gVar2;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar3 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        yciVar4 = yciVar2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        b0gVar2 = b0gVar;
        if ((74899 & i3) == 74898) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        vci vciVar222 = vci.a;
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        oq5Var.q();
        int i8222 = i3 >> 3;
        kfh d222 = ug3.d(b2c.b, false);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, yciVar3);
        xp5.T.getClass();
        grb grbVar222 = wp5.b;
        oq5Var.d0();
        yci yciVar6222 = yciVar3;
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d222, wp5.f);
        g0g.U(oq5Var, l222, wp5.e);
        kb5 kb5Var222 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var222);
        g0g.U(oq5Var, H222, wp5.d);
        K = oq5Var.K();
        obj = gq5.a;
        if (K == obj) {
        }
        poi poiVar222 = (poi) K;
        K2 = oq5Var.K();
        if (K2 == obj) {
        }
        aqiVar = (aqi) K2;
        Boolean valueOf222 = Boolean.valueOf(z);
        if ((i3 & 14) != 4) {
        }
        K3 = oq5Var.K();
        if (!z2) {
        }
        K3 = new cg1(z, poiVar222, aqiVar, (Continuation) null, 9);
        oq5Var.k0(K3);
        gld.w(oq5Var, valueOf222, (Function2) K3);
        t6kVar = (t6k) poiVar222;
        if (t6kVar.e() <= 0.0f) {
        }
        oq5Var.p(r15);
        if (((Boolean) aqiVar.getValue()).booleanValue()) {
        }
        oq5Var.p(r15);
        oq5Var.p(true);
        yciVar5 = yciVar6222;
        yci yciVar7222 = yciVar4;
        long j5222 = j3;
        long j6222 = j4;
        b0g b0gVar3222 = b0gVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void f(mwg mwgVar, List list, Function2 function2, Function0 function0, hq5 hq5Var, int i) {
        mwgVar.getClass();
        list.getClass();
        function2.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1419459622);
        int i2 = (oq5Var.f(mwgVar) ? 4 : 2) | i | (oq5Var.f(list) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            zsd.t(438, 8, ild.C(266955396, new m2g(4, mwgVar, function0), oq5Var), ild.C(-2120941227, new gab(7, list, function2), oq5Var), oq5Var, androidx.compose.ui.platform.a.a(vci.a, "long_tap_bottom_sheet"), false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(i, 14, mwgVar, list, function2, function0);
        }
    }

    public static final void g(final mwg mwgVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1523418210);
        int i2 = i | (oq5Var2.f(mwgVar) ? 4 : 2) | (oq5Var2.h(function0) ? 32 : 16) | 384;
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            yciVar2 = vci.a;
            final int i3 = 0;
            final int i4 = 1;
            oq5Var = oq5Var2;
            ngg.i(function0, androidx.compose.ui.platform.a.a(yciVar2, "long_tap_bottom_sheet_arrow"), ild.C(-574516828, new Function2() { // from class: ewg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                mwg mwgVar2 = mwgVar;
                                String str = mwgVar2.c;
                                qo6 qo6Var = mwgVar2.d;
                                e9g e9gVar = e9g.b;
                                irf.y(str, qo6Var, androidx.compose.ui.platform.a.a(d.m(vci.a, lsq.s(e9gVar)), "long_tap_bottom_sheet_cover"), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var3, 6), oq5Var3, 0, 120);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                vci vciVar = vci.a;
                                yci d = d.d(vciVar, 1.0f);
                                ta5 a = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                                int i5 = oq5Var4.P;
                                androidx.compose.runtime.internal.a l = oq5Var4.l();
                                yci H = vnj.H(oq5Var4, d);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var4.d0();
                                if (oq5Var4.O) {
                                    oq5Var4.k(grbVar);
                                } else {
                                    oq5Var4.n0();
                                }
                                g0g.U(oq5Var4, a, wp5.f);
                                g0g.U(oq5Var4, l, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var4, i5, kb5Var);
                                }
                                g0g.U(oq5Var4, H, wp5.d);
                                mwg mwgVar3 = mwgVar;
                                a0g.h(mwgVar3.a, mwgVar3.e, oq5Var4, 0);
                                String str2 = mwgVar3.b;
                                if (str2 == null) {
                                    oq5Var4.Z(-1905452872);
                                } else {
                                    oq5Var4.Z(-1905452871);
                                    u1g.l(oq5Var4, d.e(vciVar, 2));
                                    xv7.j(str2, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "long_tap_bottom_sheet_subtitle"), ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var4, 48, 3120, 55288);
                                }
                                oq5Var4.p(false);
                                oq5Var4.p(true);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var2), false, d85.m, null, null, 0.0f, null, ild.C(-998017027, new Function2() { // from class: ewg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                mwg mwgVar2 = mwgVar;
                                String str = mwgVar2.c;
                                qo6 qo6Var = mwgVar2.d;
                                e9g e9gVar = e9g.b;
                                irf.y(str, qo6Var, androidx.compose.ui.platform.a.a(d.m(vci.a, lsq.s(e9gVar)), "long_tap_bottom_sheet_cover"), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var3, 6), oq5Var3, 0, 120);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                vci vciVar = vci.a;
                                yci d = d.d(vciVar, 1.0f);
                                ta5 a = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                                int i5 = oq5Var4.P;
                                androidx.compose.runtime.internal.a l = oq5Var4.l();
                                yci H = vnj.H(oq5Var4, d);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var4.d0();
                                if (oq5Var4.O) {
                                    oq5Var4.k(grbVar);
                                } else {
                                    oq5Var4.n0();
                                }
                                g0g.U(oq5Var4, a, wp5.f);
                                g0g.U(oq5Var4, l, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var4, i5, kb5Var);
                                }
                                g0g.U(oq5Var4, H, wp5.d);
                                mwg mwgVar3 = mwgVar;
                                a0g.h(mwgVar3.a, mwgVar3.e, oq5Var4, 0);
                                String str2 = mwgVar3.b;
                                if (str2 == null) {
                                    oq5Var4.Z(-1905452872);
                                } else {
                                    oq5Var4.Z(-1905452871);
                                    u1g.l(oq5Var4, d.e(vciVar, 2));
                                    xv7.j(str2, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "long_tap_bottom_sheet_subtitle"), ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var4, 48, 3120, 55288);
                                }
                                oq5Var4.p(false);
                                oq5Var4.p(true);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var2), oq5Var, ((i2 >> 3) & 14) | 805331328, 488);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(i, 28, yciVar2, mwgVar, function0);
        }
    }

    public static final void h(String str, jzb jzbVar, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1164620389);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            bg3.a(null, null, false, ild.C(852158469, new gab(6, jzbVar, str), oq5Var), oq5Var, 3072, 7);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dwg(str, jzbVar, i, 0);
        }
    }

    public static final void i(int i, hq5 hq5Var, yci yciVar, List list) {
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1742788037);
        int i2 = 16;
        int i3 = (oq5Var.f(list) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        int i4 = 1;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            int K = ff7.K(164, oq5Var);
            Object K2 = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K2 == kjnVar) {
                K2 = szf.g0(Boolean.TRUE);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new jc(aqiVar, i2);
                oq5Var.k0(K3);
            }
            Function0 function0 = (Function0) K3;
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = new jc(aqiVar, 17);
                oq5Var.k0(K4);
            }
            wyf.c(null, function0, (Function0) K4, null, null, oq5Var, 3456, 51);
            yci c = d.c(yciVar, 1.0f);
            boolean d = oq5Var.d(K);
            Object K5 = oq5Var.K();
            if (d || K5 == kjnVar) {
                K5 = new gv(K, i4);
                oq5Var.k0(K5);
            }
            yci b = androidx.compose.ui.layout.a.b(c, (pyc) K5);
            fvf a = hvf.a(0, (int) (K * 0.2f), oq5Var, 0, 1);
            x2i x2iVar = qx0.a;
            nx0 nx0Var = new nx0(16, false, new ucs(2, 9));
            boolean z = (i3 & 14) == 4;
            Object K6 = oq5Var.K();
            if (z || K6 == kjnVar) {
                K6 = new avi(7, list, aqiVar);
                oq5Var.k0(K6);
            }
            oq5Var = oq5Var;
            weo.f(b, a, null, nx0Var, null, null, false, null, (Function1) K6, oq5Var, 12607488, 364);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o68(list, yciVar, i, 2);
        }
    }

    public static final void j(int i, int i2, hq5 hq5Var, Function0 function0, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1762834711);
        int i3 = (oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.g(z) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            int K = ff7.K(164, oq5Var);
            Object K2 = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K2 == kjnVar) {
                K2 = gld.R(g.a, oq5Var);
                oq5Var.k0(K2);
            }
            mm6 mm6Var = (mm6) K2;
            fvf a = hvf.a(0, (int) (K * 0.85f), oq5Var, 0, 1);
            etn.l(jzj.a.a(null), ild.C(353754025, new o48(a, z, i, 2), oq5Var), oq5Var, 56);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            boolean h = oq5Var.h(context) | oq5Var.h(mm6Var) | oq5Var.f(a) | oq5Var.d(K);
            Object K3 = oq5Var.K();
            if (h || K3 == kjnVar) {
                zy3 zy3Var = new zy3(function0, context, mm6Var, a, K, (Continuation) null, 6);
                oq5Var.k0(zy3Var);
                K3 = zy3Var;
            }
            gld.w(oq5Var, unit, (Function2) K3);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o48(i, i2, function0, z);
        }
    }

    public static final void k(qxl qxlVar, jab jabVar, qzl qzlVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        d85 d85Var;
        qzlVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(167987568);
        int i2 = i | (oq5Var.h(qxlVar) ? 4 : 2) | (oq5Var.h(jabVar) ? 32 : 16) | (oq5Var.f(qzlVar) ? 256 : 128) | 3072;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            te teVar = qxlVar.a;
            float f = qbb.a;
            float f2 = qbb.b;
            float f3 = qbb.c;
            q0k q0kVar = new q0k(f3, f, f3, f2);
            if (((Boolean) gld.O(qzlVar.w, oq5Var).getValue()).booleanValue()) {
                oq5Var.Z(881242944);
                d85Var = k5r.f(oq5Var, false, ((ymk) gld.O(qzlVar.x, oq5Var).getValue()).c);
            } else {
                oq5Var.Z(881359318);
                oq5Var.p(false);
                d85Var = null;
            }
            d85 d85Var2 = d85Var;
            int i3 = i2 & 896;
            boolean h = (i3 == 256) | oq5Var.h(jabVar) | oq5Var.h(qxlVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new q6h(18, qzlVar, jabVar, qxlVar);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            yci b = com.yandex.music.core.ui.compose.a.b(vciVar, null, 0L, 0.0f, null, (Function2) K, 15);
            boolean h2 = oq5Var.h(jabVar) | (i3 == 256) | oq5Var.h(qxlVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new cte(14, qzlVar, jabVar, qxlVar);
                oq5Var.k0(K2);
            }
            xp3.e(teVar, (Function0) K2, b, null, 0.0f, q0kVar, d85Var2, oq5Var, 0, 24);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 2, qxlVar, jabVar, qzlVar, yciVar2);
        }
    }

    public static final void l(ojm ojmVar, bci bciVar, hq5 hq5Var, int i) {
        ojmVar.getClass();
        bciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1787421332);
        int i2 = (oq5Var.h(ojmVar) ? 4 : 2) | i | (oq5Var.h(bciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            sjm sjmVar = (sjm) gld.M(ojmVar.c, oq5Var).getValue();
            if (Intrinsics.d(sjmVar, qjm.a)) {
                oq5Var.Z(-275010984);
                oq5Var.p(false);
            } else {
                if (!(sjmVar instanceof rjm)) {
                    throw vz1.i(oq5Var, -275014091, false);
                }
                oq5Var.Z(64673140);
                int i3 = i2 << 3;
                m((rjm) sjmVar, ojmVar, bciVar, oq5Var, (i3 & 896) | (i3 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(ojmVar, bciVar, i, 21);
        }
    }

    public static final void m(rjm rjmVar, ojm ojmVar, bci bciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(892462857);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(rjmVar) : oq5Var.h(rjmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(ojmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean booleanValue = ((Boolean) gld.M(ojmVar.d, oq5Var).getValue()).booleanValue();
            boolean h = ((i2 & 14) == 4 || ((i2 & 8) != 0 && oq5Var.h(rjmVar))) | oq5Var.h(ojmVar) | oq5Var.g(booleanValue);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new y20(rjmVar, booleanValue, ojmVar, 3);
                oq5Var.k0(K);
            }
            vq1.g(null, bciVar, false, (Function1) K, oq5Var, 64 | ((i2 >> 3) & 112), 13);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(rjmVar, ojmVar, bciVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, yci yciVar, boolean z, boolean z2, boolean z3, float f, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        final yci yciVar2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        float f2;
        oq5 oq5Var;
        final boolean z6;
        final boolean z7;
        final float f3;
        final boolean z8;
        xmn r;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1258597740);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z;
                i3 |= oq5Var2.g(z4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z5 = z2;
                    i3 |= oq5Var2.g(z5) ? 2048 : 1024;
                    i6 = i3 | 24576;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i6 = 221184 | i3;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i6 |= oq5Var2.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                        if ((1572864 & i) == 0) {
                            i6 |= oq5Var2.h(wn5Var) ? 1048576 : 524288;
                        }
                        if ((i6 & 599187) == 599186 || !oq5Var2.z()) {
                            yci yciVar3 = i8 != 0 ? vci.a : yciVar2;
                            boolean z9 = i4 != 0 ? false : z4;
                            if (i5 != 0) {
                                z5 = true;
                            }
                            if (i7 != 0) {
                                f2 = 64;
                            }
                            float f4 = f2;
                            boolean z10 = z5;
                            jf0.a(new qzm[0], null, false, ild.C(455280100, new vkl(z10, z9, function0, yciVar3, f4, wn5Var), oq5Var2), oq5Var2, 0, 6);
                            oq5Var = oq5Var2;
                            z6 = z10;
                            z7 = z9;
                            yciVar2 = yciVar3;
                            f3 = f4;
                            z8 = true;
                        } else {
                            oq5Var2.S();
                            f3 = f2;
                            oq5Var = oq5Var2;
                            z7 = z4;
                            z6 = z5;
                            z8 = z3;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new Function2() { // from class: ego
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    a0g.n(Function0.this, yciVar2, z7, z6, z8, f3, wn5Var, (hq5) obj, rvf.R(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f2 = f;
                    if ((1572864 & i) == 0) {
                    }
                    if ((i6 & 599187) == 599186) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    float f42 = f2;
                    boolean z102 = z5;
                    jf0.a(new qzm[0], null, false, ild.C(455280100, new vkl(z102, z9, function0, yciVar3, f42, wn5Var), oq5Var2), oq5Var2, 0, 6);
                    oq5Var = oq5Var2;
                    z6 = z102;
                    z7 = z9;
                    yciVar2 = yciVar3;
                    f3 = f42;
                    z8 = true;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                z5 = z2;
                i6 = i3 | 24576;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                f2 = f;
                if ((1572864 & i) == 0) {
                }
                if ((i6 & 599187) == 599186) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                float f422 = f2;
                boolean z1022 = z5;
                jf0.a(new qzm[0], null, false, ild.C(455280100, new vkl(z1022, z9, function0, yciVar3, f422, wn5Var), oq5Var2), oq5Var2, 0, 6);
                oq5Var = oq5Var2;
                z6 = z1022;
                z7 = z9;
                yciVar2 = yciVar3;
                f3 = f422;
                z8 = true;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            z4 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z5 = z2;
            i6 = i3 | 24576;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if ((i6 & 599187) == 599186) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            float f4222 = f2;
            boolean z10222 = z5;
            jf0.a(new qzm[0], null, false, ild.C(455280100, new vkl(z10222, z9, function0, yciVar3, f4222, wn5Var), oq5Var2), oq5Var2, 0, 6);
            oq5Var = oq5Var2;
            z6 = z10222;
            z7 = z9;
            yciVar2 = yciVar3;
            f3 = f4222;
            z8 = true;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z4 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z5 = z2;
        i6 = i3 | 24576;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if ((i6 & 599187) == 599186) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        float f42222 = f2;
        boolean z102222 = z5;
        jf0.a(new qzm[0], null, false, ild.C(455280100, new vkl(z102222, z9, function0, yciVar3, f42222, wn5Var), oq5Var2), oq5Var2, 0, 6);
        oq5Var = oq5Var2;
        z6 = z102222;
        z7 = z9;
        yciVar2 = yciVar3;
        f3 = f42222;
        z8 = true;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(int i, int i2, long j, hq5 hq5Var, yci yciVar, Function0 function0) {
        yci yciVar2;
        long j2;
        int i3;
        int i4;
        yci yciVar3;
        yci yciVar4;
        long j3;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(594654061);
        int i5 = i | (oq5Var.h(function0) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i2 & 4) != 0) {
                j2 = j;
                if (oq5Var.e(j2)) {
                    i3 = 256;
                    i4 = i5 | i3;
                    if ((i4 & 147) == 146 || !oq5Var.z()) {
                        oq5Var.U();
                        if ((i & 1) != 0 || oq5Var.y()) {
                            yci yciVar5 = i6 != 0 ? vci.a : yciVar2;
                            if ((i2 & 4) != 0) {
                                j2 = ((dq0) oq5Var.j(eq0.a)).a.a;
                                i4 &= -897;
                            }
                            yciVar3 = yciVar5;
                        } else {
                            oq5Var.S();
                            if ((i2 & 4) != 0) {
                                i4 &= -897;
                            }
                            yciVar3 = yciVar2;
                        }
                        long j4 = j2;
                        oq5Var.q();
                        float f = 48;
                        aae.a(function0, androidx.compose.ui.platform.a.a(d.q(yciVar3, f, f, 0.0f, 0.0f, 12), "button_search"), false, ild.C(-1161461239, new bu0(j4, 8), oq5Var), oq5Var, (i4 & 14) | 24576, 12);
                        yciVar4 = yciVar3;
                        j3 = j4;
                    } else {
                        oq5Var.S();
                        yciVar4 = yciVar2;
                        j3 = j2;
                    }
                    r = oq5Var.r();
                    if (r != null) {
                        r.d = new p74(function0, yciVar4, j3, i, i2, 2);
                        return;
                    }
                    return;
                }
            } else {
                j2 = j;
            }
            i3 = 128;
            i4 = i5 | i3;
            if ((i4 & 147) == 146) {
            }
            oq5Var.U();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            yciVar3 = yciVar5;
            long j42 = j2;
            oq5Var.q();
            float f2 = 48;
            aae.a(function0, androidx.compose.ui.platform.a.a(d.q(yciVar3, f2, f2, 0.0f, 0.0f, 12), "button_search"), false, ild.C(-1161461239, new bu0(j42, 8), oq5Var), oq5Var, (i4 & 14) | 24576, 12);
            yciVar4 = yciVar3;
            j3 = j42;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i2 & 4) != 0) {
        }
        i3 = 128;
        i4 = i5 | i3;
        if ((i4 & 147) == 146) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        yciVar3 = yciVar5;
        long j422 = j2;
        oq5Var.q();
        float f22 = 48;
        aae.a(function0, androidx.compose.ui.platform.a.a(d.q(yciVar3, f22, f22, 0.0f, 0.0f, 12), "button_search"), false, ild.C(-1161461239, new bu0(j422, 8), oq5Var), oq5Var, (i4 & 14) | 24576, 12);
        yciVar4 = yciVar3;
        j3 = j422;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final Function0 function0, yci yciVar, boolean z, boolean z2, long j, d85 d85Var, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        yci yciVar2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        d85 d85Var2;
        wn5 wn5Var2;
        int i7;
        yci yciVar3;
        long j2;
        d85 d85Var3;
        long j3;
        long j4;
        oq5 oq5Var;
        final boolean z5;
        final boolean z6;
        final yci yciVar4;
        final d85 d85Var4;
        final long j5;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1477869526);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= oq5Var2.g(z3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= oq5Var2.g(z4) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= RemoteCameraConfig.Notification.ID;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        d85Var2 = d85Var;
                        i3 |= oq5Var2.f(d85Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                        if ((1572864 & i) == 0) {
                            wn5Var2 = wn5Var;
                            i3 |= oq5Var2.h(wn5Var2) ? 1048576 : 524288;
                        } else {
                            wn5Var2 = wn5Var;
                        }
                        if ((599187 & i3) == 599186 || !oq5Var2.z()) {
                            oq5Var2.U();
                            if ((i & 1) != 0 || oq5Var2.y()) {
                                yci yciVar5 = i8 != 0 ? vci.a : yciVar2;
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                }
                                long j6 = ((dq0) oq5Var2.j(eq0.a)).c.c;
                                i7 = i3 & (-57345);
                                if (i6 != 0) {
                                    d85Var3 = null;
                                    yciVar3 = yciVar5;
                                    j2 = j6;
                                    oq5Var2.q();
                                    if (z3) {
                                        oq5Var2.Z(499098846);
                                        j3 = ((dq0) oq5Var2.j(eq0.a)).d.f;
                                        oq5Var2.p(false);
                                    } else {
                                        oq5Var2.Z(499037094);
                                        if (d85Var3 == null) {
                                            oq5Var2.Z(1401572470);
                                            j3 = ((dq0) oq5Var2.j(eq0.a)).d.e;
                                            oq5Var2.p(false);
                                        } else {
                                            oq5Var2.Z(1401571292);
                                            oq5Var2.p(false);
                                            j3 = d85Var3.a;
                                        }
                                        oq5Var2.p(false);
                                    }
                                    if (z3) {
                                        oq5Var2.Z(499241260);
                                        j4 = ((dq0) oq5Var2.j(eq0.a)).a.e;
                                        oq5Var2.p(false);
                                    } else {
                                        oq5Var2.Z(499192621);
                                        j4 = ((dq0) oq5Var2.j(eq0.a)).a.a;
                                        oq5Var2.p(false);
                                    }
                                    oq5Var = oq5Var2;
                                    d(function0, !z4 && z3, j3, j4, j2, yciVar3, 0.0f, false, wn5Var2, oq5Var, (57358 & i7) | ((i7 << 12) & 458752) | ((i7 << 6) & 234881024), 192);
                                    z5 = z3;
                                    z6 = z4;
                                    yciVar4 = yciVar3;
                                    d85Var4 = d85Var3;
                                    j5 = j2;
                                } else {
                                    yciVar3 = yciVar5;
                                    j2 = j6;
                                }
                            } else {
                                oq5Var2.S();
                                i7 = i3 & (-57345);
                                j2 = j;
                                yciVar3 = yciVar2;
                            }
                            d85Var3 = d85Var2;
                            oq5Var2.q();
                            if (z3) {
                            }
                            if (z3) {
                            }
                            oq5Var = oq5Var2;
                            d(function0, !z4 && z3, j3, j4, j2, yciVar3, 0.0f, false, wn5Var2, oq5Var, (57358 & i7) | ((i7 << 12) & 458752) | ((i7 << 6) & 234881024), 192);
                            z5 = z3;
                            z6 = z4;
                            yciVar4 = yciVar3;
                            d85Var4 = d85Var3;
                            j5 = j2;
                        } else {
                            oq5Var2.S();
                            oq5Var = oq5Var2;
                            yciVar4 = yciVar2;
                            z5 = z3;
                            z6 = z4;
                            d85Var4 = d85Var2;
                            j5 = j;
                        }
                        xmn r = oq5Var.r();
                        if (r != null) {
                            r.d = new Function2() { // from class: dgo
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    a0g.p(Function0.this, yciVar4, z5, z6, j5, d85Var4, wn5Var, (hq5) obj, rvf.R(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    d85Var2 = d85Var;
                    if ((1572864 & i) == 0) {
                    }
                    if ((599187 & i3) == 599186) {
                    }
                    oq5Var2.U();
                    if ((i & 1) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    long j62 = ((dq0) oq5Var2.j(eq0.a)).c.c;
                    i7 = i3 & (-57345);
                    if (i6 != 0) {
                    }
                }
                z4 = z2;
                if ((i & 24576) == 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                d85Var2 = d85Var;
                if ((1572864 & i) == 0) {
                }
                if ((599187 & i3) == 599186) {
                }
                oq5Var2.U();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                long j622 = ((dq0) oq5Var2.j(eq0.a)).c.c;
                i7 = i3 & (-57345);
                if (i6 != 0) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            d85Var2 = d85Var;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            oq5Var2.U();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            long j6222 = ((dq0) oq5Var2.j(eq0.a)).c.c;
            i7 = i3 & (-57345);
            if (i6 != 0) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        d85Var2 = d85Var;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        long j62222 = ((dq0) oq5Var2.j(eq0.a)).c.c;
        i7 = i3 & (-57345);
        if (i6 != 0) {
        }
    }

    public static final void q(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1322143510);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            float f = 48;
            vci vciVar = vci.a;
            function02 = function0;
            aae.a(function02, androidx.compose.ui.platform.a.a(d.q(vciVar, f, f, 0.0f, 0.0f, 12), "sort_button"), false, n7w.d, oq5Var, (i3 & 14) | 24576, 12);
            yciVar = vciVar;
        } else {
            function02 = function0;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function02, yciVar, i, 6);
        }
    }

    public static final void r(por porVar, yci yciVar, hq5 hq5Var, int i) {
        Integer valueOf = Integer.valueOf(R.string.freemium_wave_button_description);
        porVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(396659938);
        int i2 = (oq5Var.f(porVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            if (!(porVar instanceof oor) && !(porVar instanceof mor)) {
                if (porVar instanceof lor) {
                    valueOf = Integer.valueOf(R.string.freemium_wave_button_error_description);
                } else {
                    if (!(porVar instanceof nor)) {
                        b6e.s();
                        return;
                    }
                    valueOf = null;
                }
            }
            if (valueOf == null) {
                oq5Var.Z(1441690001);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1441690002);
                xcs.b(rvf.M(valueOf.intValue(), oq5Var), yciVar, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65016);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(porVar, yciVar, i, 8);
        }
    }

    public static final void s(String str, String str2, boolean z, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        float f;
        agr agrVar;
        vci vciVar;
        boolean z2;
        str.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-582730518);
        int i2 = i | (oq5Var.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str2) ? 32 : 16;
        }
        int i3 = i2 | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            hz2 hz2Var = b2c.l;
            int i4 = i3 & 896;
            boolean z3 = ((i3 & 7168) == 2048) | (i4 == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = new j32(function1, z, 1);
                oq5Var.k0(K);
            }
            float f2 = 16;
            yci o = androidx.compose.foundation.layout.a.o(a.e(yciVar, false, null, null, (Function0) K, 7), f2, 0.0f, 2);
            boolean z4 = i4 == 256;
            Object K2 = oq5Var.K();
            if (z4 || K2 == kjnVar) {
                K2 = new i32(7, z);
                oq5Var.k0(K2);
            }
            yci b = nfp.b(o, true, (Function1) K2);
            nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci o2 = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(true, 1.0f), 0.0f, f2, 1);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, o2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            agr agrVar2 = eq0.a;
            xcs.b(str, null, ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, i3 & 14, 0, 65530);
            oq5 oq5Var2 = oq5Var;
            vci vciVar2 = vci.a;
            if (str2 == null) {
                oq5Var2.Z(-199327427);
                oq5Var2.p(false);
                f = f2;
                agrVar = agrVar2;
                z2 = false;
                vciVar = vciVar2;
            } else {
                oq5Var2.Z(-199327426);
                u1g.l(oq5Var2, d.e(vciVar2, 4));
                f = f2;
                agrVar = agrVar2;
                vciVar = vciVar2;
                xcs.b(str2, null, ((dq0) oq5Var2.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var2, 0, 0, 65530);
                oq5Var2 = oq5Var2;
                z2 = false;
                oq5Var2.p(false);
            }
            oq5Var2.p(true);
            vci vciVar3 = vciVar;
            u1g.l(oq5Var2, d.r(vciVar3, f));
            agr agrVar3 = agrVar;
            ds7 n = s7g.n(((dq0) oq5Var2.j(agrVar3)).e.a, ((dq0) oq5Var2.j(agrVar3)).e.b, oq5Var2, 967);
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = new d0p(29);
                oq5Var2.k0(K3);
            }
            yci b2 = nfp.b(vciVar3, z2, (Function1) K3);
            int i7 = (i3 >> 6) & 126;
            oq5 oq5Var3 = oq5Var2;
            uvr.a(z, function1, b2, false, n, oq5Var3, i7, 24);
            oq5Var = oq5Var3;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(str, str2, z, function1, yciVar, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(int i, int i2, int i3, hq5 hq5Var, yci yciVar) {
        int i4;
        yci yciVar2;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-131752839);
        int i5 = i2 | 6;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i5 = i2 | 54;
        } else if ((i2 & 48) == 0) {
            i4 = i;
            i5 |= oq5Var.d(i4) ? 32 : 16;
            if (oq5Var.P(i5 & 1, (i5 & 19) == 18)) {
                oq5Var.S();
                yciVar2 = yciVar;
            } else {
                if (i6 != 0) {
                    i4 = 0;
                }
                hz2 hz2Var = b2c.l;
                float f = 16;
                vci vciVar = vci.a;
                yci o = androidx.compose.foundation.layout.a.o(vciVar, f, 0.0f, 2);
                nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, o);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, a, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci o2 = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(true, 1.0f), 0.0f, f, 1);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, o2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                pm0.d(d.r(vciVar, BuildConfig.API_LEVEL), nu0.j(), oq5Var, 6);
                oq5Var.Z(1026962974);
                for (int i9 = 0; i9 < i4; i9++) {
                    if (i9 == 0) {
                        oq5Var.Z(1033310062);
                        eta.p(vciVar, 4, oq5Var, false);
                    } else {
                        oq5Var.Z(1029132595);
                        oq5Var.p(false);
                    }
                    pm0.d(d.r(vciVar, 100), nu0.i(), oq5Var, 6);
                }
                oq5Var.p(false);
                oq5Var.p(true);
                u1g.l(oq5Var, d.r(vciVar, f));
                ug3.a(d.o(vciVar, 34, 20), oq5Var, 6);
                oq5Var.p(true);
                yciVar2 = vciVar;
            }
            int i10 = i4;
            r = oq5Var.r();
            if (r == null) {
                r.d = new sy3(yciVar2, i10, i2, i3, 2);
                return;
            }
            return;
        }
        i4 = i;
        if (oq5Var.P(i5 & 1, (i5 & 19) == 18)) {
        }
        int i102 = i4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void u(boolean z, i2o i2oVar, qbs qbsVar, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        i2o i2oVar2;
        dds d;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(i2oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(qbsVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean f = (i3 == 4) | oq5Var.f(qbsVar);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = new wep(qbsVar, z);
                oq5Var.k0(K);
            }
            has hasVar = (has) K;
            boolean h = oq5Var.h(qbsVar) | (i3 == 4);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                K2 = new rbs(qbsVar, z);
                oq5Var.k0(K2);
            }
            onj onjVar = (onj) K2;
            boolean f2 = rds.f(qbsVar.k().b);
            ybs k = qbsVar.k();
            int i4 = (int) (z ? k.b >> 32 : k.b & 4294967295L);
            axf axfVar = qbsVar.d;
            float z3 = (axfVar == null || (d = axfVar.d()) == null) ? 0.0f : a4g.z(d.a, i4);
            boolean h2 = oq5Var.h(hasVar);
            Object K3 = oq5Var.K();
            if (h2 || K3 == obj) {
                K3 = new cep(hasVar, 1);
                oq5Var.k0(K3);
            }
            i2oVar2 = i2oVar;
            float f3 = z3;
            z2 = z;
            qld.s(onjVar, z2, i2oVar2, f2, 0L, f3, eur.a(vci.a, hasVar, (PointerInputEventHandler) K3), oq5Var, (i2 << 3) & 1008);
        } else {
            z2 = z;
            i2oVar2 = i2oVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new si0(z2, i2oVar2, qbsVar, i);
        }
    }

    public static final void v(int i, hq5 hq5Var, yci yciVar, String str) {
        yci yciVar2;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1996784579);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            vci vciVar = vci.a;
            yci o = androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            long j = ((dq0) oq5Var.j(eq0.a)).b.a;
            ges c = nu0.c();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new d0p(28);
                oq5Var.k0(K);
            }
            xcs.b(str, nfp.b(vciVar, false, (Function1) K), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, c, oq5Var, i2 & 14, 0, 65528);
            oq5Var = oq5Var;
            vci vciVar2 = vciVar;
            eta.p(vciVar2, 8, oq5Var, true);
            yciVar2 = vciVar2;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar2, i, 12);
        }
    }

    public static final void w(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1769191345);
        int i2 = i | 6;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            vci vciVar = vci.a;
            yci o = androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            pm0.d(d.r(vciVar, 148), nu0.c(), oq5Var, 6);
            eta.p(vciVar, 8, oq5Var, true);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void x(int i, int i2, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        int i3;
        boolean z2;
        int i4;
        String str2;
        boolean z3;
        String str3;
        sdr sdrVar;
        int i5;
        boolean f;
        Object K;
        boolean z4;
        Object K2;
        boolean z5;
        String str4;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1626538432);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= oq5Var.f(str2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                    z3 = i6 != 0 ? false : z2;
                    str3 = i4 != 0 ? null : str2;
                    kjn kjnVar = gq5.a;
                    if (z3) {
                        oq5Var.Z(-385183717);
                        sdrVar = pm0.f(oq5Var);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-385138674);
                        Object K3 = oq5Var.K();
                        if (K3 == kjnVar) {
                            K3 = tlm.h(1.0f, oq5Var);
                        }
                        sdrVar = (poi) K3;
                        oq5Var.p(false);
                    }
                    yci d = d.d(yciVar, 1.0f);
                    kfh d2 = ug3.d(b2c.i, false);
                    i5 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, d);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    float f2 = 96;
                    f = oq5Var.f(sdrVar);
                    K = oq5Var.K();
                    if (!f || K == kjnVar) {
                        K = new f6u(sdrVar, 16);
                        oq5Var.k0(K);
                    }
                    vci vciVar = vci.a;
                    yci s = wyf.s(vciVar, (Function0) K);
                    if (str3 != null) {
                        s = s.f(ksw.D(vciVar, str3, null));
                    }
                    yci yciVar2 = s;
                    z4 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
                    K2 = oq5Var.K();
                    if (!z4 || K2 == kjnVar) {
                        K2 = new fr6(1, function0, z3);
                        oq5Var.k0(K2);
                    }
                    n((Function0) K2, yciVar2, false, false, false, f2, ghh.f, oq5Var, 1769472, 28);
                    oq5Var.p(true);
                    z5 = z3;
                    str4 = str3;
                } else {
                    oq5Var.S();
                    z5 = z2;
                    str4 = str2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new a1v(function0, yciVar, z5, str4, i, i2);
                    return;
                }
                return;
            }
            str2 = str;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            kjn kjnVar2 = gq5.a;
            if (z3) {
            }
            yci d3 = d.d(yciVar, 1.0f);
            kfh d22 = ug3.d(b2c.i, false);
            i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d3);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d22, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var2);
            g0g.U(oq5Var, H2, wp5.d);
            float f22 = 96;
            f = oq5Var.f(sdrVar);
            K = oq5Var.K();
            if (!f) {
            }
            K = new f6u(sdrVar, 16);
            oq5Var.k0(K);
            vci vciVar2 = vci.a;
            yci s2 = wyf.s(vciVar2, (Function0) K);
            if (str3 != null) {
            }
            yci yciVar22 = s2;
            z4 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            K2 = oq5Var.K();
            if (!z4) {
            }
            K2 = new fr6(1, function0, z3);
            oq5Var.k0(K2);
            n((Function0) K2, yciVar22, false, false, false, f22, ghh.f, oq5Var, 1769472, 28);
            oq5Var.p(true);
            z5 = z3;
            str4 = str3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        kjn kjnVar22 = gq5.a;
        if (z3) {
        }
        yci d32 = d.d(yciVar, 1.0f);
        kfh d222 = ug3.d(b2c.i, false);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, d32);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d222, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var22);
        g0g.U(oq5Var, H22, wp5.d);
        float f222 = 96;
        f = oq5Var.f(sdrVar);
        K = oq5Var.K();
        if (!f) {
        }
        K = new f6u(sdrVar, 16);
        oq5Var.k0(K);
        vci vciVar22 = vci.a;
        yci s22 = wyf.s(vciVar22, (Function0) K);
        if (str3 != null) {
        }
        yci yciVar222 = s22;
        z4 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
        K2 = oq5Var.K();
        if (!z4) {
        }
        K2 = new fr6(1, function0, z3);
        oq5Var.k0(K2);
        n((Function0) K2, yciVar222, false, false, false, f222, ghh.f, oq5Var, 1769472, 28);
        oq5Var.p(true);
        z5 = z3;
        str4 = str3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static sks y(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return sks.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return sks.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return sks.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return sks.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return sks.SSL_3_0;
        }
        xq0.x("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static rlv z() {
        xkv xkvVar = new xkv(false, true);
        elv elvVar = new elv(true);
        alv alvVar = alv.a;
        return new rlv(null, new llv(new klv(u75.h(xkvVar, alvVar, elvVar), 1), new klv(u75.h(new blv(false), alvVar, new elv(true), new xkv(false, true)), 1), new klv(u75.h(alvVar, new xkv(false, true), new elv(true)), 0)));
    }

    public void K(nkq nkqVar) {
        try {
            L(nkqVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            leu.a0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void L(nkq nkqVar);
}
