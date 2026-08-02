package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.h;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.f;
import androidx.concurrent.futures.b;
import com.adjust.sdk.Constants;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.lottie.a;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.l8x;
import defpackage.seu;
import defpackage.ssu;
import defpackage.tje;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;
import skeletor.parser.exception.TokenFinalizationException;
import skeletor.parser.util.StackMode;

/* loaded from: classes9.dex */
public abstract class uh6 {
    public static final gd2 a = new gd2();
    public static final byte[] b = {-3, -113, 55, Alerts.alert_certificate_revoked, -78, 48, 69, -59};
    public static final byte[] c = {-97, -18, 89, Alerts.alert_insufficient_security, -19, 67, BlobHeaderStructure.KEXP15_BLOB_VERSION, -82};
    public static final SerialDescriptor[] d = new SerialDescriptor[0];

    public static final int A(sqm0 sqm0Var) {
        if (sqm0Var instanceof oqm0) {
            return ((oqm0) sqm0Var).a.size();
        }
        return 0;
    }

    public static int B(JSONObject jSONObject, rvo rvoVar) {
        u2l u2lVar = a.y;
        wms wmsVar = wm11.a;
        Expression c2 = com.yandex.div.internal.parser.a.c(u2lVar, jSONObject, "repeat_mode");
        return jl40.l(c2 != null ? (String) c2.a(rvoVar) : null, "reverse") ? 2 : 1;
    }

    public static final List C(sqm0 sqm0Var) {
        return sqm0Var instanceof oqm0 ? ((oqm0) sqm0Var).a : EmptyList.a;
    }

    public static final long D(double d2) {
        return K((float) d2, 4294967296L);
    }

    public static final long E(int i) {
        return K(i, 4294967296L);
    }

    public static final lfx F(mgx mgxVar) {
        lfx f = mgxVar.f();
        if (f instanceof lfx) {
            return f;
        }
        kbs.f(f, "Only KClass supported as classifier, got ");
        return null;
    }

    public static gl7 G(final fse fseVar, final wls wlsVar) {
        final CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        return jx81.r(new el7() { // from class: androidx.work.a
            @Override // defpackage.el7
            public final Object j(b bVar) {
                seu seuVar = seu.C;
                fse fseVar2 = fse.this;
                bVar.a(new ssu(3, (l8x) fseVar2.get(seuVar)), DirectExecutor.INSTANCE);
                return tje.N(bvf0.a(fseVar2), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(wlsVar, bVar, null), 1);
            }
        });
    }

    public static float H(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final long I(long j, float f, long j2) {
        h(j, j2);
        return K(cjb1.d(sty0.c(j), sty0.c(j2), f), 1095216660480L & j);
    }

    public static final String J(lfx lfxVar) {
        String d2 = ((g0c) lfxVar).d();
        if (d2 == null) {
            d2 = "<local class name not available>";
        }
        return oyr.p("Serializer for class '", d2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final long K(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        tty0[] tty0VarArr = sty0.b;
        return floatToRawIntBits;
    }

    public static final Object L(r1b0 r1b0Var, h hVar) {
        Object obj = r1b0Var.get(hVar);
        if (obj == null) {
            obj = hVar.b();
        }
        return ((j131) obj).a(r1b0Var);
    }

    public static final void M(lfx lfxVar) {
        throw new SerializationException(J(lfxVar));
    }

    public static final zuo0 N(sqm0 sqm0Var, String str) {
        Object obj;
        Iterator it = C(sqm0Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((zuo0) obj).getSessionId(), str)) {
                break;
            }
        }
        return (zuo0) obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String O(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals(Constants.LONG)) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final List P(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(kotlin.collections.a.P(list)) : EmptyList.a;
    }

    public static final Map Q(Map map) {
        int size = map.size();
        if (size == 0) {
            return kotlin.collections.b.f();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) kotlin.collections.a.O(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static int R(Expression expression, rvo rvoVar) {
        long longValue = ((Number) expression.a(rvoVar)).longValue();
        long j = longValue >> 31;
        return (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final kotlinx.serialization.json.b S(q6x q6xVar) {
        if (!(q6xVar instanceof r6x)) {
            if (q6xVar instanceof p6x) {
                return qcx.c(((p6x) q6xVar).a);
            }
            w511.b();
            return null;
        }
        Map map = ((r6x) q6xVar).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), S((q6x) entry.getValue()));
        }
        return new c(linkedHashMap);
    }

    public static final k1b0 T(f1b0 f1b0Var, String str, String str2) {
        PersistenceTypeDto persistenceTypeDto = f1b0Var.a;
        String str3 = f1b0Var.b;
        int i = g1b0.a[persistenceTypeDto.ordinal()];
        if (i == 1) {
            return evu0.J(str3) ? new i1b0(str2, str) : new j1b0(str3);
        }
        if (i == 2) {
            return h1b0.a;
        }
        w511.b();
        return null;
    }

    public static String U(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static final q6x V(kotlinx.serialization.json.b bVar) {
        if (bVar instanceof c) {
            Map map = ((c) bVar).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), V((kotlinx.serialization.json.b) entry.getValue()));
            }
            return new r6x(linkedHashMap);
        }
        if (!(bVar instanceof d)) {
            vg10.i("Nodes of type ", qoi0.a(bVar.getClass()), " is not supported");
            return null;
        }
        d dVar = (d) bVar;
        if (dVar.b()) {
            return new p6x(dVar.a());
        }
        kbs.f(dVar, "Expected string node but actual value is ");
        return null;
    }

    public static final r1b0 W(vvf0[] vvf0VarArr, r1b0 r1b0Var, r1b0 r1b0Var2) {
        r1b0 r1b0Var3 = r1b0.w;
        q1b0 q1b0Var = new q1b0(r1b0Var3);
        q1b0Var.z = r1b0Var3;
        for (vvf0 vvf0Var : vvf0VarArr) {
            h hVar = vvf0Var.a;
            if (vvf0Var.f || !r1b0Var.containsKey(hVar)) {
                q1b0Var.put(hVar, hVar.c(vvf0Var, (j131) r1b0Var2.get(hVar)));
            }
        }
        return q1b0Var.a();
    }

    public static kj2 a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new kj2(gtq0.f, Float.valueOf(f), new oj2(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final exv c(String str, KSerializer kSerializer) {
        return new exv(str, new fxv(kSerializer));
    }

    public static final void d(View view, LayoutNode layoutNode) {
        long v = ((f) layoutNode.a0.d).v(0L);
        int round = Math.round(Float.intBitsToFloat((int) (v >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (v & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }

    public static final yss e(yss yssVar) {
        if (yssVar == null) {
            yssVar = null;
        }
        if (yssVar != null) {
            return yssVar;
        }
        lid.b("Inconsistent composition");
        ny61.A();
        return null;
    }

    public static final Set f(SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof ud7) {
            return ((ud7) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int e = serialDescriptor.e();
        for (int i = 0; i < e; i++) {
            hashSet.add(serialDescriptor.f(i));
        }
        return hashSet;
    }

    public static final void g(long j) {
        tty0[] tty0VarArr = sty0.b;
        if ((j & 1095216660480L) == 0) {
            kxv.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void h(long j, long j2) {
        tty0[] tty0VarArr = sty0.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            kxv.a("Cannot perform operation for Unspecified type.");
        }
        if (tty0.a(sty0.b(j), sty0.b(j2))) {
            return;
        }
        kxv.a("Cannot perform operation for " + ((Object) tty0.b(sty0.b(j))) + " and " + ((Object) tty0.b(sty0.b(j2))));
    }

    public static void i(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ny61.t(oyr.i(i2, "at index "));
                return;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String j(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals(Constants.LONG)) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final SerialDescriptor[] k(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? d : serialDescriptorArr;
    }

    public static kj2 l(kj2 kj2Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) kj2Var.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((oj2) kj2Var.f()).a;
        }
        return new kj2(kj2Var.d(), Float.valueOf(f), new oj2(f2), kj2Var.b(), kj2Var.a(), kj2Var.g());
    }

    public static float m(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float n(float f, float f2, float f3, float f4) {
        float m = m(f, f2, 0.0f, 0.0f);
        float m2 = m(f, f2, f3, 0.0f);
        float m3 = m(f, f2, f3, f4);
        float m4 = m(f, f2, 0.0f, f4);
        return (m <= m2 || m <= m3 || m <= m4) ? (m2 <= m3 || m2 <= m4) ? m3 > m4 ? m3 : m4 : m2 : m;
    }

    public static final float o(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final float p(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final boolean q(rms0 rms0Var, List list) {
        int i = 0;
        if (rms0Var instanceof m86) {
            m86 m86Var = (m86) rms0Var;
            String str = m86Var.a[0];
            if (str == null) {
                throw new TokenFinalizationException(m86Var);
            }
            m86Var.b = bb1.b(str);
            String str2 = m86Var.a[1];
            m86Var.c = str2 != null ? bb1.b(str2) : null;
            String str3 = m86Var.a[2];
            m86Var.d = str3 != null ? bb1.b(str3) : null;
            return false;
        }
        if (rms0Var instanceof wac) {
            wac wacVar = (wac) rms0Var;
            String str4 = wacVar.a[0];
            wacVar.b = str4 != null ? bb1.b(str4) : null;
            wyt0 wyt0Var = StackMode.Companion;
            String str5 = wacVar.a[1];
            wyt0Var.getClass();
            wacVar.c = wyt0.a(str5);
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            while (i < size) {
                arrayList.add(null);
                i++;
            }
            Collections.copy(arrayList, list);
            wacVar.d = arrayList;
            return true;
        }
        if (rms0Var instanceof dhl0) {
            dhl0 dhl0Var = (dhl0) rms0Var;
            String str6 = dhl0Var.a[0];
            dhl0Var.b = str6 != null ? bb1.b(str6) : null;
            wyt0 wyt0Var2 = StackMode.Companion;
            String str7 = dhl0Var.a[1];
            wyt0Var2.getClass();
            dhl0Var.c = wyt0.a(str7);
            int size2 = list.size();
            ArrayList arrayList2 = new ArrayList(size2);
            while (i < size2) {
                arrayList2.add(null);
                i++;
            }
            Collections.copy(arrayList2, list);
            dhl0Var.d = arrayList2;
            return true;
        }
        if (rms0Var instanceof ckt0) {
            ckt0 ckt0Var = (ckt0) rms0Var;
            String str8 = ckt0Var.a[0];
            if (str8 == null) {
                throw new TokenFinalizationException(ckt0Var);
            }
            ckt0Var.b = bb1.b(str8);
            return false;
        }
        if (rms0Var instanceof p0j0) {
            p0j0 p0j0Var = (p0j0) rms0Var;
            String str9 = p0j0Var.a[0];
            if (str9 == null) {
                throw new TokenFinalizationException(p0j0Var);
            }
            p0j0Var.b = Integer.valueOf(Integer.parseInt(str9));
            rms0 rms0Var2 = (rms0) kotlin.collections.a.R(list);
            if (rms0Var2 == null) {
                throw new TokenFinalizationException(p0j0Var);
            }
            p0j0Var.c = rms0Var2;
            return true;
        }
        if (rms0Var instanceof bvy0) {
            bvy0 bvy0Var = (bvy0) rms0Var;
            String[] strArr = bvy0Var.a;
            String str10 = strArr[0];
            if (str10 == null) {
                throw new TokenFinalizationException(bvy0Var);
            }
            bvy0Var.b = str10;
            String str11 = strArr[1];
            if (str11 == null) {
                throw new TokenFinalizationException(bvy0Var);
            }
            bvy0Var.c = bb1.b(str11);
            String str12 = bvy0Var.a[2];
            bvy0Var.d = str12 != null ? Integer.valueOf(Integer.parseInt(str12)) : null;
            rms0 rms0Var3 = (rms0) kotlin.collections.a.R(list);
            if (rms0Var3 == null) {
                throw new TokenFinalizationException(bvy0Var);
            }
            bvy0Var.e = rms0Var3;
            return true;
        }
        if (!(rms0Var instanceof p590)) {
            if (rms0Var instanceof pyt0) {
                kfb1.a((pyt0) rms0Var, list);
                return true;
            }
            w511.b();
            return false;
        }
        p590 p590Var = (p590) rms0Var;
        String str13 = p590Var.a[0];
        if (str13 == null) {
            throw new TokenFinalizationException(p590Var);
        }
        p590Var.b = bb1.b(str13);
        String str14 = p590Var.a[1];
        p590Var.c = str14 != null ? bb1.b(str14) : null;
        String str15 = p590Var.a[2];
        p590Var.d = str15 != null ? bb1.b(str15) : null;
        String str16 = p590Var.a[3];
        p590Var.e = str16 != null ? bb1.b(str16) : null;
        rms0 rms0Var4 = (rms0) kotlin.collections.a.R(list);
        if (rms0Var4 == null) {
            throw new TokenFinalizationException(p590Var);
        }
        p590Var.f = rms0Var4;
        String[] strArr2 = p590Var.a;
        int length = strArr2.length - 1;
        while (length > 0 && strArr2[length] == null) {
            length--;
        }
        if (length + 1 != 1) {
            String[] strArr3 = p590Var.a;
            int length2 = strArr3.length - 1;
            while (length2 > 0 && strArr3[length2] == null) {
                length2--;
            }
            if (length2 + 1 != 2) {
                String[] strArr4 = p590Var.a;
                int length3 = strArr4.length - 1;
                while (length3 > 0 && strArr4[length3] == null) {
                    length3--;
                }
                if (length3 + 1 != 4) {
                    ny61.g("Token invariants were not satisfied");
                    return false;
                }
            }
        }
        return true;
    }

    public static final ZoneTariffInfo r(Zone zone, String str) {
        Object obj = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        Iterator it = zone.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(str, ((ZoneTariffInfo) next).e)) {
                obj = next;
                break;
            }
        }
        return (ZoneTariffInfo) obj;
    }

    public static String s(Date date, TimeZone timeZone) {
        ThreadLocal threadLocal = zqg.c;
        Object obj = threadLocal.get();
        if (obj == null) {
            obj = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
            threadLocal.set(obj);
        }
        DateFormat dateFormat = (DateFormat) obj;
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(date);
    }

    public static String t(TimeZone timeZone) {
        int rawOffset = timeZone.getRawOffset();
        int abs = Math.abs(rawOffset);
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long U = kp50.U(abs, durationUnit);
        DurationUnit durationUnit2 = DurationUnit.HOURS;
        int n = e3n.n(U, durationUnit2);
        long U2 = kp50.U(abs, durationUnit);
        DurationUnit durationUnit3 = DurationUnit.MINUTES;
        return String.format(Locale.US, rawOffset >= 0 ? "+%02d%02d" : "-%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(n), Integer.valueOf(e3n.n(U2, durationUnit3) - e3n.n(kp50.U(n, durationUnit2), durationUnit3))}, 2));
    }

    public static PublicKey u(byte[] bArr) {
        String str;
        z1[] z1VarArr = ((wvf) h3.r(bArr).t().nextElement()).a;
        if (z1VarArr.length <= 0) {
            ny61.p();
            return null;
        }
        t2 t2Var = (t2) z1VarArr[0];
        if (t2Var.equals(a490.a)) {
            str = "RSA";
        } else {
            if (!t2Var.equals(wc51.a)) {
                kbs.f(t2Var, "Unsupported key type ");
                return null;
            }
            str = "EC";
        }
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static final View v(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        ny61.i(b64.t(i, "Index: ", ", Size: "), viewGroup.getChildCount());
        return null;
    }

    public static final long w(double d2) {
        return K((float) d2, 8589934592L);
    }

    public static final long x(int i) {
        return K(i, 8589934592L);
    }

    public static final boolean y(sqm0 sqm0Var) {
        return !z(sqm0Var);
    }

    public static final boolean z(sqm0 sqm0Var) {
        return (sqm0Var instanceof oqm0) && !((oqm0) sqm0Var).a.isEmpty();
    }
}
