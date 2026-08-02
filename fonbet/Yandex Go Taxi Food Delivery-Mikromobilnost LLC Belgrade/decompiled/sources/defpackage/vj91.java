package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.b;
import com.yandex.div.state.db.StateEntry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.VisibleRegion;
import com.ybsdk.core.common.utils.theme.ThemedStringParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.deeplink.generated.DivkitAction;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.VideoQuality;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes12.dex */
public abstract class vj91 {
    public static final b[] a = new b[0];

    public static DivkitAction a(Uri uri) {
        String str;
        String str2;
        ThemedStringParams themedStringParams;
        ThemedStringParams themedStringParams2;
        ThemedStringParams themedStringParams3;
        String str3;
        Boolean j0;
        String queryParameter = uri.getQueryParameter(StateEntry.COLUMN_PATH);
        if (queryParameter == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("screen_key");
        String str4 = "";
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        String queryParameter3 = uri.getQueryParameter("only_initial_data_load");
        boolean booleanValue = (queryParameter3 == null || (j0 = evu0.j0(queryParameter3)) == null) ? true : j0.booleanValue();
        String queryParameter4 = uri.getQueryParameter("skeleton");
        String queryParameter5 = uri.getQueryParameter("skeleton_id");
        String queryParameter6 = uri.getQueryParameter(MetaDataField.SCREEN_FIELD);
        String queryParameter7 = uri.getQueryParameter("toolbar_title");
        String queryParameter8 = uri.getQueryParameter("toolbar_subtitle");
        String queryParameter9 = uri.getQueryParameter("payload");
        String queryParameter10 = uri.getQueryParameter("show_navbar");
        Boolean j02 = queryParameter10 != null ? evu0.j0(queryParameter10) : null;
        String queryParameter11 = uri.getQueryParameter("fit_window_top");
        Boolean j03 = queryParameter11 != null ? evu0.j0(queryParameter11) : null;
        String queryParameter12 = uri.getQueryParameter("bottom_bar_item_id");
        ColorModel a2 = twy0.a(uri, "header_color");
        ColorModel a3 = twy0.a(uri, "bottom_bar_color");
        String str5 = queryParameter2;
        if (uri.getQueryParameter("statusbar_style") != null) {
            str = queryParameter;
            String l = sd90.l(uri, "statusbar_style");
            if (l == null) {
                str2 = "";
            } else {
                str2 = "";
                str4 = l;
            }
            String l2 = sd90.l(uri, "statusbar_style".concat("_dark"));
            if (l2 == null) {
                l2 = str2;
            }
            themedStringParams = new ThemedStringParams(str4, l2);
        } else {
            str = queryParameter;
            str2 = "";
            themedStringParams = null;
        }
        if (uri.getQueryParameter("bottom_bar_style") != null) {
            String l3 = sd90.l(uri, "bottom_bar_style");
            if (l3 == null) {
                themedStringParams2 = themedStringParams;
                str3 = str2;
            } else {
                themedStringParams2 = themedStringParams;
                str3 = l3;
            }
            String l4 = sd90.l(uri, "bottom_bar_style".concat("_dark"));
            if (l4 == null) {
                l4 = str2;
            }
            themedStringParams3 = new ThemedStringParams(str3, l4);
        } else {
            themedStringParams2 = themedStringParams;
            themedStringParams3 = null;
        }
        return new DivkitAction(str, str5, booleanValue, queryParameter4, queryParameter5, queryParameter6, queryParameter7, queryParameter8, queryParameter9, j02, j03, queryParameter12, a2, a3, themedStringParams2, themedStringParams3);
    }

    public static void b(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.higherQualityOrLowerThan", j, null);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: hsb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            long longValue = ((Long) list.get(0)).longValue();
                            VideoQuality videoQuality = (VideoQuality) list.get(1);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                a84 a2 = n52.a(videoQuality);
                                q64 q64Var = q64.c;
                                w4uVar.j(longValue, new q64(a2, 1));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            long longValue2 = ((Long) list2.get(0)).longValue();
                            VideoQuality videoQuality2 = (VideoQuality) list2.get(1);
                            try {
                                w4u w4uVar2 = (w4u) n52Var2.a.w;
                                a84 a3 = n52.a(videoQuality2);
                                q64 q64Var2 = q64.c;
                                w4uVar2.j(longValue2, new q64(a3, 2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            long longValue3 = ((Long) list3.get(0)).longValue();
                            VideoQuality videoQuality3 = (VideoQuality) list3.get(1);
                            try {
                                w4u w4uVar3 = (w4u) n52Var2.a.w;
                                a84 a4 = n52.a(videoQuality3);
                                q64 q64Var3 = q64.c;
                                w4uVar3.j(longValue3, new q64(a4, 3));
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list4 = (List) obj;
                            long longValue4 = ((Long) list4.get(0)).longValue();
                            VideoQuality videoQuality4 = (VideoQuality) list4.get(1);
                            try {
                                w4u w4uVar4 = (w4u) n52Var2.a.w;
                                a84 a5 = n52.a(videoQuality4);
                                q64 q64Var4 = q64.c;
                                w4uVar4.j(longValue4, new q64(a5, 4));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.higherQualityThan", j, null);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: hsb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            long longValue = ((Long) list.get(0)).longValue();
                            VideoQuality videoQuality = (VideoQuality) list.get(1);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                a84 a2 = n52.a(videoQuality);
                                q64 q64Var = q64.c;
                                w4uVar.j(longValue, new q64(a2, 1));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            long longValue2 = ((Long) list2.get(0)).longValue();
                            VideoQuality videoQuality2 = (VideoQuality) list2.get(1);
                            try {
                                w4u w4uVar2 = (w4u) n52Var2.a.w;
                                a84 a3 = n52.a(videoQuality2);
                                q64 q64Var2 = q64.c;
                                w4uVar2.j(longValue2, new q64(a3, 2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            long longValue3 = ((Long) list3.get(0)).longValue();
                            VideoQuality videoQuality3 = (VideoQuality) list3.get(1);
                            try {
                                w4u w4uVar3 = (w4u) n52Var2.a.w;
                                a84 a4 = n52.a(videoQuality3);
                                q64 q64Var3 = q64.c;
                                w4uVar3.j(longValue3, new q64(a4, 3));
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list4 = (List) obj;
                            long longValue4 = ((Long) list4.get(0)).longValue();
                            VideoQuality videoQuality4 = (VideoQuality) list4.get(1);
                            try {
                                w4u w4uVar4 = (w4u) n52Var2.a.w;
                                a84 a5 = n52.a(videoQuality4);
                                q64 q64Var4 = q64.c;
                                w4uVar4.j(longValue4, new q64(a5, 4));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.lowerQualityOrHigherThan", j, null);
        if (n52Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: hsb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            long longValue = ((Long) list.get(0)).longValue();
                            VideoQuality videoQuality = (VideoQuality) list.get(1);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                a84 a2 = n52.a(videoQuality);
                                q64 q64Var = q64.c;
                                w4uVar.j(longValue, new q64(a2, 1));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            long longValue2 = ((Long) list2.get(0)).longValue();
                            VideoQuality videoQuality2 = (VideoQuality) list2.get(1);
                            try {
                                w4u w4uVar2 = (w4u) n52Var2.a.w;
                                a84 a3 = n52.a(videoQuality2);
                                q64 q64Var2 = q64.c;
                                w4uVar2.j(longValue2, new q64(a3, 2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            long longValue3 = ((Long) list3.get(0)).longValue();
                            VideoQuality videoQuality3 = (VideoQuality) list3.get(1);
                            try {
                                w4u w4uVar3 = (w4u) n52Var2.a.w;
                                a84 a4 = n52.a(videoQuality3);
                                q64 q64Var3 = q64.c;
                                w4uVar3.j(longValue3, new q64(a4, 3));
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list4 = (List) obj;
                            long longValue4 = ((Long) list4.get(0)).longValue();
                            VideoQuality videoQuality4 = (VideoQuality) list4.get(1);
                            try {
                                w4u w4uVar4 = (w4u) n52Var2.a.w;
                                a84 a5 = n52.a(videoQuality4);
                                q64 q64Var4 = q64.c;
                                w4uVar4.j(longValue4, new q64(a5, 4));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.lowerQualityThan", j, null);
        if (n52Var == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: hsb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i4;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            long longValue = ((Long) list.get(0)).longValue();
                            VideoQuality videoQuality = (VideoQuality) list.get(1);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                a84 a2 = n52.a(videoQuality);
                                q64 q64Var = q64.c;
                                w4uVar.j(longValue, new q64(a2, 1));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            long longValue2 = ((Long) list2.get(0)).longValue();
                            VideoQuality videoQuality2 = (VideoQuality) list2.get(1);
                            try {
                                w4u w4uVar2 = (w4u) n52Var2.a.w;
                                a84 a3 = n52.a(videoQuality2);
                                q64 q64Var2 = q64.c;
                                w4uVar2.j(longValue2, new q64(a3, 2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            long longValue3 = ((Long) list3.get(0)).longValue();
                            VideoQuality videoQuality3 = (VideoQuality) list3.get(1);
                            try {
                                w4u w4uVar3 = (w4u) n52Var2.a.w;
                                a84 a4 = n52.a(videoQuality3);
                                q64 q64Var3 = q64.c;
                                w4uVar3.j(longValue3, new q64(a4, 3));
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list4 = (List) obj;
                            long longValue4 = ((Long) list4.get(0)).longValue();
                            VideoQuality videoQuality4 = (VideoQuality) list4.get(1);
                            try {
                                w4u w4uVar4 = (w4u) n52Var2.a.w;
                                a84 a5 = n52.a(videoQuality4);
                                q64 q64Var4 = q64.c;
                                w4uVar4.j(longValue4, new q64(a5, 4));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        }
    }

    public static final uc4 c(VisibleRegion visibleRegion) {
        List g = scc.g(visibleRegion.getBottomLeft(), visibleRegion.getBottomRight(), visibleRegion.getTopLeft(), visibleRegion.getTopRight());
        Iterator it = g.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return null;
        }
        double longitude = ((Point) it.next()).getLongitude();
        while (it.hasNext()) {
            longitude = Math.min(longitude, ((Point) it.next()).getLongitude());
        }
        Iterator it2 = g.iterator();
        if (!it2.hasNext()) {
            ny61.p();
            return null;
        }
        double latitude = ((Point) it2.next()).getLatitude();
        while (it2.hasNext()) {
            latitude = Math.min(latitude, ((Point) it2.next()).getLatitude());
        }
        zzs zzsVar = new zzs(latitude, longitude, 0, null, null, 28);
        Iterator it3 = g.iterator();
        if (!it3.hasNext()) {
            ny61.p();
            return null;
        }
        double longitude2 = ((Point) it3.next()).getLongitude();
        while (it3.hasNext()) {
            longitude2 = Math.max(longitude2, ((Point) it3.next()).getLongitude());
        }
        Iterator it4 = g.iterator();
        if (!it4.hasNext()) {
            ny61.p();
            return null;
        }
        double latitude2 = ((Point) it4.next()).getLatitude();
        while (it4.hasNext()) {
            latitude2 = Math.max(latitude2, ((Point) it4.next()).getLatitude());
        }
        return new uc4(zzsVar, new zzs(latitude2, longitude2, 0, null, null, 28));
    }
}
