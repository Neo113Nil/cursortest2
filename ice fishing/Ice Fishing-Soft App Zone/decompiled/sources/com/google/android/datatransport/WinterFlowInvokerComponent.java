package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import android.view.ViewGroup;
import android.window.BackEvent;
import com.icewinter.flow.winter.icecatch.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowInvokerComponent {
    public static Boolean WinterFlowBatchUI = null;
    public static boolean WinterFlowHookDataSource = false;
    public static Boolean WinterFlowMapperProtocol;
    public static final WinterFlowJSONDecorator WinterFlowOrchestrationSubsystem;
    public static Boolean WinterFlowRouterAdapter;
    public static final WinterFlowEventTool WinterFlowRouterRouter;
    public static WinterFlowSyntaxRequest WinterFlowRouterStructure;
    public static Boolean WinterFlowSerializerStructure;
    public static final WinterFlowJSONDecorator WinterFlowServiceUtility;
    public static final WinterFlowInvokerEngine WinterFlowSingletonPlatform;
    public static final WinterFlowSessionManagerProcess WinterFlowTransactionManagerStrategy;
    public static final WinterFlowEventTool WinterFlowUnitTestResponse;
    public static final WinterFlowInvokerEngine WinterFlowVariableBandwidth;
    public static final WinterFlowJavaService WinterFlowCacheManagerAgent = new WinterFlowJavaService();
    public static final WinterFlowMicroserviceAgent WinterFlowArrayNetwork = new WinterFlowMicroserviceAgent();
    public static final WinterFlowCacheUtility WinterFlowVariableVersionControl = new WinterFlowCacheUtility(27);
    public static final WinterFlowEventTool WinterFlowSyntax = new WinterFlowEventTool(-1778854562, false, new WinterFlowHandlerTool(5));
    public static final double[][] WinterFlowResponseEngine = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] WinterFlowTransactionAgent = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] WinterFlowServerProtocol = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] WinterFlowThreadListener = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final WinterFlowAlgorithmDebug WinterFlowBandwidthObject = new WinterFlowAlgorithmDebug(18);
    public static final WinterFlowInvokerEngine WinterFlowConcurrencyThread = new WinterFlowInvokerEngine(24);

    static {
        int i = 26;
        WinterFlowTransactionManagerStrategy = new WinterFlowSessionManagerProcess(i);
        int i2 = 0;
        WinterFlowUnitTestResponse = new WinterFlowEventTool(1135987704, false, new WinterFlowXMLArray(i2));
        WinterFlowRouterRouter = new WinterFlowEventTool(667514727, false, new WinterFlowHandlerTool(i2));
        int i3 = 25;
        WinterFlowServiceUtility = new WinterFlowJSONDecorator(i3, "NO_OWNER");
        WinterFlowOrchestrationSubsystem = new WinterFlowJSONDecorator(i3, "NO_THREAD_ELEMENTS");
        WinterFlowSingletonPlatform = new WinterFlowInvokerEngine(i3);
        WinterFlowVariableBandwidth = new WinterFlowInvokerEngine(i);
    }

    public static final float WinterFlowArrayHelper(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = WinterFlowSessionProvider.WinterFlowRouterStructure;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? WinterFlowMiddlewareUserManager.WinterFlowRouterStructure[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final long WinterFlowArrayNetwork(int i) {
        long j = i << 32;
        int i2 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return j;
    }

    public static final WinterFlowTransactionManagerEncryption WinterFlowBackendCacheManager(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (WinterFlowTransactionManagerEncryption) weakReference.get();
        }
        return null;
    }

    public static void WinterFlowBandwidthObject(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r1.WinterFlowRouterRouter(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowBatchUI(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowFrameworkAgent winterFlowFrameworkAgent, boolean z, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowSyntaxManager winterFlowSyntaxManager;
        int i;
        WinterFlowThreadPoolServiceProvider it;
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider;
        WinterFlowCacheInterface winterFlowCacheInterface2;
        Object WinterFlowHookDataSource2;
        try {
            if (winterFlowTransactionManagerLayer instanceof WinterFlowSyntaxManager) {
                winterFlowSyntaxManager = (WinterFlowSyntaxManager) winterFlowTransactionManagerLayer;
                int i2 = winterFlowSyntaxManager.WinterFlowThreadListener;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowSyntaxManager.WinterFlowThreadListener = i2 - Integer.MIN_VALUE;
                    Object obj = winterFlowSyntaxManager.WinterFlowServerProtocol;
                    i = winterFlowSyntaxManager.WinterFlowThreadListener;
                    CancellationException cancellationException = null;
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        if (winterFlowCacheInterface instanceof WinterFlowResponseDebug) {
                            throw ((WinterFlowResponseDebug) winterFlowCacheInterface).WinterFlowVariableVersionControl;
                        }
                        it = winterFlowFrameworkAgent.iterator();
                        winterFlowSyntaxManager.WinterFlowRouterRouter = winterFlowCacheInterface;
                        winterFlowSyntaxManager.WinterFlowSyntax = winterFlowFrameworkAgent;
                        winterFlowSyntaxManager.WinterFlowResponseEngine = it;
                        winterFlowSyntaxManager.WinterFlowTransactionAgent = z;
                        winterFlowSyntaxManager.WinterFlowThreadListener = 1;
                        WinterFlowHookDataSource2 = it.WinterFlowHookDataSource(winterFlowSyntaxManager);
                        if (WinterFlowHookDataSource2 != winterFlowListenerJava) {
                        }
                    } else if (i == 1) {
                        z = winterFlowSyntaxManager.WinterFlowTransactionAgent;
                        winterFlowThreadPoolServiceProvider = winterFlowSyntaxManager.WinterFlowResponseEngine;
                        winterFlowFrameworkAgent = winterFlowSyntaxManager.WinterFlowSyntax;
                        winterFlowCacheInterface2 = winterFlowSyntaxManager.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = winterFlowSyntaxManager.WinterFlowTransactionAgent;
                        winterFlowThreadPoolServiceProvider = winterFlowSyntaxManager.WinterFlowResponseEngine;
                        winterFlowFrameworkAgent = winterFlowSyntaxManager.WinterFlowSyntax;
                        winterFlowCacheInterface2 = winterFlowSyntaxManager.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        it = winterFlowThreadPoolServiceProvider;
                        winterFlowCacheInterface = winterFlowCacheInterface2;
                        winterFlowSyntaxManager.WinterFlowRouterRouter = winterFlowCacheInterface;
                        winterFlowSyntaxManager.WinterFlowSyntax = winterFlowFrameworkAgent;
                        winterFlowSyntaxManager.WinterFlowResponseEngine = it;
                        winterFlowSyntaxManager.WinterFlowTransactionAgent = z;
                        winterFlowSyntaxManager.WinterFlowThreadListener = 1;
                        WinterFlowHookDataSource2 = it.WinterFlowHookDataSource(winterFlowSyntaxManager);
                        if (WinterFlowHookDataSource2 != winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        winterFlowCacheInterface2 = winterFlowCacheInterface;
                        winterFlowThreadPoolServiceProvider = it;
                        obj = WinterFlowHookDataSource2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                winterFlowFrameworkAgent.WinterFlowArrayNetwork(null);
                            }
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                        Object WinterFlowCacheManagerAgent2 = winterFlowThreadPoolServiceProvider.WinterFlowCacheManagerAgent();
                        winterFlowSyntaxManager.WinterFlowRouterRouter = winterFlowCacheInterface2;
                        winterFlowSyntaxManager.WinterFlowSyntax = winterFlowFrameworkAgent;
                        winterFlowSyntaxManager.WinterFlowResponseEngine = winterFlowThreadPoolServiceProvider;
                        winterFlowSyntaxManager.WinterFlowTransactionAgent = z;
                        winterFlowSyntaxManager.WinterFlowThreadListener = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        winterFlowSyntaxManager = new WinterFlowSyntaxManager(winterFlowTransactionManagerLayer);
        Object obj2 = winterFlowSyntaxManager.WinterFlowServerProtocol;
        i = winterFlowSyntaxManager.WinterFlowThreadListener;
        CancellationException cancellationException2 = null;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long WinterFlowCacheManagerAgent(float f, float f2, float f3, float f4, WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend) {
        int i;
        int i2;
        int i3;
        float WinterFlowHookDataSource2;
        float WinterFlowRouterStructure2;
        int i4;
        int i5;
        int i6;
        int i7;
        float WinterFlowHookDataSource3;
        float WinterFlowRouterStructure3;
        int i8;
        int i9;
        int i10;
        if (winterFlowTransactionManagerBackend.WinterFlowCacheManagerAgent()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            long j = (i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i14 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
            return j;
        }
        if (((int) (winterFlowTransactionManagerBackend.WinterFlowHookDataSource >> 32)) != 3) {
            WinterFlowThreadSessionManager.WinterFlowRouterStructure("Color only works with ColorSpaces with 3 components");
        }
        int i15 = winterFlowTransactionManagerBackend.WinterFlowCacheManagerAgent;
        if (i15 == -1) {
            WinterFlowThreadSessionManager.WinterFlowRouterStructure("Unknown color space, please use a color space in ColorSpaces");
        }
        float WinterFlowHookDataSource4 = winterFlowTransactionManagerBackend.WinterFlowHookDataSource(0);
        float WinterFlowRouterStructure4 = winterFlowTransactionManagerBackend.WinterFlowRouterStructure(0);
        if (f >= WinterFlowHookDataSource4) {
            WinterFlowHookDataSource4 = f;
        }
        if (WinterFlowHookDataSource4 <= WinterFlowRouterStructure4) {
            WinterFlowRouterStructure4 = WinterFlowHookDataSource4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(WinterFlowRouterStructure4);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    WinterFlowHookDataSource2 = winterFlowTransactionManagerBackend.WinterFlowHookDataSource(1);
                    WinterFlowRouterStructure2 = winterFlowTransactionManagerBackend.WinterFlowRouterStructure(1);
                    if (f2 >= WinterFlowHookDataSource2) {
                        WinterFlowHookDataSource2 = f2;
                    }
                    if (WinterFlowHookDataSource2 <= WinterFlowRouterStructure2) {
                        WinterFlowRouterStructure2 = WinterFlowHookDataSource2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(WinterFlowRouterStructure2);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                WinterFlowHookDataSource3 = winterFlowTransactionManagerBackend.WinterFlowHookDataSource(2);
                                WinterFlowRouterStructure3 = winterFlowTransactionManagerBackend.WinterFlowRouterStructure(2);
                                if (f3 >= WinterFlowHookDataSource3) {
                                    WinterFlowHookDataSource3 = f3;
                                }
                                if (WinterFlowHookDataSource3 <= WinterFlowRouterStructure3) {
                                    WinterFlowRouterStructure3 = WinterFlowHookDataSource3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(WinterFlowRouterStructure3);
                                int i23 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            long j2 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i27 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
                                            return j2;
                                        }
                                        i9 = i26;
                                        r7 = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (r7 << 10);
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i272 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    WinterFlowHookDataSource3 = winterFlowTransactionManagerBackend.WinterFlowHookDataSource(2);
                    WinterFlowRouterStructure3 = winterFlowTransactionManagerBackend.WinterFlowRouterStructure(2);
                    if (f3 >= WinterFlowHookDataSource3) {
                    }
                    if (WinterFlowHookDataSource3 <= WinterFlowRouterStructure3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(WinterFlowRouterStructure3);
                    int i232 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (r7 << 10);
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (i15 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2722 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s3 = (short) i3;
        WinterFlowHookDataSource2 = winterFlowTransactionManagerBackend.WinterFlowHookDataSource(1);
        WinterFlowRouterStructure2 = winterFlowTransactionManagerBackend.WinterFlowRouterStructure(1);
        if (f2 >= WinterFlowHookDataSource2) {
        }
        if (WinterFlowHookDataSource2 <= WinterFlowRouterStructure2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(WinterFlowRouterStructure2);
        int i202 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        WinterFlowHookDataSource3 = winterFlowTransactionManagerBackend.WinterFlowHookDataSource(2);
        WinterFlowRouterStructure3 = winterFlowTransactionManagerBackend.WinterFlowRouterStructure(2);
        if (f3 >= WinterFlowHookDataSource3) {
        }
        if (WinterFlowHookDataSource3 <= WinterFlowRouterStructure3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(WinterFlowRouterStructure3);
        int i2322 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (r7 << 10);
        if (f4 >= 0.0f) {
        }
        long j2222 = (i15 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i27222 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return j2222;
    }

    public static double WinterFlowCacheManagerListener(double d) {
        double abs = Math.abs(d);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d < 0.0d ? -1 : d == 0.0d ? 0 : 1);
    }

    public static final void WinterFlowCacheTool(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Object obj) {
        if (obj == WinterFlowOrchestrationSubsystem) {
            return;
        }
        if (!(obj instanceof WinterFlowGatewayInterface)) {
            Object WinterFlowServiceUtility2 = winterFlowEncryptionMicroservice.WinterFlowServiceUtility(WinterFlowSingletonPlatform, null);
            WinterFlowServiceUtility2.getClass();
            ((WinterFlowConsumerModule) WinterFlowServiceUtility2).WinterFlowRouterStructure(obj);
            return;
        }
        WinterFlowGatewayInterface winterFlowGatewayInterface = (WinterFlowGatewayInterface) obj;
        WinterFlowConsumerModule[] winterFlowConsumerModuleArr = winterFlowGatewayInterface.WinterFlowCacheManagerAgent;
        int length = winterFlowConsumerModuleArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            WinterFlowConsumerModule winterFlowConsumerModule = winterFlowConsumerModuleArr[length];
            winterFlowConsumerModule.getClass();
            winterFlowConsumerModule.WinterFlowRouterStructure(winterFlowGatewayInterface.WinterFlowHookDataSource[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static void WinterFlowCloudMicroservice(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i3) / iArr.length;
        float f = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f);
            f += i7 + length;
        }
    }

    public static double WinterFlowCompilerDataSource(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static float WinterFlowCompilerHandler(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static final WinterFlowConsumerBandwidth WinterFlowCompilerVariable(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
        if (winterFlowConsumerBandwidth != null) {
            return winterFlowConsumerBandwidth;
        }
        WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(winterFlowEncryptionMicroservice, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static WinterFlowFunctionSubsystem WinterFlowConcurrencyThread(WinterFlowFunctionSubsystem winterFlowFunctionSubsystem, float f) {
        float f2 = ((WinterFlowVariableSubsystem) winterFlowFunctionSubsystem.WinterFlowUnitTestResponse).WinterFlowRouterStructure;
        return new WinterFlowFunctionSubsystem(winterFlowFunctionSubsystem.WinterFlowVariableVersionControl, Float.valueOf(f), new WinterFlowVariableSubsystem(f2), winterFlowFunctionSubsystem.WinterFlowRouterRouter, winterFlowFunctionSubsystem.WinterFlowSyntax, winterFlowFunctionSubsystem.WinterFlowResponseEngine);
    }

    public static final int WinterFlowConfiguration(long j) {
        float[] fArr = WinterFlowIDEStructure.WinterFlowRouterStructure;
        return (int) (WinterFlowInheritanceSubsystem.WinterFlowRouterStructure(j, WinterFlowIDEStructure.WinterFlowVariableVersionControl) >>> 32);
    }

    public static final void WinterFlowConfigurationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Throwable th) {
        Throwable runtimeException;
        Iterator it = WinterFlowThreadPoolBatch.WinterFlowRouterStructure.iterator();
        while (it.hasNext()) {
            try {
                ((WinterFlowControllerLayer) it.next()).WinterFlowRouterAdapter(winterFlowEncryptionMicroservice, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th, new WinterFlowRepositoryBatch(winterFlowEncryptionMicroservice));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final Rect WinterFlowConsumerUserManager(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final float WinterFlowEventEmitterController(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = WinterFlowSessionProvider.WinterFlowRouterStructure;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : WinterFlowMiddlewareUserManager.WinterFlowRouterStructure[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final Object WinterFlowFrameworkTransaction(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Object obj) {
        if (obj == null) {
            obj = WinterFlowProxyStructure(winterFlowEncryptionMicroservice);
        }
        if (obj == 0) {
            return WinterFlowOrchestrationSubsystem;
        }
        if (!(obj instanceof Integer)) {
            return ((WinterFlowConsumerModule) obj).WinterFlowCacheManagerAgent();
        }
        return winterFlowEncryptionMicroservice.WinterFlowServiceUtility(WinterFlowVariableBandwidth, new WinterFlowGatewayInterface(((Number) obj).intValue(), winterFlowEncryptionMicroservice));
    }

    public static void WinterFlowFrontendBackend(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final void WinterFlowHookDataSource(int i, WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowMapperManager winterFlowMapperManager) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-932836462);
        int i2 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 32 : 16);
        int i3 = 0;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 19) != 18)) {
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary, WinterFlowVariableBandwidth(winterFlowMapperManager, winterFlowObjectSession));
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowSyntaxServer(winterFlowMapperManager, winterFlowObjectSession, i, i3);
        }
    }

    public static final View WinterFlowMapperProtocol(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(WinterFlowSerializerStructure(view, R.id.view_tree_lifecycle_owner), WinterFlowSerializerStructure(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (WinterFlowBackendCacheManager(view) == null) {
                i++;
                Object WinterFlowCacheManagerAgent2 = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(view);
                View view4 = view2;
                view2 = view;
                view = WinterFlowCacheManagerAgent2 instanceof View ? (View) WinterFlowCacheManagerAgent2 : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d4  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void WinterFlowModuleAgent(Context context, Executor executor, WinterFlowWidgetCache winterFlowWidgetCache, boolean z) {
        boolean z2;
        ?? r7;
        WinterFlowNodeNetwork[] winterFlowNodeNetworkArr;
        WinterFlowNodeNetwork[] winterFlowNodeNetworkArr2;
        WinterFlowNodeNetwork[] winterFlowNodeNetworkArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        WinterFlowUnitTestLayer winterFlowUnitTestLayer;
        String str;
        String str2;
        FileInputStream WinterFlowRouterStructure2;
        boolean z8;
        boolean z9;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z9 = readLong == packageInfo.lastUpdateTime;
                            if (z9) {
                                winterFlowWidgetCache.WinterFlowSyntax(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z9) {
                        context.getPackageName();
                        WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, false);
                        return;
                    }
                }
                z9 = false;
                if (z9) {
                }
            }
            context.getPackageName();
            byte[] bArr2 = WinterFlowSoftwareException.WinterFlowArrayNetwork;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            WinterFlowUnitTestLayer winterFlowUnitTestLayer2 = new WinterFlowUnitTestLayer(assets, executor, winterFlowWidgetCache, name, file2);
            byte[] bArr3 = winterFlowUnitTestLayer2.WinterFlowCacheManagerAgent;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        winterFlowUnitTestLayer2.WinterFlowHookDataSource(4, null);
                    }
                    winterFlowUnitTestLayer2.WinterFlowTransactionManagerStrategy = true;
                    try {
                        try {
                            r7 = winterFlowUnitTestLayer2.WinterFlowRouterStructure(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            winterFlowWidgetCache.WinterFlowSyntax(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            winterFlowNodeNetworkArr2 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                            if (winterFlowNodeNetworkArr2 != null) {
                            }
                            WinterFlowWidgetCache winterFlowWidgetCache2 = winterFlowUnitTestLayer2.WinterFlowHookDataSource;
                            winterFlowNodeNetworkArr3 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                            byte[] bArr4 = winterFlowUnitTestLayer2.WinterFlowCacheManagerAgent;
                            boolean z10 = r7;
                            z10 = r7;
                            if (winterFlowNodeNetworkArr3 != null) {
                            }
                            bArr = winterFlowUnitTestLayer2.WinterFlowRouterRouter;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z8 = z5;
                            WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                        } catch (IOException e2) {
                            winterFlowWidgetCache.WinterFlowSyntax(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            winterFlowNodeNetworkArr2 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                            if (winterFlowNodeNetworkArr2 != null) {
                            }
                            WinterFlowWidgetCache winterFlowWidgetCache22 = winterFlowUnitTestLayer2.WinterFlowHookDataSource;
                            winterFlowNodeNetworkArr3 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                            byte[] bArr42 = winterFlowUnitTestLayer2.WinterFlowCacheManagerAgent;
                            boolean z102 = r7;
                            z102 = r7;
                            if (winterFlowNodeNetworkArr3 != null) {
                            }
                            bArr = winterFlowUnitTestLayer2.WinterFlowRouterRouter;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z8 = z5;
                            WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                        }
                        if (r7 != 0) {
                            try {
                            } catch (IOException e3) {
                                winterFlowWidgetCache.WinterFlowSyntax(7, e3);
                                try {
                                    r7.close();
                                } catch (IOException e4) {
                                    winterFlowWidgetCache.WinterFlowSyntax(7, e4);
                                }
                                winterFlowNodeNetworkArr = null;
                                winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = winterFlowNodeNetworkArr;
                                winterFlowNodeNetworkArr2 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                                if (winterFlowNodeNetworkArr2 != null) {
                                }
                                WinterFlowWidgetCache winterFlowWidgetCache222 = winterFlowUnitTestLayer2.WinterFlowHookDataSource;
                                winterFlowNodeNetworkArr3 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                                byte[] bArr422 = winterFlowUnitTestLayer2.WinterFlowCacheManagerAgent;
                                boolean z1022 = r7;
                                z1022 = r7;
                                if (winterFlowNodeNetworkArr3 != null) {
                                }
                                bArr = winterFlowUnitTestLayer2.WinterFlowRouterRouter;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z8 = z5;
                                WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                            } catch (IllegalStateException e5) {
                                winterFlowWidgetCache.WinterFlowSyntax(8, e5);
                                r7.close();
                                winterFlowNodeNetworkArr = null;
                                winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = winterFlowNodeNetworkArr;
                                winterFlowNodeNetworkArr2 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                                if (winterFlowNodeNetworkArr2 != null) {
                                }
                                WinterFlowWidgetCache winterFlowWidgetCache2222 = winterFlowUnitTestLayer2.WinterFlowHookDataSource;
                                winterFlowNodeNetworkArr3 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                                byte[] bArr4222 = winterFlowUnitTestLayer2.WinterFlowCacheManagerAgent;
                                boolean z10222 = r7;
                                z10222 = r7;
                                if (winterFlowNodeNetworkArr3 != null) {
                                }
                                bArr = winterFlowUnitTestLayer2.WinterFlowRouterRouter;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z8 = z5;
                                WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                            }
                            if (!Arrays.equals(bArr2, WinterFlowServerManager.WinterFlowArrayHelper(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            winterFlowNodeNetworkArr = WinterFlowSoftwareException.WinterFlowProxyStructure(r7, WinterFlowServerManager.WinterFlowArrayHelper(r7, 4), winterFlowUnitTestLayer2.WinterFlowVariableVersionControl);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                winterFlowWidgetCache.WinterFlowSyntax(7, e6);
                            }
                            winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = winterFlowNodeNetworkArr;
                        }
                        winterFlowNodeNetworkArr2 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                        if (winterFlowNodeNetworkArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                WinterFlowRouterStructure2 = winterFlowUnitTestLayer2.WinterFlowRouterStructure(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e7) {
                                winterFlowWidgetCache.WinterFlowSyntax(9, e7);
                                str = r7;
                            } catch (IOException e8) {
                                winterFlowWidgetCache.WinterFlowSyntax(7, e8);
                                str = r7;
                            } catch (IllegalStateException e9) {
                                winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = null;
                                winterFlowWidgetCache.WinterFlowSyntax(8, e9);
                                str = r7;
                            }
                            if (WinterFlowRouterStructure2 == null) {
                                try {
                                    if (!Arrays.equals(WinterFlowSoftwareException.WinterFlowVariableVersionControl, WinterFlowServerManager.WinterFlowArrayHelper(WinterFlowRouterStructure2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] WinterFlowArrayHelper = WinterFlowServerManager.WinterFlowArrayHelper(WinterFlowRouterStructure2, 4);
                                    winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = WinterFlowSoftwareException.WinterFlowUIMiddleware(WinterFlowRouterStructure2, WinterFlowArrayHelper, bArr3, winterFlowNodeNetworkArr2);
                                    WinterFlowRouterStructure2.close();
                                    winterFlowUnitTestLayer = winterFlowUnitTestLayer2;
                                    r7 = WinterFlowArrayHelper;
                                    if (winterFlowUnitTestLayer != null) {
                                        winterFlowUnitTestLayer2 = winterFlowUnitTestLayer;
                                    }
                                } finally {
                                }
                            } else {
                                if (WinterFlowRouterStructure2 != null) {
                                    WinterFlowRouterStructure2.close();
                                    str = str2;
                                }
                                winterFlowUnitTestLayer = null;
                                r7 = str;
                                if (winterFlowUnitTestLayer != null) {
                                }
                            }
                        }
                        WinterFlowWidgetCache winterFlowWidgetCache22222 = winterFlowUnitTestLayer2.WinterFlowHookDataSource;
                        winterFlowNodeNetworkArr3 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                        byte[] bArr42222 = winterFlowUnitTestLayer2.WinterFlowCacheManagerAgent;
                        boolean z102222 = r7;
                        z102222 = r7;
                        if (winterFlowNodeNetworkArr3 != null && bArr42222 != null) {
                            r72 = winterFlowUnitTestLayer2.WinterFlowTransactionManagerStrategy;
                            if (r72 != 0) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                winterFlowWidgetCache22222.WinterFlowSyntax(7, e10);
                                z7 = r72;
                            } catch (IllegalStateException e11) {
                                winterFlowWidgetCache22222.WinterFlowSyntax(8, e11);
                                z7 = r72;
                            }
                            if (WinterFlowSoftwareException.WinterFlowVariableInterface(r72, bArr42222, winterFlowNodeNetworkArr3)) {
                                winterFlowUnitTestLayer2.WinterFlowRouterRouter = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = null;
                                z102222 = z7;
                            } else {
                                winterFlowWidgetCache22222.WinterFlowSyntax(5, null);
                                winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = null;
                                r72.close();
                                z102222 = r72;
                            }
                        }
                        bArr = winterFlowUnitTestLayer2.WinterFlowRouterRouter;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!winterFlowUnitTestLayer2.WinterFlowTransactionManagerStrategy) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(winterFlowUnitTestLayer2.WinterFlowArrayNetwork);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                winterFlowUnitTestLayer2.WinterFlowHookDataSource(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                winterFlowUnitTestLayer2.WinterFlowRouterRouter = null;
                                                                                winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        z102222 = true;
                                        winterFlowUnitTestLayer2.WinterFlowHookDataSource(6, e);
                                        z3 = z102222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z8 = z5;
                                        WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                                    } catch (IOException e13) {
                                        e = e13;
                                        z102222 = true;
                                        winterFlowUnitTestLayer2.WinterFlowHookDataSource(7, e);
                                        z3 = z102222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z8 = z5;
                                        WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    winterFlowUnitTestLayer2.WinterFlowHookDataSource(6, e);
                                    z3 = z102222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z8 = z5;
                                    WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                                } catch (IOException e15) {
                                    e = e15;
                                    winterFlowUnitTestLayer2.WinterFlowHookDataSource(7, e);
                                    z3 = z102222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z8 = z5;
                                    WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
                                }
                            } finally {
                                winterFlowUnitTestLayer2.WinterFlowRouterRouter = null;
                                winterFlowUnitTestLayer2.WinterFlowUnitTestResponse = null;
                            }
                        }
                        if (z4) {
                            WinterFlowFrontendBackend(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z8 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            winterFlowUnitTestLayer2.WinterFlowHookDataSource(4, null);
                        }
                        winterFlowUnitTestLayer2.WinterFlowTransactionManagerStrategy = true;
                        r7 = winterFlowUnitTestLayer2.WinterFlowRouterStructure(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        winterFlowNodeNetworkArr2 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                        if (winterFlowNodeNetworkArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            WinterFlowRouterStructure2 = winterFlowUnitTestLayer2.WinterFlowRouterStructure(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (WinterFlowRouterStructure2 == null) {
                            }
                        }
                        WinterFlowWidgetCache winterFlowWidgetCache222222 = winterFlowUnitTestLayer2.WinterFlowHookDataSource;
                        winterFlowNodeNetworkArr3 = winterFlowUnitTestLayer2.WinterFlowUnitTestResponse;
                        byte[] bArr422222 = winterFlowUnitTestLayer2.WinterFlowCacheManagerAgent;
                        boolean z1022222 = r7;
                        z1022222 = r7;
                        if (winterFlowNodeNetworkArr3 != null) {
                            r72 = winterFlowUnitTestLayer2.WinterFlowTransactionManagerStrategy;
                            if (r72 != 0) {
                            }
                        }
                        bArr = winterFlowUnitTestLayer2.WinterFlowRouterRouter;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z8 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        winterFlowUnitTestLayer2.WinterFlowHookDataSource(4, null);
                    }
                }
                WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
            }
            winterFlowUnitTestLayer2.WinterFlowHookDataSource(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z8 = z2;
            WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, (z6 || !z) ? false : z8);
        } catch (PackageManager.NameNotFoundException e16) {
            winterFlowWidgetCache.WinterFlowSyntax(7, e16);
            WinterFlowDataSourceModule.WinterFlowCacheManagerAgent(context, false);
        }
    }

    public static WinterFlowMapperManager WinterFlowOrchestrationConfiguration(WinterFlowMapperManager winterFlowMapperManager, WinterFlowStackQuery winterFlowStackQuery) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(WinterFlowManagerRequest.WinterFlowSingletonPlatform(WinterFlowValidatorComponent.WinterFlowRouterStructure, WinterFlowProcessorSessionManager.WinterFlowCacheManagerAgent)).WinterFlowCacheManagerAgent(new WinterFlowFunctionMechanism(null, null, WinterFlowBackendBatch.WinterFlowVariableVersionControl, winterFlowStackQuery.WinterFlowArrayNetwork, winterFlowStackQuery, true, true)).WinterFlowCacheManagerAgent(new WinterFlowInheritanceController(winterFlowStackQuery));
    }

    public static double WinterFlowOrchestrationSubsystem(double d) {
        double pow = Math.pow(Math.abs(d), 0.42d);
        return (((d < 0.0d ? -1 : d == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static final WinterFlowVersionControlView WinterFlowPackageIDE(WinterFlowConsumerBandwidth winterFlowConsumerBandwidth, boolean z, WinterFlowMicroserviceRefactoring winterFlowMicroserviceRefactoring) {
        if (winterFlowConsumerBandwidth instanceof WinterFlowControllerTransaction) {
            return ((WinterFlowControllerTransaction) winterFlowConsumerBandwidth).WinterFlowUIMiddleware(z, winterFlowMicroserviceRefactoring);
        }
        return winterFlowConsumerBandwidth.WinterFlowSingletonPlatform(winterFlowMicroserviceRefactoring.WinterFlowThreadListener(), z, new WinterFlowFrameworkCache(1, winterFlowMicroserviceRefactoring, WinterFlowMicroserviceRefactoring.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 2));
    }

    public static final Object WinterFlowProxyStructure(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        Object WinterFlowServiceUtility2 = winterFlowEncryptionMicroservice.WinterFlowServiceUtility(WinterFlowConcurrencyThread, 0);
        WinterFlowServiceUtility2.getClass();
        return WinterFlowServiceUtility2;
    }

    public static final WinterFlowStackQuery WinterFlowQueueService(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        Object[] objArr = new Object[0];
        boolean WinterFlowCacheManagerAgent2 = winterFlowResolverLibrary.WinterFlowCacheManagerAgent(0);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowCacheManagerAgent2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
            WinterFlowSyntaxSubsystem = new WinterFlowArrayHelper(4);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
        return (WinterFlowStackQuery) WinterFlowWorkerVersionControl.WinterFlowThreadListener(objArr, WinterFlowStackQuery.WinterFlowResponseEngine, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 0);
    }

    public static WinterFlowQueueManager WinterFlowResolverController(String str, WinterFlowCompilerMechanism winterFlowCompilerMechanism) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowConfigurationDeserialization.class));
        for (Class cls : new Class[0]) {
            WinterFlowServiceUtility(cls, "Null interface");
            hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls));
        }
        WinterFlowOrchestrationConcurrency WinterFlowRouterStructure2 = WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(Context.class);
        if (hashSet.contains(WinterFlowRouterStructure2.WinterFlowRouterStructure)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(WinterFlowRouterStructure2);
        return new WinterFlowQueueManager(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new WinterFlowStackInterface(4, str, winterFlowCompilerMechanism), hashSet3);
    }

    public static final WinterFlowSessionUserManager WinterFlowResponseEngine(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new WinterFlowSessionUserManager(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void WinterFlowRouterAdapter(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
        if (winterFlowConsumerBandwidth != null && !winterFlowConsumerBandwidth.WinterFlowHookDataSource()) {
            throw winterFlowConsumerBandwidth.WinterFlowBandwidthObject();
        }
    }

    public static final void WinterFlowRouterRouter(WinterFlowMapperManager winterFlowMapperManager, WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1090521195);
        int i2 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent) ? 32 : 16);
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 19) != 18)) {
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = WinterFlowRefactoringSubsystem.WinterFlowHookDataSource;
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowWorkerModule winterFlowWorkerModule = (WinterFlowWorkerModule) WinterFlowSyntaxSubsystem;
            int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowMapperManager);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowWorkerModule);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
            winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowResolverLibrary, Integer.valueOf((i3 >> 6) & 14));
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowUIPlatform(winterFlowMapperManager, winterFlowEventEvent, i);
        }
    }

    public static WinterFlowFunctionSubsystem WinterFlowRouterStructure(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new WinterFlowFunctionSubsystem(WinterFlowEncryptionSubsystem.WinterFlowRouterAdapter, Float.valueOf(0.0f), new WinterFlowVariableSubsystem(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final int WinterFlowSerializerStructure(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object WinterFlowCacheManagerAgent2 = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(view);
            view = WinterFlowCacheManagerAgent2 instanceof View ? (View) WinterFlowCacheManagerAgent2 : null;
        }
        return i3;
    }

    public static boolean WinterFlowServerProtocol(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static void WinterFlowServiceUtility(Object obj, String str) {
        if (obj != null) {
            return;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy(str);
    }

    public static WinterFlowQueueManager WinterFlowSingletonPlatform(String str, String str2) {
        WinterFlowConfigurationDeserialization winterFlowConfigurationDeserialization = new WinterFlowConfigurationDeserialization(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowConfigurationDeserialization.class));
        return new WinterFlowQueueManager(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new WinterFlowWorkerTool(0, winterFlowConfigurationDeserialization), hashSet3);
    }

    public static final boolean WinterFlowSoftwareEngine(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean WinterFlowSoftwareProtocol(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
        if (winterFlowConsumerBandwidth != null) {
            return winterFlowConsumerBandwidth.WinterFlowHookDataSource();
        }
        return true;
    }

    public static double WinterFlowStrategyTool(double[] dArr) {
        double d = dArr[0];
        double[][] dArr2 = WinterFlowResponseEngine;
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double WinterFlowOrchestrationSubsystem2 = WinterFlowOrchestrationSubsystem(d6);
        double WinterFlowOrchestrationSubsystem3 = WinterFlowOrchestrationSubsystem(d7);
        double WinterFlowOrchestrationSubsystem4 = WinterFlowOrchestrationSubsystem(d8);
        return Math.atan2(((WinterFlowOrchestrationSubsystem2 + WinterFlowOrchestrationSubsystem3) - (WinterFlowOrchestrationSubsystem4 * 2.0d)) / 9.0d, ((((-12.0d) * WinterFlowOrchestrationSubsystem3) + (WinterFlowOrchestrationSubsystem2 * 11.0d)) + WinterFlowOrchestrationSubsystem4) / 11.0d);
    }

    public static final void WinterFlowSyntax(WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, WinterFlowRefactoringServer winterFlowRefactoringServer, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(233973821);
        int i2 = 2;
        if ((((winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowLibrarySessionManager) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowRefactoringServer) ? 32 : 16)) & 147) == 146 && winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
            winterFlowResolverLibrary.WinterFlowQueueService();
        } else {
            WinterFlowHandlerWebsocket.WinterFlowCacheManagerAgent(new WinterFlowRepositoryWorker[]{WinterFlowUnitTestTool.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowLibrarySessionManager), WinterFlowAlgorithmDeployment.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowLibrarySessionManager), WinterFlowDatabaseLayer.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowLibrarySessionManager)}, WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(1808964477, new WinterFlowProtocolLayer(i2, winterFlowRefactoringServer, winterFlowEventTool), winterFlowResolverLibrary), winterFlowResolverLibrary, 56);
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowConsumerVersionControl(winterFlowLibrarySessionManager, winterFlowRefactoringServer, winterFlowEventTool, i, 5);
        }
    }

    public static final boolean WinterFlowSyntaxSubsystem(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (winterFlowSchedulerStructure.WinterFlowServerProtocol == null) {
            return false;
        }
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth2 = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
        return (WinterFlowVariableBandwidth2 != null ? WinterFlowVariableBandwidth2.WinterFlowServerProtocol : null) == null || winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowHookDataSource;
    }

    public static boolean WinterFlowTestingNode(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (WinterFlowBatchUI == null) {
            WinterFlowBatchUI = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean bool = WinterFlowRouterAdapter;
        if (bool == null) {
            bool = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            WinterFlowRouterAdapter = bool;
        }
        return bool.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final void WinterFlowThreadListener(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, CancellationException cancellationException) {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
        if (winterFlowConsumerBandwidth != null) {
            winterFlowConsumerBandwidth.WinterFlowArrayNetwork(cancellationException);
        }
    }

    public static final void WinterFlowTransactionAgent(WinterFlowRefactoringServer winterFlowRefactoringServer, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(832919318);
        int i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowRefactoringServer) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventTool) ? 32 : 16);
        if ((i2 & 19) == 18 && winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
            winterFlowResolverLibrary.WinterFlowQueueService();
        } else {
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = new WinterFlowInterfaceSoftware(22);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowObjectSession winterFlowObjectSession = (WinterFlowObjectSession) WinterFlowSyntaxSubsystem;
            WinterFlowProviderCacheManager WinterFlowRouterStructure2 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
            if (WinterFlowRouterStructure2 == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            WinterFlowEventEmitterCacheManager WinterFlowRouterStructure3 = WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowSerializerQuery.class);
            WinterFlowFunctionComponent winterFlowFunctionComponent = new WinterFlowFunctionComponent(0);
            winterFlowFunctionComponent.WinterFlowRouterStructure(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowSerializerQuery.class), winterFlowObjectSession);
            WinterFlowSerializerQuery winterFlowSerializerQuery = (WinterFlowSerializerQuery) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowRouterStructure3, WinterFlowRouterStructure2, winterFlowFunctionComponent.WinterFlowHookDataSource(), WinterFlowRouterStructure2 instanceof WinterFlowModuleDataSource ? ((WinterFlowModuleDataSource) WinterFlowRouterStructure2).WinterFlowVariableVersionControl() : WinterFlowCompilerEngine.WinterFlowHookDataSource, winterFlowResolverLibrary);
            WinterFlowNodeSerializer winterFlowNodeSerializer = new WinterFlowNodeSerializer();
            winterFlowNodeSerializer.WinterFlowVariableVersionControl = new WeakReference(winterFlowRefactoringServer);
            winterFlowSerializerQuery.WinterFlowArrayNetwork = winterFlowNodeSerializer;
            winterFlowRefactoringServer.WinterFlowHookDataSource(winterFlowSerializerQuery.WinterFlowCacheManagerAgent, winterFlowEventTool, winterFlowResolverLibrary, ((i2 << 6) & 896) | (i2 & 112));
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowAPIVersionControl(i, 8, winterFlowRefactoringServer, winterFlowEventTool);
        }
    }

    public static final long WinterFlowTransactionManagerStrategy(long j) {
        long j2 = j << 32;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return j2;
    }

    public static void WinterFlowUIMiddleware(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float max = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + max;
            i2++;
            i6++;
        }
    }

    public static final void WinterFlowUnitTestResponse(WinterFlowObjectUI winterFlowObjectUI, WinterFlowSchedulerEngine winterFlowSchedulerEngine, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowResolverLibrary winterFlowResolverLibrary2;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration;
        Object obj;
        int i2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(826668973);
        int i3 = i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 4 : 2) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowSchedulerEngine) ? 32 : 16);
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowTransactionManagerStrategy);
            WinterFlowConcurrencyParser winterFlowConcurrencyParser = (WinterFlowConcurrencyParser) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowRouterRouter);
            WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = (WinterFlowCacheManagerConfiguration) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowServiceUtility);
            WinterFlowDatabaseSchemaLayer WinterFlowSoftwareProtocol = WinterFlowCloudStack.WinterFlowSoftwareProtocol(winterFlowResolverLibrary);
            WinterFlowThreadPoolGateway WinterFlowBackendCacheManager = WinterFlowDecoratorUI.WinterFlowBackendCacheManager(winterFlowEventTool, winterFlowResolverLibrary);
            Object[] objArr = new Object[0];
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem = WinterFlowResolverVersion.WinterFlowServerProtocol;
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            Object WinterFlowServiceUtility2 = WinterFlowWorkerVersionControl.WinterFlowServiceUtility(Arrays.copyOf(objArr, 0), WinterFlowTestingCloud.WinterFlowUnitTestResponse, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 3456, 0);
            WinterFlowResolverLibrary winterFlowResolverLibrary3 = winterFlowResolverLibrary;
            UUID uuid = (UUID) WinterFlowServiceUtility2;
            winterFlowSchedulerEngine.getClass();
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary3.WinterFlowVariableVersionControl(view) | winterFlowResolverLibrary3.WinterFlowVariableVersionControl(winterFlowConcurrencyParser) | winterFlowResolverLibrary3.WinterFlowCacheManagerAgent(2) | winterFlowResolverLibrary3.WinterFlowVariableVersionControl(null);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary3.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                winterFlowCacheManagerConfiguration = winterFlowCacheManagerConfiguration2;
                WinterFlowCompilerOrchestration winterFlowCompilerOrchestration = new WinterFlowCompilerOrchestration(winterFlowObjectUI, winterFlowSchedulerEngine, view, winterFlowCacheManagerConfiguration, winterFlowConcurrencyParser, uuid);
                WinterFlowEventTool winterFlowEventTool2 = new WinterFlowEventTool(-1338939603, true, new WinterFlowRendererQuery(r13, WinterFlowBackendCacheManager));
                WinterFlowSessionManagerModule winterFlowSessionManagerModule = winterFlowCompilerOrchestration.WinterFlowServerProtocol;
                winterFlowSessionManagerModule.setParentCompositionContext(WinterFlowSoftwareProtocol);
                winterFlowSessionManagerModule.WinterFlowBandwidthObject.setValue(winterFlowEventTool2);
                winterFlowSessionManagerModule.WinterFlowVariableBandwidth = true;
                winterFlowSessionManagerModule.WinterFlowVariableVersionControl();
                winterFlowResolverLibrary3.WinterFlowArrayFramework(winterFlowCompilerOrchestration);
                obj = winterFlowCompilerOrchestration;
            } else {
                obj = WinterFlowSyntaxSubsystem2;
                winterFlowCacheManagerConfiguration = winterFlowCacheManagerConfiguration2;
            }
            WinterFlowCompilerOrchestration winterFlowCompilerOrchestration2 = (WinterFlowCompilerOrchestration) obj;
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary3.WinterFlowUnitTestResponse(winterFlowCompilerOrchestration2);
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary3.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem3 == winterFlowThreadPoolProcess) {
                i2 = 0;
                WinterFlowSyntaxSubsystem3 = new WinterFlowSoftwareClass(winterFlowCompilerOrchestration2, i2);
                winterFlowResolverLibrary3.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            } else {
                i2 = 0;
            }
            WinterFlowSoftwareException.WinterFlowHookDataSource(winterFlowCompilerOrchestration2, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary3);
            int i4 = (winterFlowResolverLibrary3.WinterFlowUnitTestResponse(winterFlowCompilerOrchestration2) ? 1 : 0) | ((i3 & 14) == 4 ? 1 : i2) | ((i3 & 112) != 32 ? i2 : 1) | (winterFlowResolverLibrary3.WinterFlowCacheManagerAgent(winterFlowCacheManagerConfiguration.ordinal()) ? 1 : 0);
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary3.WinterFlowSyntaxSubsystem();
            if (i4 != 0 || WinterFlowSyntaxSubsystem4 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem4 = new WinterFlowEventEmitterMechanism(winterFlowCompilerOrchestration2, winterFlowObjectUI, winterFlowSchedulerEngine, winterFlowCacheManagerConfiguration);
                winterFlowResolverLibrary3.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            WinterFlowSoftwareException.WinterFlowTransactionAgent((WinterFlowObjectUI) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary3);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary3;
        } else {
            WinterFlowResolverLibrary winterFlowResolverLibrary4 = winterFlowResolverLibrary;
            winterFlowResolverLibrary4.WinterFlowQueueService();
            winterFlowResolverLibrary2 = winterFlowResolverLibrary4;
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowFrontend(winterFlowObjectUI, winterFlowSchedulerEngine, winterFlowEventTool, i, 0);
        }
    }

    public static boolean WinterFlowUserManagerUserManager(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    public static String WinterFlowValidatorHandler(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static final WinterFlowMapperManager WinterFlowVariableBandwidth(WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowHandlerNode(winterFlowObjectSession));
    }

    public static final long WinterFlowVariableVersionControl(int i, int i2, int i3) {
        return WinterFlowArrayNetwork(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
