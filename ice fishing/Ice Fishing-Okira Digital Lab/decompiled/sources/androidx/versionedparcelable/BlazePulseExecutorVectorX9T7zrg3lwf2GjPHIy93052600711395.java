package androidx.versionedparcelable;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.window.BackEvent;
import com.adjust.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395 {
    public static final ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
    public static final YellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
    public static final ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
    public static final EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828(-1.0f);
    public static final EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828(1.0f);
    public static final float[][] ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = {95.047f, 100.0f, 108.883f};
    public static final float[][] YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final JadeCircuitWorkerExecutorBnPdEHWrSK2UEMdmg550203378938372 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = new JadeCircuitWorkerExecutorBnPdEHWrSK2UEMdmg550203378938372(7);
    public static final double[][] BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final long[] CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = new long[0];
    public static final LunarNodeShimDispatcherAfPrLPxzRErMKZBD3x98982314431846 PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036 = new LunarNodeShimDispatcherAfPrLPxzRErMKZBD3x98982314431846(19);
    public static final LunarNodeShimDispatcherAfPrLPxzRErMKZBD3x98982314431846 CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = new LunarNodeShimDispatcherAfPrLPxzRErMKZBD3x98982314431846(20);
    public static final LunarNodeShimDispatcherAfPrLPxzRErMKZBD3x98982314431846 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = new LunarNodeShimDispatcherAfPrLPxzRErMKZBD3x98982314431846(21);

    static {
        int i = 1;
        ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = new ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528("NO_OWNER", i);
        ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = new YellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760(i);
        EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = new ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528("NO_THREAD_ELEMENTS", i);
    }

    public static final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(HeliosRuntimeCryptographyLoaderB1skravnFci6JMX0zC56392833141379 heliosRuntimeCryptographyLoaderB1skravnFci6JMX0zC56392833141379, String str, CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, UltraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921 ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i) {
        DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 = YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(heliosRuntimeCryptographyLoaderB1skravnFci6JMX0zC56392833141379);
        Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
        if (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 || HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 == FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            WhiteFieldLibraryProcessorF9mZA5Uga2IMqlTxHR64797290157030 whiteFieldLibraryProcessorF9mZA5Uga2IMqlTxHR64797290157030 = new WhiteFieldLibraryProcessorF9mZA5Uga2IMqlTxHR64797290157030(heliosRuntimeCryptographyLoaderB1skravnFci6JMX0zC56392833141379, (heliosRuntimeCryptographyLoaderB1skravnFci6JMX0zC56392833141379.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getHeight() & 4294967295L) | (heliosRuntimeCryptographyLoaderB1skravnFci6JMX0zC56392833141379.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getWidth() << 32));
            whiteFieldLibraryProcessorF9mZA5Uga2IMqlTxHR64797290157030.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = 1;
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(whiteFieldLibraryProcessorF9mZA5Uga2IMqlTxHR64797290157030);
            HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = whiteFieldLibraryProcessorF9mZA5Uga2IMqlTxHR64797290157030;
        }
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365((WhiteFieldLibraryProcessorF9mZA5Uga2IMqlTxHR64797290157030) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382, str, cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946, ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921, 1.0f, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(final ZenithPathSessionArrayIuoZ9pgYlaWjOpViv584045353087867 zenithPathSessionArrayIuoZ9pgYlaWjOpViv584045353087867, final String str, final CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, AxiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776 axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776, UltraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921 ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921, float f, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, final int i, final int i2) {
        int i3;
        final AxiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776 axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347762;
        int i4;
        UltraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921 ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989212;
        int i5;
        float f2;
        final UltraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921 ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989213;
        final float f3;
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712;
        UltraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921 ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989214;
        float f4;
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(zenithPathSessionArrayIuoZ9pgYlaWjOpViv584045353087867) : zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(zenithPathSessionArrayIuoZ9pgYlaWjOpViv584045353087867) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347762 = axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776;
            i3 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347762) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989212 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921;
                i3 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989212) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(f2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(null) ? 1048576 : 524288;
                    }
                    if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i3 & 1, (599187 & i3) == 599186)) {
                        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
                        ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989213 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989212;
                        f3 = f2;
                    } else {
                        AxiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776 axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347763 = i6 != 0 ? YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 : axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347762;
                        UltraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921 ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989215 = i4 != 0 ? YellowLoopSessionVectorJTn1fpA0XiptHj6Hjn52504668913037.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 : ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989212;
                        if (i5 != 0) {
                            ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989214 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989215;
                            f4 = 1.0f;
                        } else {
                            ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989214 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989215;
                            f4 = f2;
                        }
                        CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982 = RapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                        LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 = FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                        if (str != null) {
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(1899222916);
                            boolean z = (i3 & 112) == 32;
                            Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
                            if (z || HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893) {
                                HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(10, str);
                                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382);
                            }
                            cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982 = LunarNodeEngineTokenLtM2K9OWMidyDsHnJo59812140789731.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982, false, (DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382);
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
                        } else {
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(1899381698);
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
                        }
                        UltraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921 ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989216 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989214;
                        CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982)), zenithPathSessionArrayIuoZ9pgYlaWjOpViv584045353087867, axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347763, ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989216, f4, null, 2);
                        Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
                        if (HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893) {
                            HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = XenoGridSingletonConnectorVJaEOQ3zqEyc35eAnP62847712933536.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822);
                        }
                        GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 goldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 = (GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822;
                        int hashCode = Long.hashCode(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381);
                        CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367);
                        EmeraldStackPacketBufferK3IXt6rgzKL50TDZ3n82540320567786 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                        BlazePulseHeuristicReflectionAjE3uSLXRdITwAE2k393161190765519.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getClass();
                        YellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079();
                        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685) {
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783);
                        } else {
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameRouterExceptionQjAvXXEXJ8u2ZI6OgX41663540814107();
                        }
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, goldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, Integer.valueOf(hashCode), NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(true);
                        ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989213 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989216;
                        f3 = f4;
                        axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347762 = axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347763;
                    }
                    SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
                    if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 == null) {
                        SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new BlazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257() { // from class: androidx.versionedparcelable.KryptonFlowManagerDispatcherEMI52AfdX0UlgOvNnP71075000810397
                            @Override // androidx.versionedparcelable.BlazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257
                            public final Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ZenithPathSessionArrayIuoZ9pgYlaWjOpViv584045353087867.this, str, cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347762, ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989213, f3, (ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156) obj, XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(i | 1), i2);
                                return AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                            }
                        };
                        return;
                    }
                    return;
                }
                f2 = f;
                if ((i2 & 64) == 0) {
                }
                if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i3 & 1, (599187 & i3) == 599186)) {
                }
                SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
                if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 == null) {
                }
            }
            ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989212 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i2 & 64) == 0) {
            }
            if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i3 & 1, (599187 & i3) == 599186)) {
            }
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
            if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 == null) {
            }
        }
        axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku207350286347762 = axiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg968761329989212 = ultraBufferOverridingDecryptionVA7r3hM7L3fGvCAPKg96876132998921;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i2 & 64) == 0) {
        }
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i3 & 1, (599187 & i3) == 599186)) {
        }
        SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 == null) {
        }
    }

    public static boolean AxiomCoreFunctionSchedulerPDQvcBbHwsy0ZBVyOb90216604270646(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    public static float BlazePulsePolymorphismOverloadingK3oHWwcZeom5cYPPbU90259265379402() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654 zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i) {
        int i2;
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(771959668);
        if ((i & 6) == 0) {
            i2 = (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i2 & 1, (i2 & 147) != 146)) {
            Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
            LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 = FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893) {
                CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488 crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488 = new CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488(null, LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488);
                HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488;
            }
            XenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411 xenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411 = (XenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382;
            Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
            if (HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893) {
                HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = new DragonRouteBufferGenericW6d6sWuzw2kUYQQtml78617397449123(xenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411, i3);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822);
            }
            ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(BlazePulseEventLoopBinaryTreeBRfhwl7zZ6WmXN8p0550752454721395.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160((IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, 0)), DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.ZenithPathClosureStorageLMdP6kbfH2eiEM3KeE77240003825952(-291176396, new IronMatrixControllerChannelKCTBsvlfQdPoRY62P038133846581668(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, xenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, i3), zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156), zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, 56);
        } else {
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
        }
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 != null) {
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new WhiteFieldArrayCallbackHTrUn6R8JIzQ26npQg23989565070186(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, i, i4);
        }
    }

    public static int CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new DeltaSignalDependencyWildcardC2wv4E3XPGZG6l85P937361727417808(context).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.areNotificationsEnabled() ? 0 : -1;
        }
        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050("permission must be non-null");
        return 0;
    }

    public static boolean CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final TitanCloudMutexSerializationHEXi9EtxYsLJjkihSj52280551923625 CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(Context context) {
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_0);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_10);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 98.0f);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 96.0f);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_50);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 94.0f);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 92.0f);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_100);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 87.0f);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_200);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_300);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_400);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_500);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_700);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 24.0f);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 22.0f);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_800);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 17.0f);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 12.0f);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_900);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 6.0f);
        IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_600), 4.0f);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral1_1000);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_0);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_10);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 98.0f);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756852 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 96.0f);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_50);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756853 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 94.0f);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756854 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 92.0f);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315033 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_100);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756855 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 87.0f);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315034 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_200);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_300);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315035 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_400);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315036 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_500);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315037 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_700);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756856 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 24.0f);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756857 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 22.0f);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315038 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_800);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756858 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 17.0f);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756859 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 12.0f);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315039 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_900);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww4288011107568510 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 6.0f);
        long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww4288011107568511 = IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_600), 4.0f);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150310 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_neutral2_1000);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150311 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_0);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_10);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_50);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150312 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_100);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150313 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_200);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_300);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_400);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_500);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150314 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_600);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150315 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_700);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150316 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_800);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150317 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_900);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent1_1000);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150318 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_0);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_10);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_50);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150319 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_100);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150320 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_200);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_300);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_400);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_500);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150321 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_600);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150322 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_700);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150323 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_800);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150324 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_900);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent2_1000);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150325 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_0);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_10);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_50);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150326 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_100);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150327 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_200);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_300);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_400);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_500);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150328 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_600);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150329 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_700);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150330 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_800);
        long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150331 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_900);
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(context, R.color.system_accent3_1000);
        return new TitanCloudMutexSerializationHEXi9EtxYsLJjkihSj52280551923625(UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756852, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756853, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756854, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315033, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756855, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315034, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315035, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315036, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315037, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756856, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756857, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315038, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756858, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww428801110756859, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315039, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww4288011107568510, IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww4288011107568511, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150310, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150311, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150312, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150313, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150314, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150315, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150316, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150317, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150318, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150319, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150320, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150321, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150322, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150323, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150324, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150325, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150326, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150327, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150328, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150329, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150330, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P3246387623150331);
    }

    public static int CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070(String str, int i, int i2) {
        return (int) XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, Object obj) {
        if (obj == null) {
            obj = VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893);
        }
        if (obj == 0) {
            return EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
        }
        if (obj instanceof Integer) {
            return zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571, new BlueKernelDependencyComponentH5vK1WhWn3fH1franc69297989684646(((Number) obj).intValue(), zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893));
        }
        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
        return null;
    }

    public static final IronMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 DeltaSignalPrefixDelegateOKrpGQ6v30XWLJQ9fy84286487006325(PhotonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782 photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782) {
        IronMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 ironMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 = ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782).SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
        if (ironMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 != null) {
            return ironMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442;
        }
        throw MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333("This node does not have an owner.");
    }

    public static double DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PhotonFrameUnificationSerializationMS11J4HUb0IhT9acuF47546556839259 EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892) {
        if ((lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 & 2) != 0) {
            if (lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 instanceof PhotonFrameUnificationSerializationMS11J4HUb0IhT9acuF47546556839259) {
                return (PhotonFrameUnificationSerializationMS11J4HUb0IhT9acuF47546556839259) lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892;
            }
            if (lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 instanceof RapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073) {
                LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 = ((RapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073) lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892).RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598;
                while (lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 != 0) {
                    if (lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 instanceof PhotonFrameUnificationSerializationMS11J4HUb0IhT9acuF47546556839259) {
                        return (PhotonFrameUnificationSerializationMS11J4HUb0IhT9acuF47546556839259) lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922;
                    }
                    lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 = (!(lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 instanceof RapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073) || (lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 & 2) == 0) ? lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 : ((RapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073) lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922).RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079(Context context, Executor executor, HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105 heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105, boolean z) {
        boolean z2;
        ?? r7;
        EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[] emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr;
        EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[] emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2;
        EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[] emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        XenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591 xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591;
        String str;
        String str2;
        FileInputStream LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192;
        boolean z9;
        boolean z10;
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
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        context.getPackageName();
                        MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            context.getPackageName();
            byte[] bArr2 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            XenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591 xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912 = new XenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591(assets, executor, heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105, name, file2);
            byte[] bArr3 = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(4, null);
                    }
                    xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = true;
                    try {
                        try {
                            r7 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                            if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 != null) {
                            }
                            HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105 heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV608893752411052 = (HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                            emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                            byte[] bArr4 = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                            boolean z11 = r7;
                            z11 = r7;
                            if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 != null) {
                            }
                            bArr = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                        } catch (IOException e2) {
                            heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                            if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 != null) {
                            }
                            HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105 heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV6088937524110522 = (HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                            emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                            byte[] bArr42 = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                            boolean z112 = r7;
                            z112 = r7;
                            if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 != null) {
                            }
                            bArr = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                            } catch (IOException e3) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(7, e3);
                                try {
                                    r7.close();
                                } catch (IOException e4) {
                                    heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(7, e4);
                                }
                                emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr = null;
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr;
                                emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                                if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 != null) {
                                }
                                HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105 heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105222 = (HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                                emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                                byte[] bArr422 = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                boolean z1122 = r7;
                                z1122 = r7;
                                if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 != null) {
                                }
                                bArr = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                            } catch (IllegalStateException e5) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(8, e5);
                                r7.close();
                                emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr = null;
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr;
                                emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                                if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 != null) {
                                }
                                HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105 heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV608893752411052222 = (HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                                emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                                byte[] bArr4222 = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 != null) {
                                }
                                bArr = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914(r7, YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(r7, 4), (String) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(7, e6);
                            }
                            xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr;
                        }
                        emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                        if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e7) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(9, e7);
                                str = r7;
                            } catch (IOException e8) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(7, e8);
                                str = r7;
                            } catch (IllegalStateException e9) {
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(8, e9);
                                str = r7;
                            }
                            if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192 == null) {
                                try {
                                    if (!Arrays.equals(KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050, YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192, 4);
                                    xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192, ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160, bArr3, emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2);
                                    LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192.close();
                                    xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912;
                                    r7 = ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160;
                                    if (xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591 != null) {
                                        xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591;
                                    }
                                } finally {
                                }
                            } else {
                                if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192 != null) {
                                    LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192.close();
                                    str = str2;
                                }
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591 = null;
                                r7 = str;
                                if (xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg53212357135591 != null) {
                                }
                            }
                        }
                        HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105 heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV6088937524110522222 = (HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                        byte[] bArr42222 = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 != null && bArr42222 != null) {
                            z7 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                            if (z7) {
                                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV6088937524110522222.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(7, e10);
                                z8 = z7;
                            } catch (IllegalStateException e11) {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV6088937524110522222.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(8, e11);
                                z8 = z7;
                            }
                            if (KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070(byteArrayOutputStream, bArr42222, emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3)) {
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
                                z112222 = z8;
                            } else {
                                heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV6088937524110522222.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(5, null);
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                                    GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
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
                                                                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
                                                                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
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
                                        z112222 = true;
                                        xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e13) {
                                        e = e13;
                                        z112222 = true;
                                        xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                                } catch (IOException e15) {
                                    e = e15;
                                    xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
                                xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = null;
                            }
                        }
                        if (z4) {
                            WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(4, null);
                        }
                        xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = true;
                        r7 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                        if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw580884604751192 == null) {
                            }
                        }
                        HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105 heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105222222 = (HeliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 = (EmeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                        byte[] bArr422222 = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (emeraldStackSyntaxUnificationQNyuiyW65jWM91dFaw94176385152138Arr3 != null) {
                            z7 = xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                            if (z7) {
                            }
                        }
                        bArr = (byte[]) xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(4, null);
                    }
                }
                MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
            }
            xenoGridNamespaceModuleTCfCwv5MVQz7BzBSEg532123571355912.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e16) {
            heliosRuntimeInterpreterAttributeEZ5CQBJS27a0uWqOyV60889375241105.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(7, e16);
            MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, false);
        }
    }

    public static final float GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(GoldenVectorStaticCoroutineMnEFE2t8EnblbWjupa67599394275663 goldenVectorStaticCoroutineMnEFE2t8EnblbWjupa67599394275663) {
        if (goldenVectorStaticCoroutineMnEFE2t8EnblbWjupa67599394275663 != null) {
            return goldenVectorStaticCoroutineMnEFE2t8EnblbWjupa67599394275663.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        return 0.0f;
    }

    public static final void HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295(ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, Object obj) {
        if (obj == EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111) {
            return;
        }
        if (!(obj instanceof BlueKernelDependencyComponentH5vK1WhWn3fH1franc69297989684646)) {
            zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927, null).getClass();
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
            return;
        }
        ZenithPathAggregationInjectionMPPC7tRk6EuQhw4DHv14775198806196[] zenithPathAggregationInjectionMPPC7tRk6EuQhw4DHv14775198806196Arr = ((BlueKernelDependencyComponentH5vK1WhWn3fH1franc69297989684646) obj).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int length = zenithPathAggregationInjectionMPPC7tRk6EuQhw4DHv14775198806196Arr.length - 1;
        if (length < 0) {
            return;
        }
        ZenithPathAggregationInjectionMPPC7tRk6EuQhw4DHv14775198806196 zenithPathAggregationInjectionMPPC7tRk6EuQhw4DHv14775198806196 = zenithPathAggregationInjectionMPPC7tRk6EuQhw4DHv14775198806196Arr[length];
        throw null;
    }

    public static final void HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382(PhotonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782 photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782) {
        ObsidianEngineForeachBitfieldIpvVxlUZ8RXjxgs7VP43320307903128 obsidianEngineForeachBitfieldIpvVxlUZ8RXjxgs7VP43320307903128;
        PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870 ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606 = ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782);
        if (ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764) {
            return;
        }
        HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 = (HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921) VertexLinkReducerVirtualizationUULzRW2FUq0yEyJvNH72615390416318.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606);
        if (!HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339() || (obsidianEngineForeachBitfieldIpvVxlUZ8RXjxgs7VP43320307903128 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606) == null) {
            return;
        }
        obsidianEngineForeachBitfieldIpvVxlUZ8RXjxgs7VP43320307903128.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, new NovaLayerEncryptionFloatingPointRz2EDgOHBJ8YMHhCWb62732808436197(obsidianEngineForeachBitfieldIpvVxlUZ8RXjxgs7VP43320307903128, ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0201, code lost:
    
        if (r42 > 100.01d) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0205, code lost:
    
        if (r6 <= 100.01d) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0208, code lost:
    
        r0 = ((((androidx.versionedparcelable.KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(r40) & 255) << 16) | (-16777216)) | ((androidx.versionedparcelable.KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(r42) & 255) << 8)) | (androidx.versionedparcelable.KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(r6) & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fd, code lost:
    
        if (r40 > 100.01d) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(long j, float f) {
        int LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764;
        float f2;
        float f3;
        float f4;
        double[] dArr;
        double d;
        int i;
        int i2;
        int ceil;
        double floor;
        double d2;
        double[] dArr2;
        double d3 = f;
        if ((d3 < 1.0E-4d) || (d3 > 99.9999d)) {
            return FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(d3));
        }
        MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.YellowLoopEncoderRouterINqff2SYTbtqZyuhu243435970216181(j));
        float f5 = CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        float f6 = CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        MysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309 mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309 = MysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309, mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309)) {
            double d4 = f5;
            double d5 = f6;
            if (d5 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
                LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(d3);
            } else {
                double d6 = d4 % 360.0d;
                if (d6 < 0.0d) {
                    d6 += 360.0d;
                }
                double radians = Math.toRadians(d6);
                double pow = d3 > 8.0d ? Math.pow((d3 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d3 / 903.2962962962963d) * 100.0d;
                double sqrt = Math.sqrt(pow) * 11.0d;
                double pow2 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800), 0.73d);
                double cos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 * mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                double sin = Math.sin(radians);
                double cos2 = Math.cos(radians);
                int i3 = 0;
                while (true) {
                    dArr = NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                    if (i3 >= 5) {
                        d = pow;
                        i = 1;
                        i2 = 8;
                        break;
                    }
                    i2 = 8;
                    double d7 = sqrt / 100.0d;
                    double d8 = d5;
                    i = 1;
                    double pow3 = Math.pow(((d5 == 0.0d || sqrt == 0.0d) ? 0.0d : d5 / Math.sqrt(d7)) * pow2, 1.1111111111111112d);
                    d = pow;
                    double pow4 = (Math.pow(d7, (1.0d / mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) / mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) * mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) / mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                    double d9 = (((0.305d + pow4) * 23.0d) * pow3) / (((pow3 * 108.0d) * sin) + (((11.0d * pow3) * cos2) + (23.0d * cos)));
                    double d10 = d9 * cos2;
                    double d11 = d9 * sin;
                    double d12 = pow4 * 460.0d;
                    double d13 = ((288.0d * d11) + ((451.0d * d10) + d12)) / 1403.0d;
                    double d14 = ((d12 - (891.0d * d10)) - (261.0d * d11)) / 1403.0d;
                    double d15 = ((d12 - (d10 * 220.0d)) - (d11 * 6300.0d)) / 1403.0d;
                    double MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808 = MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(d13);
                    double MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288082 = MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(d14);
                    double MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288083 = MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(d15);
                    double[][] dArr3 = UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                    double[] dArr4 = dArr3[0];
                    double d16 = (dArr4[2] * MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288083) + (dArr4[1] * MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288082) + (dArr4[0] * MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808);
                    double[] dArr5 = dArr3[1];
                    double d17 = (dArr5[2] * MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288083) + (dArr5[1] * MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288082) + (dArr5[0] * MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808);
                    double[] dArr6 = dArr3[2];
                    double d18 = (MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288083 * dArr6[2]) + (MysticCacheManagerKeyValueImUQudc509DcNu7NkN694646333288082 * dArr6[1]) + (MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808 * dArr6[0]);
                    if (d16 < 0.0d || d17 < 0.0d || d18 < 0.0d) {
                        break;
                    }
                    double d19 = (dArr[2] * d18) + (dArr[1] * d17) + (dArr[0] * d16);
                    if (d19 <= 0.0d) {
                        break;
                    }
                    if (i3 == 4) {
                        break;
                    }
                    double d20 = d19 - d;
                    if (Math.abs(d20) < 0.002d) {
                        break;
                    }
                    sqrt -= (d20 * sqrt) / (2.0d * d19);
                    i3++;
                    d5 = d8;
                    pow = d;
                }
                LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = 0;
                if (LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 == 0) {
                    double[] dArr7 = new double[3];
                    double d21 = -1.0d;
                    dArr7[0] = -1.0d;
                    dArr7[i] = -1.0d;
                    dArr7[2] = -1.0d;
                    double[] dArr8 = dArr7;
                    double d22 = 0.0d;
                    double d23 = 0.0d;
                    int i4 = i;
                    boolean z = false;
                    int i5 = 0;
                    while (i5 < 12) {
                        double d24 = dArr[0];
                        double d25 = dArr[i];
                        double d26 = dArr[2];
                        double d27 = i5 % 4 <= i ? 0.0d : 100.0d;
                        double d28 = i5 % 2 == 0 ? 0.0d : 100.0d;
                        if (i5 < 4) {
                            double d29 = ((d - (d25 * d27)) - (d26 * d28)) / d24;
                            dArr2 = AxiomCoreFunctionSchedulerPDQvcBbHwsy0ZBVyOb90216604270646(d29) ? new double[]{d29, d27, d28} : new double[]{d21, d21, d21};
                            d2 = d21;
                        } else {
                            d2 = d21;
                            if (i5 < i2) {
                                double d30 = ((d - (d24 * d28)) - (d26 * d27)) / d25;
                                dArr2 = AxiomCoreFunctionSchedulerPDQvcBbHwsy0ZBVyOb90216604270646(d30) ? new double[]{d28, d30, d27} : new double[]{d2, d2, d2};
                            } else {
                                double d31 = ((d - (d24 * d27)) - (d25 * d28)) / d26;
                                dArr2 = AxiomCoreFunctionSchedulerPDQvcBbHwsy0ZBVyOb90216604270646(d31) ? new double[]{d27, d28, d31} : new double[]{d2, d2, d2};
                            }
                        }
                        if (dArr2[0] >= 0.0d) {
                            double UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(dArr2);
                            if (!z) {
                                dArr7 = dArr2;
                                dArr8 = dArr7;
                                d22 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503;
                                d23 = d22;
                                z = true;
                            } else if (i4 != 0 || CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(d22, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503, d23)) {
                                if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(d22, radians, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503)) {
                                    dArr8 = dArr2;
                                    i4 = 0;
                                    d23 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503;
                                } else {
                                    dArr7 = dArr2;
                                    i4 = 0;
                                    d22 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503;
                                }
                            }
                        }
                        i5++;
                        d21 = d2;
                        i = 1;
                        i2 = 8;
                    }
                    double[][] dArr9 = {dArr7, dArr8};
                    double[] dArr10 = dArr9[0];
                    double UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(dArr10);
                    double[] dArr11 = dArr9[1];
                    for (int i6 = 0; i6 < 3; i6++) {
                        double d32 = dArr10[i6];
                        double d33 = dArr11[i6];
                        if (d32 != d33) {
                            if (d32 < d33) {
                                ceil = (int) Math.floor(DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(d32) - 0.5d);
                                floor = Math.ceil(DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(dArr11[i6]) - 0.5d);
                            } else {
                                ceil = (int) Math.ceil(DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(d32) - 0.5d);
                                floor = Math.floor(DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(dArr11[i6]) - 0.5d);
                            }
                            int i7 = (int) floor;
                            double d34 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032;
                            for (int i8 = 0; i8 < 8 && Math.abs(i7 - ceil) > 1.0d; i8++) {
                                int floor2 = (int) Math.floor((ceil + i7) / 2.0d);
                                double d35 = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050[floor2];
                                double d36 = dArr10[i6];
                                double d37 = dArr11[i6];
                                if (d37 != d36) {
                                    d37 = (d35 - d36) / (d37 - d36);
                                }
                                double d38 = dArr10[0];
                                double d39 = ((dArr11[0] - d38) * d37) + d38;
                                double d40 = dArr10[1];
                                double d41 = ((dArr11[1] - d40) * d37) + d40;
                                double d42 = dArr10[2];
                                double[] dArr12 = {d39, d41, ((dArr11[2] - d42) * d37) + d42};
                                double UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315033 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(dArr12);
                                if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(d34, radians, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315033)) {
                                    i7 = floor2;
                                    dArr11 = dArr12;
                                } else {
                                    ceil = floor2;
                                    dArr10 = dArr12;
                                    d34 = UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315033;
                                }
                            }
                            UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032 = d34;
                        }
                    }
                    LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = ((KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050((dArr10[0] + dArr11[0]) / 2.0d) & 255) << 16) | (-16777216) | ((KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050((dArr10[1] + dArr11[1]) / 2.0d) & 255) << 8) | (KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050((dArr10[2] + dArr11[2]) / 2.0d) & 255);
                }
            }
        } else if (f6 < 1.0d || Math.round(f) <= 0.0d || Math.round(f) >= 100.0d) {
            LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(f);
        } else {
            float f7 = 0.0f;
            float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
            float f8 = 0.0f;
            float f9 = f6;
            MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 = null;
            boolean z2 = true;
            while (true) {
                if (Math.abs(f8 - f6) >= 0.4000000059604645d) {
                    float f10 = 1000.0f;
                    float f11 = f7;
                    float f12 = f11;
                    float f13 = 1000.0f;
                    float f14 = 100.0f;
                    MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252092 = null;
                    while (true) {
                        f2 = f6;
                        if (Math.abs(f12 - f14) <= 0.009999999776482582d) {
                            f3 = 2.0f;
                            break;
                        }
                        float f15 = ((f14 - f12) / 2.0f) + f12;
                        int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(f15, f9, min).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(MysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050);
                        float KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 >> 16) & 255);
                        f3 = 2.0f;
                        float KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 >> 8) & 255);
                        float KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 & 255);
                        double d43 = KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216;
                        double[] dArr13 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119[1];
                        float f16 = ((float) ((KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163 * dArr13[2]) + ((KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162 * dArr13[1]) + (d43 * dArr13[0])))) / 100.0f;
                        float cbrt = f16 <= 0.008856452f ? f16 * 903.2963f : (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
                        float abs = (float) Math.abs(f - cbrt);
                        if (abs < 0.2f) {
                            MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW563442022909832 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952);
                            MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa396211764697642 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW563442022909832.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW563442022909832.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, min);
                            float f17 = CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW563442022909832.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 - LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa396211764697642.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                            f4 = cbrt;
                            float f18 = CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW563442022909832.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 - LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa396211764697642.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                            float f19 = CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW563442022909832.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 - LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa396211764697642.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                            float pow5 = (float) (Math.pow(Math.sqrt((f19 * f19) + (f18 * f18) + (f17 * f17)), 0.63d) * 1.41d);
                            if (pow5 <= 1.0f) {
                                f13 = pow5;
                                mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252092 = CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW563442022909832;
                                f10 = abs;
                            }
                        } else {
                            f4 = cbrt;
                        }
                        if (f10 == f11 && f13 == f11) {
                            break;
                        }
                        if (f4 < f) {
                            f6 = f2;
                            f12 = f15;
                        } else {
                            f6 = f2;
                            f14 = f15;
                        }
                    }
                    MysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252092;
                    if (!z2) {
                        if (mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093 == null) {
                            f6 = f9;
                        } else {
                            mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093;
                            f8 = f9;
                            f6 = f2;
                        }
                        f9 = ((f6 - f8) / f3) + f8;
                        f7 = f11;
                    } else {
                        if (mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093 != null) {
                            LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea406087299252093.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309);
                            break;
                        }
                        f9 = ((f2 - f8) / f3) + f8;
                        f7 = f11;
                        f6 = f2;
                        z2 = false;
                    }
                } else {
                    LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209 == null ? KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(f) : mysticCacheAnnotationProviderZejRcGKUeW3DRp8zea40608729925209.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(mysticCacheBuilderJITW9OT8CFxPXl340TbjJ76630612987309);
                }
            }
        }
        return FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
    }

    public static int IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        return BlazePulseCacheProtocolAsa44HNyzdtmg887bZ22402145660245.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static final int JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final GoldenVectorStaticCoroutineMnEFE2t8EnblbWjupa67599394275663 KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(FrostBridgeEventLoopNormalizationBXDoMBYCKdU0Kz3vHD50860974827777 frostBridgeEventLoopNormalizationBXDoMBYCKdU0Kz3vHD50860974827777) {
        Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = frostBridgeEventLoopNormalizationBXDoMBYCKdU0Kz3vHD50860974827777.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050();
        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 instanceof GoldenVectorStaticCoroutineMnEFE2t8EnblbWjupa67599394275663) {
            return (GoldenVectorStaticCoroutineMnEFE2t8EnblbWjupa67599394275663) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(ArcticByteWildcardObserverSXUCLAJMh1xOEKk9iT68639405706054 arcticByteWildcardObserverSXUCLAJMh1xOEKk9iT68639405706054) {
        arcticByteWildcardObserverSXUCLAJMh1xOEKk9iT68639405706054.getClass();
        Class ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = arcticByteWildcardObserverSXUCLAJMh1xOEKk9iT68639405706054.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.isPrimitive()) {
            String name = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002;
    }

    public static final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654 zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i) {
        int i2;
        final CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982;
        final ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654 zenithPathOperatorProcessorWqZVGhPZVMaza26LFS879644870126542;
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654) ? 32 : 16;
        }
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i2 & 1, (i2 & 19) != 18)) {
            Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
            LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 = FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893) {
                CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488 crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488 = new CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488(null, LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488);
                HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488;
            }
            final XenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411 xenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411 = (XenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382;
            Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
            int i4 = 6;
            if (HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893) {
                HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = new DragonRouteBufferGenericW6d6sWuzw2kUYQQtml78617397449123(xenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411, i4);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822);
            }
            final IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990 ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990 = (IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822;
            DeltaSignalPrimitiveInterpreterCBOhkqdjiSHdXlIDSd85186061283086 deltaSignalPrimitiveInterpreterCBOhkqdjiSHdXlIDSd85186061283086 = VertexLinkFrameworkConcurrencyXXGvWYPxucaZE5DFAN43346173167648.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            final CrimsonRouteHeuristicAPICO62UxAUAVU8NzJtNv40484773103659 ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, 6);
            cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982 = cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998;
            zenithPathOperatorProcessorWqZVGhPZVMaza26LFS879644870126542 = zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654;
            ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(new RapidLogicRequestMapperKDaWu2PErrhpVedlsA15119592481410[]{BlazePulseEventLoopBinaryTreeBRfhwl7zZ6WmXN8p0550752454721395.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, 2)), BlazePulseEventLoopBinaryTreeBRfhwl7zZ6WmXN8p0550752454721395.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502)}, DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.ZenithPathClosureStorageLMdP6kbfH2eiEM3KeE77240003825952(1070596993, new BlazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257() { // from class: androidx.versionedparcelable.YellowLoopTransportUnificationCP0W1bqWGO8cDvRgAM10308484720505
                @Override // androidx.versionedparcelable.BlazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257
                public final Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(Object obj, Object obj2) {
                    ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562 = (ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(intValue & 1, (intValue & 3) != 2)) {
                        Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
                        if (HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823 == FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                            HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823 = new EmeraldStackProtocolParserHLz5RMrIY0UgUXXes625138019065608(xenoGridDecoderRuntimeEwqgG3UCJtSjVFNSje18123228536411, 3);
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823);
                        }
                        CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900 = AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998.this, (DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823);
                        GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 = BlueKernelSessionObjectQswGaxvYDCkmVBjDQ258860156888305.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, true);
                        int hashCode = Long.hashCode(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381);
                        EmeraldStackPacketBufferK3IXt6rgzKL50TDZ3n82540320567786 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                        CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900);
                        BlazePulseHeuristicReflectionAjE3uSLXRdITwAE2k393161190765519.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getClass();
                        YellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079();
                        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685) {
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783);
                        } else {
                            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameRouterExceptionQjAvXXEXJ8u2ZI6OgX41663540814107();
                        }
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, Integer.valueOf(hashCode), NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
                        ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252);
                        zenithPathOperatorProcessorWqZVGhPZVMaza26LFS879644870126542.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, 0);
                        ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, 6);
                        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(true);
                    } else {
                        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
                    }
                    return AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                }
            }, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156), zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, 56);
        } else {
            cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982 = cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998;
            zenithPathOperatorProcessorWqZVGhPZVMaza26LFS879644870126542 = zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654;
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
        }
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 != null) {
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new WhiteFieldArrayCallbackHTrUn6R8JIzQ26npQg23989565070186(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO102833899629982, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS879644870126542, i, i3);
        }
    }

    public static final Class LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(ArcticByteWildcardObserverSXUCLAJMh1xOEKk9iT68639405706054 arcticByteWildcardObserverSXUCLAJMh1xOEKk9iT68639405706054) {
        Class ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = arcticByteWildcardObserverSXUCLAJMh1xOEKk9iT68639405706054.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.getClass();
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002;
    }

    public static double MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(double d) {
        double abs = Math.abs(d);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d < 0.0d ? -1 : d == 0.0d ? 0 : 1);
    }

    public static final SolarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854(PhotonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782 photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782, int i) {
        SolarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 = ((LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892) photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598.getClass();
        if (solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598.RapidLogicParserDataframeAmKWgp3J9yypIyotf526578755236768() != photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782 || !RapidLogicBuilderShimXu4TolRwx5g9xB4nKm12254997409286.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i)) {
            return solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598;
        }
        SolarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE8898641835965982 = solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598;
        solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE8898641835965982.getClass();
        return solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE8898641835965982;
    }

    public static final RapidLogicResolverKeyValueRRXSVl5MG0xVj2bAcD23258254181846 MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(GoldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200 goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200, int i) {
        IronMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638 ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638 = goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        AxiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177 axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177 = goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.length() != 0) {
            int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 = axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i);
            if ((i != 0 && RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 == axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i - 1)) || (i != ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.length() && RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 == axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i + 1))) {
                return goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i);
            }
        }
        return goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i);
    }

    public static final void NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310 goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310, LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892) {
        GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310 KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216 = ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892).KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216();
        int i = KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 - 1;
        Object[] objArr = KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (i < objArr.length) {
            while (i >= 0) {
                goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(((PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870) objArr[i]).ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                i--;
            }
        }
    }

    public static float NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(QuantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413, ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654 zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i) {
        int i2;
        CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070;
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(1533506138);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654) ? 32 : 16;
        }
        int i4 = 0;
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i2 & 1, (i2 & 19) != 18)) {
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(-885604480);
            if (quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050()) {
                BlueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063 blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063 = null;
                CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070(ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.DeltaSignalPrefixDelegateOKrpGQ6v30XWLJQ9fy84286487006325(new ObsidianEngineMutexEncoderWiY7X2yaoczMXvYa3j98295561194743(quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413, blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, i4)), quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764, new MysticCacheLoaderContextNvpDHBpEqGPGzOi3o094094045972338(quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413, null), new QuantumStreamDataframePostfixPAGSpXg9qm3Rg1m9PK80069975598245(quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413, blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, i4), new YellowLoopStaticLibraryZ77KjfQmSBlTKfx9rS11444824511866(quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413, i3));
            } else {
                CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070 = RapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            }
            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, i2 & 112);
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
        } else {
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
        }
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 != null) {
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new NovaLayerMiddlewareAPIZi6peFm04XdcfNIQbn65819457896002(quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, i, i4);
        }
    }

    public static final boolean ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, float f) {
        return f == 1.0f ? cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 : AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, f, null, 520187);
    }

    public static final int PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(PhotonFrameObserverEncoderYu0qPD0Qr0WGzkQp5g11636508510086 photonFrameObserverEncoderYu0qPD0Qr0WGzkQp5g11636508510086, long j, float f, float f2) {
        float f3 = f / 2.0f;
        float intBitsToFloat = (Float.intBitsToFloat((int) (photonFrameObserverEncoderYu0qPD0Qr0WGzkQp5g11636508510086.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() >> 32)) - f3) - f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (photonFrameObserverEncoderYu0qPD0Qr0WGzkQp5g11636508510086.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() & 4294967295L)) / 2.0f;
        PhotonFrameObserverEncoderYu0qPD0Qr0WGzkQp5g11636508510086.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(photonFrameObserverEncoderYu0qPD0Qr0WGzkQp5g11636508510086, j, f3, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 120);
    }

    public static final MysticCacheInheritanceKeyValueKwZsB4CAlpWeMCx9em84166224853553 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new MysticCacheInheritanceKeyValueKwZsB4CAlpWeMCx9em84166224853553(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final TitanCloudPipelineJITY0kjiZCu6mmkZ959fh55053760496057 RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(Context context) {
        VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516 vertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516 = new VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516(16);
        context.getApplicationContext();
        return new TitanCloudPipelineJITY0kjiZCu6mmkZ959fh55053760496057(vertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516, new QuantumStreamBufferFloatingPointBxoZRLRhQ9COa5TRXl74789021517585(Build.VERSION.SDK_INT >= 31 ? BlueKernelControllerEncryptionAMQohJEYQmbbSlykXJ40552514904705.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context) : 0));
    }

    public static double SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(double d) {
        double pow = Math.pow(Math.abs(d), 0.42d);
        return (((d < 0.0d ? -1 : d == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static final void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654 zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i) {
        int i2;
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(2064964257);
        if ((i & 6) == 0) {
            i2 = (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654) ? 32 : 16;
        }
        int i3 = 0;
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i2 & 1, (i2 & 19) != 18)) {
            BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
        }
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 != null) {
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new WhiteFieldArrayCallbackHTrUn6R8JIzQ26npQg23989565070186(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, i, i3);
        }
    }

    public static final float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final void UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(CosmicForgeSchedulerTemplatingPJGMyAkpddJuVnTRXW84137884077898 cosmicForgeSchedulerTemplatingPJGMyAkpddJuVnTRXW84137884077898, Object obj, int i, Object obj2, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i2) {
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(1439843069);
        int i3 = (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(cosmicForgeSchedulerTemplatingPJGMyAkpddJuVnTRXW84137884077898) ? 4 : 2) | i2 | (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(obj) ? 32 : 16) | (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i) ? 256 : 128) | (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(obj2) ? 2048 : 1024);
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i3 & 1, (i3 & 1171) != 1170)) {
            ((LunarNodeResponseContainerJDrIugl0eZxJKJfJr880117332502950) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(obj2, DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.ZenithPathClosureStorageLMdP6kbfH2eiEM3KeE77240003825952(980966366, new UltraBufferDecoderContextWEuuwFBxdum6fNtScc62906767618064(i, cosmicForgeSchedulerTemplatingPJGMyAkpddJuVnTRXW84137884077898, obj2), zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156), zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, 48);
        } else {
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
        }
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 != null) {
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new ZenithPathFloatingPointProcessorSg62bnKXUl8NmpD1UW46794772566521(cosmicForgeSchedulerTemplatingPJGMyAkpddJuVnTRXW84137884077898, obj, i, obj2, i2);
        }
    }

    public static double UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(double[] dArr) {
        double d = dArr[0];
        double[][] dArr2 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
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
        double SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(d6);
        double SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545713 = SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(d7);
        double SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545714 = SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(d8);
        return Math.atan2(((SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 + SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545713) - (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545714 * 2.0d)) / 9.0d, ((((-12.0d) * SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545713) + (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 * 11.0d)) + SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545714) / 11.0d);
    }

    public static final Object VertexLinkConcurrencyStaticXTUmw59Mhm3MI1tqli38584037615936(ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, Object obj, Object obj2, BlazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257 blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257, BlueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063 blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063) {
        Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702;
        Object DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150 = DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, obj2);
        try {
            TitanCloudEncoderAbstractionSxrLIu5tY8ZGoCnfiV70071187652248 titanCloudEncoderAbstractionSxrLIu5tY8ZGoCnfiV70071187652248 = new TitanCloudEncoderAbstractionSxrLIu5tY8ZGoCnfiV70071187652248(blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893);
            if (blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257 == null) {
                YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070(blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257, obj, titanCloudEncoderAbstractionSxrLIu5tY8ZGoCnfiV70071187652248);
            } else {
                ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(2, blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257);
                YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 = blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(obj, titanCloudEncoderAbstractionSxrLIu5tY8ZGoCnfiV70071187652248);
            }
            HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150);
            if (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 == BlazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063.getClass();
            }
            return YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702;
        } catch (Throwable th) {
            HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150);
            throw th;
        }
    }

    public static final Object VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893) {
        Object NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB112715903974802 = zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036, 0);
        NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB112715903974802.getClass();
        return NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB112715903974802;
    }

    public static void WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(PackageInfo packageInfo, File file) {
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

    public static String WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static final long XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381(String str, long j, long j2, long j3) {
        String str2;
        boolean z;
        int i = DragonRouteBinaryTreeImmutableF9WsPiiQDbeZltaVBH84699756059613.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        Long l = null;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        int i2 = 10;
        RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i3 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (true) {
                if (i3 < length) {
                    int digit = Character.digit((int) str2.charAt(i3), i2);
                    if (digit < 0) {
                        break;
                    }
                    if (j5 < j6) {
                        if (j6 != -256204778801521550L) {
                            break;
                        }
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    int i4 = length;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        break;
                    }
                    j5 = j7 - j8;
                    i3++;
                    length = i4;
                    i2 = 10;
                } else {
                    l = z ? Long.valueOf(j5) : Long.valueOf(-j5);
                }
            }
        }
        if (l == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = l.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static void XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(String str, String str2, Object obj) {
        if (Log.isLoggable(WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ObsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923 YellowLoopEncoderRouterINqff2SYTbtqZyuhu243435970216181(ObsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923 obsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923, HeliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422 heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422) {
        long j;
        EmeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606 emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606;
        int i;
        int i2;
        JadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909 jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909;
        DragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949 dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949 = obsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        ArcticByteShimDecoderYnULpEzTgrTAQRFwC615064126080498 arcticByteShimDecoderYnULpEzTgrTAQRFwC615064126080498 = IronMatrixResponseInheritanceHpxEqoa8PzUvjHZn4u32769523225401.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ArcticByteShimDecoderYnULpEzTgrTAQRFwC615064126080498 arcticByteShimDecoderYnULpEzTgrTAQRFwC6150641260804982 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (arcticByteShimDecoderYnULpEzTgrTAQRFwC6150641260804982.equals(VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541)) {
            arcticByteShimDecoderYnULpEzTgrTAQRFwC6150641260804982 = IronMatrixResponseInheritanceHpxEqoa8PzUvjHZn4u32769523225401.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        }
        ArcticByteShimDecoderYnULpEzTgrTAQRFwC615064126080498 arcticByteShimDecoderYnULpEzTgrTAQRFwC6150641260804983 = arcticByteShimDecoderYnULpEzTgrTAQRFwC6150641260804982;
        long j2 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        SolarMeshSubroutineResourceBy795KSVGDrMyGH7Kp26734912154158[] solarMeshSubroutineResourceBy795KSVGDrMyGH7Kp26734912154158Arr = AxiomCoreEventLoopDecoderJO07fHUiEl2oCaaNHW52519979864772.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if ((j2 & 1095216660480L) == 0) {
            j2 = IronMatrixResponseInheritanceHpxEqoa8PzUvjHZn4u32769523225401.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        long j3 = j2;
        ZenithPathPayloadContextZzTkjLMOSyD5xYX6cC91508866797168 zenithPathPayloadContextZzTkjLMOSyD5xYX6cC91508866797168 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (zenithPathPayloadContextZzTkjLMOSyD5xYX6cC91508866797168 == null) {
            zenithPathPayloadContextZzTkjLMOSyD5xYX6cC91508866797168 = ZenithPathPayloadContextZzTkjLMOSyD5xYX6cC91508866797168.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        }
        ZenithPathPayloadContextZzTkjLMOSyD5xYX6cC91508866797168 zenithPathPayloadContextZzTkjLMOSyD5xYX6cC915088667971682 = zenithPathPayloadContextZzTkjLMOSyD5xYX6cC91508866797168;
        BlazePulseClosureKeyValueCC8SnvILJfmlRxuGzA54794674106503 blazePulseClosureKeyValueCC8SnvILJfmlRxuGzA54794674106503 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        BlazePulseClosureKeyValueCC8SnvILJfmlRxuGzA54794674106503 blazePulseClosureKeyValueCC8SnvILJfmlRxuGzA547946741065032 = new BlazePulseClosureKeyValueCC8SnvILJfmlRxuGzA54794674106503(blazePulseClosureKeyValueCC8SnvILJfmlRxuGzA54794674106503 != null ? blazePulseClosureKeyValueCC8SnvILJfmlRxuGzA54794674106503.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 : 0);
        KryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU94989169449517 kryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU94989169449517 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        KryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU94989169449517 kryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU949891694495172 = new KryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU94989169449517(kryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU94989169449517 != null ? kryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU94989169449517.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 : 65535);
        VertexLinkResolverContextQq9FLX81OXHnUzzWZJ56859481302022 vertexLinkResolverContextQq9FLX81OXHnUzzWZJ56859481302022 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (vertexLinkResolverContextQq9FLX81OXHnUzzWZJ56859481302022 == null) {
            vertexLinkResolverContextQq9FLX81OXHnUzzWZJ56859481302022 = VertexLinkResolverContextQq9FLX81OXHnUzzWZJ56859481302022.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        VertexLinkResolverContextQq9FLX81OXHnUzzWZJ56859481302022 vertexLinkResolverContextQq9FLX81OXHnUzzWZJ568594813020222 = vertexLinkResolverContextQq9FLX81OXHnUzzWZJ56859481302022;
        String str = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if ((j4 & 1095216660480L) == 0) {
            j4 = IronMatrixResponseInheritanceHpxEqoa8PzUvjHZn4u32769523225401.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        }
        long j5 = j4;
        DeltaSignalGatewayWildcardVfG7hvFc0eEN93Kv7911243939404528 deltaSignalGatewayWildcardVfG7hvFc0eEN93Kv7911243939404528 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
        float f = deltaSignalGatewayWildcardVfG7hvFc0eEN93Kv7911243939404528 != null ? deltaSignalGatewayWildcardVfG7hvFc0eEN93Kv7911243939404528.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 : 0.0f;
        DeltaSignalGatewayWildcardVfG7hvFc0eEN93Kv7911243939404528 deltaSignalGatewayWildcardVfG7hvFc0eEN93Kv79112439394045282 = new DeltaSignalGatewayWildcardVfG7hvFc0eEN93Kv7911243939404528(Float.isNaN(f) ? 0.0f : f);
        JadeCircuitMacroAPIDE12GmvXSrbYAOPK7F19197417134278 jadeCircuitMacroAPIDE12GmvXSrbYAOPK7F19197417134278 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        if (jadeCircuitMacroAPIDE12GmvXSrbYAOPK7F19197417134278 == null) {
            jadeCircuitMacroAPIDE12GmvXSrbYAOPK7F19197417134278 = JadeCircuitMacroAPIDE12GmvXSrbYAOPK7F19197417134278.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        }
        JadeCircuitMacroAPIDE12GmvXSrbYAOPK7F19197417134278 jadeCircuitMacroAPIDE12GmvXSrbYAOPK7F191974171342782 = jadeCircuitMacroAPIDE12GmvXSrbYAOPK7F19197417134278;
        DragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131 dragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (dragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131 == null) {
            DragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131 dragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE7407570831261312 = DragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            dragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131 = NovaLayerProcessorDecryptionF1EFZz8rN5441nMXdA71592783130199.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
        }
        DragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131 dragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE7407570831261313 = dragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE740757083126131;
        long j6 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
        if (j6 == 16) {
            j6 = IronMatrixResponseInheritanceHpxEqoa8PzUvjHZn4u32769523225401.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        }
        long j7 = j6;
        JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 jadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
        if (jadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 == null) {
            jadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 = JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        }
        JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 jadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs9717363807548572 = jadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857;
        ObsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf41203047843693 obsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf41203047843693 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
        if (obsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf41203047843693 == null) {
            obsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf41203047843693 = ObsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf41203047843693.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        }
        ObsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf41203047843693 obsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf412030478436932 = obsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf41203047843693;
        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531 arcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531 = dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
        if (arcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531 == null) {
            arcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531 = BlazePulseDataframeCoordinatorKGF7Fpzsylw8SHhknF69147156008599.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        }
        DragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949 dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO688977272369492 = new DragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO68897727236949(arcticByteShimDecoderYnULpEzTgrTAQRFwC6150641260804983, j3, zenithPathPayloadContextZzTkjLMOSyD5xYX6cC915088667971682, blazePulseClosureKeyValueCC8SnvILJfmlRxuGzA547946741065032, kryptonFlowDispatcherListenerYPJLsl98IVb1LZo6vU949891694495172, vertexLinkResolverContextQq9FLX81OXHnUzzWZJ568594813020222, str2, j5, deltaSignalGatewayWildcardVfG7hvFc0eEN93Kv79112439394045282, jadeCircuitMacroAPIDE12GmvXSrbYAOPK7F191974171342782, dragonRouteMonitorConcurrencyLFilf7ArjI6d7VrDE7407570831261313, j7, jadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs9717363807548572, obsidianEngineHandlerCompilerQ0tzRWiQFiJRpgaQBf412030478436932, arcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531);
        EmeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309 emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309 = obsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i3 = LunarNodeWorkerDispatcherIqF665FpOkrQDShja098058266343886.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i4 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (i6 != 3) {
            if (i6 == 0) {
                int ordinal = heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422.ordinal();
                if (ordinal == 0) {
                    i6 = 1;
                } else {
                    if (ordinal != 1) {
                        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            if ((j & 1095216660480L) == 0) {
                j = LunarNodeWorkerDispatcherIqF665FpOkrQDShja098058266343886.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            }
            emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606 == null) {
                emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606 = EmeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            }
            DeltaSignalProtocolForeachJOmVcuq24OmtawkzCB23905963412085 deltaSignalProtocolForeachJOmVcuq24OmtawkzCB23905963412085 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            IronMatrixClosureRequestD9a6CR0v0hhABLliYH51887459272740 ironMatrixClosureRequestD9a6CR0v0hhABLliYH51887459272740 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            i = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
            if (i == 0) {
                i = WhiteFieldStateUnificationYh53nRk2vgRXz1cU5I77305922756026.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            }
            i2 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
            if (i2 == 0) {
                i2 = 1;
            }
            jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
            if (jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909 == null) {
                jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909 = JadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            }
            return new ObsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923(dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO688977272369492, new EmeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309(i4, i6, j, emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606, deltaSignalProtocolForeachJOmVcuq24OmtawkzCB23905963412085, ironMatrixClosureRequestD9a6CR0v0hhABLliYH51887459272740, i, i2, jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909), obsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
        }
        int ordinal2 = heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422.ordinal();
        if (ordinal2 == 0) {
            i5 = 4;
        } else if (ordinal2 != 1) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            return null;
        }
        i6 = i5;
        j = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if ((j & 1095216660480L) == 0) {
        }
        emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606 == null) {
        }
        DeltaSignalProtocolForeachJOmVcuq24OmtawkzCB23905963412085 deltaSignalProtocolForeachJOmVcuq24OmtawkzCB239059634120852 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        IronMatrixClosureRequestD9a6CR0v0hhABLliYH51887459272740 ironMatrixClosureRequestD9a6CR0v0hhABLliYH518874592727402 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        i = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        if (i == 0) {
        }
        i2 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (i2 == 0) {
        }
        jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909 = emeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
        if (jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909 == null) {
        }
        return new ObsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923(dragonRouteChannelPrimitiveGZMeGRJXCYBynhkMyO688977272369492, new EmeraldStackParserCompilerLGW7Of5pQmnSZmeSc612710950638309(i4, i6, j, emeraldStackMiddlewareStaticHRxBtYwnOn5qUul9gu24598059100606, deltaSignalProtocolForeachJOmVcuq24OmtawkzCB239059634120852, ironMatrixClosureRequestD9a6CR0v0hhABLliYH518874592727402, i, i2, jadeCircuitResponseHashmapPLnvB4gSgPNprmvTEU75863623062909), obsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
    }

    public static final void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654 zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i) {
        int i2;
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(155925518);
        if ((i & 6) == 0) {
            i2 = (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654) ? 32 : 16;
        }
        int i3 = 3;
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i2 & 1, (i2 & 19) != 18)) {
            boolean z = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(BlazePulseEventLoopBinaryTreeBRfhwl7zZ6WmXN8p0550752454721395.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) != null;
            boolean z2 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(BlazePulseEventLoopBinaryTreeBRfhwl7zZ6WmXN8p0550752454721395.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) != null;
            if (z && z2) {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(-1977187922);
                GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 = BlueKernelSessionObjectQswGaxvYDCkmVBjDQ258860156888305.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, true);
                int hashCode = Long.hashCode(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381);
                EmeraldStackPacketBufferK3IXt6rgzKL50TDZ3n82540320567786 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998);
                BlazePulseHeuristicReflectionAjE3uSLXRdITwAE2k393161190765519.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getClass();
                YellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079();
                if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685) {
                    zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783);
                } else {
                    zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameRouterExceptionQjAvXXEXJ8u2ZI6OgX41663540814107();
                }
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, Integer.valueOf(hashCode), NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252);
                zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, Integer.valueOf((i2 >> 3) & 14));
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(true);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
            } else if (z) {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(-1976997706);
                TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, i2 & 126);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
            } else if (z2) {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(-1976846922);
                VertexLinkFrameworkConcurrencyXXGvWYPxucaZE5DFAN43346173167648.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, i2 & 126);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
            } else {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(-1976716505);
                LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, i2 & 126);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
            }
        } else {
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
        }
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712 != null) {
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT2479020930545712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new WhiteFieldArrayCallbackHTrUn6R8JIzQ26npQg23989565070186(cosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998, zenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654, i, i3);
        }
    }

    public static final LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310 goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310) {
        int i;
        if (goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310 == null || (i = goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) == 0) {
            return null;
        }
        return (LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892) goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i - 1);
    }

    public static final SolarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 ZenithPathClosureStorageLMdP6kbfH2eiEM3KeE77240003825952(PhotonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782 photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782) {
        if (!((LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892) photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927) {
            ObsidianEngineLambdaValidationGvCNBIpXin5KgPbxID14685439027799.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        SolarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854 = MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854(photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782, 2);
        if (!MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854.RapidLogicParserDataframeAmKWgp3J9yypIyotf526578755236768().CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927) {
            ObsidianEngineLambdaValidationGvCNBIpXin5KgPbxID14685439027799.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("LayoutCoordinates is not attached.");
        }
        return MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854;
    }

    public static final void ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914(float[] fArr, float[] fArr2) {
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 0, fArr, 0);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995412 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 0, fArr, 1);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995413 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 0, fArr, 2);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995414 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 0, fArr, 3);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995415 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 1, fArr, 0);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995416 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 1, fArr, 1);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995417 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 1, fArr, 2);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995418 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 1, fArr, 3);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995419 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 2, fArr, 0);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954110 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 2, fArr, 1);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954111 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 2, fArr, 2);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954112 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 2, fArr, 3);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954113 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 3, fArr, 0);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954114 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 3, fArr, 1);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954115 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 3, fArr, 2);
        float UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954116 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(fArr2, 3, fArr, 3);
        fArr[0] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541;
        fArr[1] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995412;
        fArr[2] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995413;
        fArr[3] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995414;
        fArr[4] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995415;
        fArr[5] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995416;
        fArr[6] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995417;
        fArr[7] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995418;
        fArr[8] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995419;
        fArr[9] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954110;
        fArr[10] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954111;
        fArr[11] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954112;
        fArr[12] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954113;
        fArr[13] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954114;
        fArr[14] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954115;
        fArr[15] = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo9880316599954116;
    }

    public static final CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415 ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990 ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i) {
        View view = (View) zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(ZenithPathTokenDispatcherAvUgmzIRwAXU6AUJfO73448690661663.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
        boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(view);
        Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
        Object obj = FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 || HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 == obj) {
            HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = new CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415(view, null, ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990);
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382);
        }
        CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415 cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415 = (CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382;
        boolean BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415);
        Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
        if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182 || HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 == obj) {
            HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = new DeltaSignalNormalizationBinaryTreeL7fU9Hu6xf3PNagI7H97996932726374(cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415, 3);
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822);
        }
        XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415, (DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156);
        return cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415;
    }

    public static final PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870 ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(PhotonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782 photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782) {
        SolarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 = ((LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892) photonFrameAsyncSchedulerZzzfwoQmbKsTM2aC4C65436717618782).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598 != null) {
            return solarMeshKeyValueTransportHsJgqzaGaOYjqC6uE889864183596598.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
        }
        throw MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }
}
