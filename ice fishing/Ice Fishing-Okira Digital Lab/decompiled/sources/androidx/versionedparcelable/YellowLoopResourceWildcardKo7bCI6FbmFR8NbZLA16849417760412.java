package androidx.versionedparcelable;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 implements CosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413, MysticCacheDecryptionVirtualizationXk0OuECC1cb9aylKX923453243577995, KryptonFlowResourceListenerU6PwkaaL2DuiSGpNPs25939041988356, OnGoogleAdIdReadListener, DragonRoutePostfixMiddlewareKN0beHV4wbEWWl9sHQ52737365869492, QuantumStreamInterpreterBuilderKdzUHfUpRT3s4XD0S180395521304888, HeliosRuntimeEncryptionCompressionV2aBADj4QXbfaLxFMQ16003089067693 {
    public static ArcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public static final Object TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = new Object();
    public Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        switch (i) {
            case 18:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785(0);
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785(0);
                break;
            case 19:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(Boolean.FALSE);
                break;
            case 20:
            case 22:
            default:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new ArrayList();
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new HashMap();
                new HashMap();
                break;
            case 21:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new WhiteFieldVectorAPIHFORY5q24tfV3yeBVQ71014772743585();
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new WhiteFieldVectorAPIHFORY5q24tfV3yeBVQ71014772743585();
                break;
            case 23:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310(new PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870[16]);
                break;
        }
    }

    public static YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(5, fileChannel, fileLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    public static ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(Context context, Intent intent, boolean z) {
        ArcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978 arcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978;
        synchronized (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
            try {
                if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == null) {
                    BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new ArcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978(context);
                }
                arcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
            } finally {
            }
        }
        if (!z) {
            return arcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(intent).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345(), new GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246(19));
        }
        if (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(context)) {
            synchronized (AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050) {
                try {
                    AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    }
                    ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = arcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(intent);
                    KryptonFlowBufferImmutableBWE7TWn4z6Dv2MkZvC31441389142486 kryptonFlowBufferImmutableBWE7TWn4z6Dv2MkZvC31441389142486 = new KryptonFlowBufferImmutableBWE7TWn4z6Dv2MkZvC31441389142486(5, intent);
                    AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getClass();
                    AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(new ArcticByteLibraryContextQ3i5L7P05IAEvfUT6M11325520501197(ZenithPathPolymorphismRepositoryPQqMIrgX5PQTeQrJ9N67881868670923.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, kryptonFlowBufferImmutableBWE7TWn4z6Dv2MkZvC31441389142486));
                    AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
                } finally {
                }
            }
        } else {
            arcticByteAttributeProtocolOYleivaX6NcjxRz8wA77164822547978.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(intent);
        }
        return RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.versionedparcelable.LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.versionedparcelable.LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.versionedparcelable.GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.versionedparcelable.GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870 photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870) {
        if (photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381 > 0) {
            if (photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == IronMatrixAliasLoaderAdXgYFceVvTecj6Vf467711711381017.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 && !photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036() && !photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927() && !photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070 && photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367()) {
                LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 = photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                if ((lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 & 256) != 0) {
                    while (lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 != null) {
                        if ((lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 & 256) != 0) {
                            RapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 = lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892;
                            ?? r5 = 0;
                            while (rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 != 0) {
                                if (rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 instanceof WhiteFieldRepositoryDependencyVrWi9qXeE3m0QjhCxk71330832122807) {
                                    WhiteFieldRepositoryDependencyVrWi9qXeE3m0QjhCxk71330832122807 whiteFieldRepositoryDependencyVrWi9qXeE3m0QjhCxk71330832122807 = (WhiteFieldRepositoryDependencyVrWi9qXeE3m0QjhCxk71330832122807) rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073;
                                    whiteFieldRepositoryDependencyVrWi9qXeE3m0QjhCxk71330832122807.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854(whiteFieldRepositoryDependencyVrWi9qXeE3m0QjhCxk71330832122807, 256));
                                } else if ((rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 & 256) != 0 && (rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 instanceof RapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073)) {
                                    LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 = rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598;
                                    int i = 0;
                                    rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 = rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073;
                                    r5 = r5;
                                    while (lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 != null) {
                                        if ((lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 = lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310(new LunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892[16]);
                                                }
                                                if (rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 != 0) {
                                                    r5.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073);
                                                    rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 = 0;
                                                }
                                                r5.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922);
                                            }
                                        }
                                        lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922 = lunarNodeComponentCallbackXzghVuKUJT1emfX28v181001141728922.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                                        rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 = rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                rapidLogicForeachDispatcherLejFjpMsBb62XMjRWd92006862751073 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(r5);
                            }
                        }
                        if ((lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 & 256) == 0) {
                            break;
                        } else {
                            lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892 = lunarNodeComponentCallbackXzghVuKUJT1emfX28v18100114172892.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                        }
                    }
                }
            }
            photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685 = false;
            GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310 KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216 = photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216();
            Object[] objArr = KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            int i2 = KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            for (int i3 = 0; i3 < i2; i3++) {
                NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480((PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870) objArr[i3]);
            }
        }
    }

    @Override // androidx.versionedparcelable.CosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413
    public boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(CharSequence charSequence, int i, int i2, AxiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193 axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193) {
        if ((axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 & 4) > 0) {
            return true;
        }
        if (((XenoGridServiceExecutorIp3mqb9CfxCSsmnOyM65001168411685) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) == null) {
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new XenoGridServiceExecutorIp3mqb9CfxCSsmnOyM65001168411685(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).getClass();
        ((XenoGridServiceExecutorIp3mqb9CfxCSsmnOyM65001168411685) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).setSpan(new CrimsonRouteProcessorWildcardXACCwOEB6gugCzeKr576800559896980(axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193), i, i2, 33);
        return true;
    }

    public GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927() {
        return (GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841) ((CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).getValue();
    }

    public InputMethodManager CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170() {
        return (InputMethodManager) ((RapidLogicListenerVariableVH8odIXxCAe6WG4YVz40806053584695) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).getValue();
    }

    public void CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983() {
        try {
            ((FileLock) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).release();
            ((FileChannel) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).close();
        } catch (IOException unused) {
        }
    }

    @Override // androidx.versionedparcelable.KryptonFlowResourceListenerU6PwkaaL2DuiSGpNPs25939041988356
    public boolean EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(Object obj, Object obj2) {
        QuantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173 quantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173 = (QuantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        return YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(quantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(obj), quantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(obj2));
    }

    @Override // androidx.versionedparcelable.MysticCacheDecryptionVirtualizationXk0OuECC1cb9aylKX923453243577995
    public Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ObsidianEngineOverloadingPayloadKEwYoORM2kFywkJbVL99225347694771 obsidianEngineOverloadingPayloadKEwYoORM2kFywkJbVL99225347694771, BlueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063 blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063) {
        Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = ((EmeraldStackLoaderContextSnODzmTrpWFTlY5Wt441651116538534) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(new HeliosRuntimeSchedulerChannelFrcFOHl9GF4sXgJu9g73803819006694(new IronMatrixResolverJITHapLH4AcSKfBFaX4ph16445517976375(), obsidianEngineOverloadingPayloadKEwYoORM2kFywkJbVL99225347694771, (ArcticByteRepositoryConstructorIFd9ASuVOhHrPUsBDn99318139930183) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, 1), blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063);
        return LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == BlazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 ? LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 : AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    }

    public void LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764() {
        if (((MysticCacheAsyncFloatingPointVx7retGjNGoFYY7uEC26550431732736) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) != null) {
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = null;
            ((DragonRouteVariableIteratorQktELXhxjulZx8Vf9J32802863139118) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodePayloadImmutableTw04NzWG7Dfv3YBzjw55707504879792(true);
        }
    }

    @Override // androidx.versionedparcelable.CosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413
    public Object ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        return (XenoGridServiceExecutorIp3mqb9CfxCSsmnOyM65001168411685) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) == null) {
            Context context = (Context) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = map;
            }
            bundle = null;
            if (bundle != null) {
            }
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = map;
        }
        String str4 = (String) ((Map) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public List ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834() {
        ArrayList arrayList;
        if (((ArrayList) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119)) {
            arrayList = new ArrayList((ArrayList) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        }
        return arrayList;
    }

    @Override // androidx.versionedparcelable.KryptonFlowResourceListenerU6PwkaaL2DuiSGpNPs25939041988356
    public void PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(DeltaSignalWildcardServiceTNQaSpVHzD0I7X180n13835481014840 deltaSignalWildcardServiceTNQaSpVHzD0I7X180n13835481014840) {
        ArcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116 arcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116 = (ArcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        arcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        BlazePulseOverloadingEngineDxhg7FBTMl50BJC1xK49075323106332 blazePulseOverloadingEngineDxhg7FBTMl50BJC1xK49075323106332 = (BlazePulseOverloadingEngineDxhg7FBTMl50BJC1xK49075323106332) deltaSignalWildcardServiceTNQaSpVHzD0I7X180n13835481014840.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        Object[] objArr = blazePulseOverloadingEngineDxhg7FBTMl50BJC1xK49075323106332.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        long[] jArr = blazePulseOverloadingEngineDxhg7FBTMl50BJC1xK49075323106332.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        int i = blazePulseOverloadingEngineDxhg7FBTMl50BJC1xK49075323106332.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = ((QuantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(obj);
            int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = arcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            int i3 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 >= 0 ? arcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495[RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867] : 0;
            if (i3 == 7) {
                deltaSignalWildcardServiceTNQaSpVHzD0I7X180n13835481014840.remove(obj);
            } else {
                arcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i3 + 1, AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            }
            i = i2;
        }
    }

    public DeltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795 PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int[] iArr = new int[5];
        System.arraycopy(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, 0, iArr, 0, 5);
        int i = iArr[optInt];
        if (i == 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050("Null registrationStatus");
            return null;
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new DeltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Missing required properties:".concat(str));
        return null;
    }

    @Override // androidx.versionedparcelable.HeliosRuntimeEncryptionCompressionV2aBADj4QXbfaLxFMQ16003089067693
    public List RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Integer num) {
        List RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = ((HeliosRuntimeEncryptionCompressionV2aBADj4QXbfaLxFMQ16003089067693) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(null);
        UltraBufferFloatingPointKeyValueEnxeQll819ec2C6cyf79738971633656 ultraBufferFloatingPointKeyValueEnxeQll819ec2C6cyf79738971633656 = (UltraBufferFloatingPointKeyValueEnxeQll819ec2C6cyf79738971633656) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        int i = ultraBufferFloatingPointKeyValueEnxeQll819ec2C6cyf79738971633656.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942;
        return i < 0 ? RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 : PhotonFrameCacheIteratorNT4p7hb6YuwN0bTVCX57485104735039.PhotonFrameRouterExceptionQjAvXXEXJ8u2ZI6OgX41663540814107(XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(ultraBufferFloatingPointKeyValueEnxeQll819ec2C6cyf79738971633656, num, i, Integer.valueOf(ultraBufferFloatingPointKeyValueEnxeQll819ec2C6cyf79738971633656.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(ultraBufferFloatingPointKeyValueEnxeQll819ec2C6cyf79738971633656.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, i))), RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }

    public void RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(DeltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795 deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
            jSONObject.put("Status", MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365));
            jSONObject.put("AuthToken", deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            jSONObject.put("RefreshToken", deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            jSONObject.put("TokenCreationEpochInSecs", deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
            jSONObject.put("ExpiresInSecs", deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
            jSONObject.put("FisError", deltaSignalHandlerBuilderCF9EsmQI04tijrsUm099450880279795.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
            com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = (com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public DragonRouteFunctionFilterVYkGtIFe9rTqxUqnzp24914659461482 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571() {
        Matcher matcher = (Matcher) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        return DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(matcher.start(), matcher.end());
    }

    public RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(List list) {
        SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083;
        Exception e;
        SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD726790876750832;
        try {
            int size = list.size();
            int i = 0;
            solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 = null;
            while (i < size) {
                try {
                    solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD726790876750832 = (SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD726790876750832.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800((PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                    i++;
                    solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 = solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD726790876750832;
                } catch (Exception e3) {
                    e = e3;
                    solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 = solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD726790876750832;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365());
                    sb2.append(", composition=");
                    sb2.append(((PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495());
                    sb2.append(", selection=");
                    PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614 photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614 = (PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                    sb2.append((Object) ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    PhotonFrameCacheIteratorNT4p7hb6YuwN0bTVCX57485104735039.CrimsonRouteWorkerCacheKhpKboftN2D80QzJPW23993420543245(list, sb, new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(8, solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614 photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs484854470856142 = (PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs484854470856142.getClass();
            WhiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981 whiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981 = new WhiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981(photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs484854470856142.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.toString());
            PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614 photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs484854470856143 = (PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            long BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182 = AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs484854470856143.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, photonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs484854470856143.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072 arcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072 = ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(((RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) ? null : new ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072(BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182);
            RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 = new RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760(whiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981, arcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072 != null ? arcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 : AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182), ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182)), ((PhotonFrameFilterConcurrencyR3eJpe7rfJj6nh7wWs48485447085614) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495());
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760;
            return rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760;
        } catch (Exception e4) {
            solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 = null;
            e = e4;
        }
    }

    public ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345 heliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345 = (HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        boolean z = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(heliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345, new Callable() { // from class: androidx.versionedparcelable.EmeraldStackProxyEngineZy9JhwpMYvrVWzIdck19035361483324
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                Context context2 = context;
                Intent intent2 = intent;
                VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050();
                ((ArrayDeque) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050) {
                    try {
                        str = (String) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = serviceInfo.name;
                                    }
                                    str = (String) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                }
                                str = null;
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i = (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(context2) ? AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.DeltaSignalPrefixDelegateOKrpGQ6v30XWLJQ9fy84286487006325(context2, intent3) : context2.startService(intent3)) == null ? 404 : -1;
                } catch (IllegalStateException e) {
                    e.toString();
                    i = 402;
                } catch (SecurityException unused) {
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(heliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345, new JadeCircuitBootstrapValidationGXobTsfLGSkhm5bxxM90995699642922() { // from class: androidx.versionedparcelable.IronMatrixAlgorithmClassWfdYHgHaWIbG2JBXRJ28823448772598
            @Override // androidx.versionedparcelable.JadeCircuitBootstrapValidationGXobTsfLGSkhm5bxxM90995699642922
            public final Object UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182) {
                return (KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390() && ((Integer) obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170()).intValue() == 402) ? YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(context, intent, z2).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345(), new GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246(18)) : obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
            }
        }) : BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(context, intent, z2);
    }

    public AutofillId XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = TitanCloudSyntaxWildcardE8oi4pXEaWmROZmt3Z47403040758059.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
        DeltaSignalJITCompressionMEbd5XBkQ0nknYUB6185217579685023 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = UltraBufferFloatingPointFloatingPointUmyFT62ZOsOsWOrz8R80685480764186.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800((View) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        Objects.requireNonNull(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        return AxiomCoreOverridingProtocolQpvfpuIpp5cyplYZB389462008524396.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, CrimsonRouteInterpreterOverridingONJhE2k6QRooQDZhCt39507633608441.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867), j);
    }

    public void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(Object obj, String str) {
        ((ArrayList) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).add(str + "=" + String.valueOf(obj));
    }

    public File ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111() {
        if (((File) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) == null) {
            synchronized (this) {
                try {
                    if (((File) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) == null) {
                        com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = (com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new File(obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getFilesDir(), "PersistedInstallation." + ((com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // androidx.versionedparcelable.QuantumStreamInterpreterBuilderKdzUHfUpRT3s4XD0S180395521304888
    public void cancel() {
        if (((SolarMeshPayloadJSONOkMiPdtk6iXS8TDMrg45001516806467) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).compareAndSet(1, 1)) {
            return;
        }
        ((UltraBufferInheritancePayloadW5zn0hXcsbi93C57et61598824105692) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
    }

    @Override // androidx.versionedparcelable.CosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863
    public Object get() {
        return new UltraBufferProcessorInheritanceR2DYagLjQVN300llon35711008760676((Context) ((DeltaSignalJITCompressionMEbd5XBkQ0nknYUB6185217579685023) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, (ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215) ((IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r3 == null) goto L10;
     */
    @Override // com.adjust.sdk.OnGoogleAdIdReadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onGoogleAdIdRead(String str) {
        ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 = (ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764()) {
            if (str != null) {
                if (str.equals("00000000-0000-0000-0000-000000000000")) {
                    str = null;
                }
            }
            str = (String) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(str);
        }
    }

    public String toString() {
        int lastIndexOf;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case 13:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 = (DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 == null) {
                    sb.append("null");
                } else {
                    String simpleName = deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(lastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014)));
                }
                sb.append("}}");
                return sb.toString();
            case 22:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(int i, boolean z) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
    }

    public /* synthetic */ YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(Object obj, View view, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = view;
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(RapidLogicManagerInheritanceCYCEy7FhSPnVFJeZ4T94799872152887 rapidLogicManagerInheritanceCYCEy7FhSPnVFJeZ4T94799872152887, YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310 yellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 3;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = "ClientTelemetry.API";
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = rapidLogicManagerInheritanceCYCEy7FhSPnVFJeZ4T94799872152887;
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870 photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870, GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 goldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 10;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(goldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841);
    }

    public /* synthetic */ YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(int i, Object obj, Object obj2) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj2;
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(UltraBufferInheritancePayloadW5zn0hXcsbi93C57et61598824105692 ultraBufferInheritancePayloadW5zn0hXcsbi93C57et61598824105692) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 24;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = ultraBufferInheritancePayloadW5zn0hXcsbi93C57et61598824105692;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new SolarMeshPayloadJSONOkMiPdtk6iXS8TDMrg45001516806467(0);
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(ExecutorService executorService) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 29;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new BlazePulseAttributeFactoryO5mfykmKGeSDmv8VGo19155732311995(0);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = executorService;
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014, BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 13;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014;
        blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859.getClass();
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = (QuantumStreamCoordinatorMiddlewareTSKOIWMnVaRUGXK2sn54610037750220) new IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406(blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859, QuantumStreamCoordinatorMiddlewareTSKOIWMnVaRUGXK2sn54610037750220.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, SolarMeshLambdaPipelineKYuK1XLhyrHmKp1rl545830849680950.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(MysticCacheEncryptionStoragePETK9yEwixFUWt83Zc65186545348422.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(QuantumStreamCoordinatorMiddlewareTSKOIWMnVaRUGXK2sn54610037750220.class));
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(Context context, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        switch (i) {
            case 16:
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = null;
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = context;
                break;
            default:
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = context;
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345();
                break;
        }
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(View view) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 0;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = view;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568.YellowLoopEncoderRouterINqff2SYTbtqZyuhu243435970216181(new ZenithPathEncryptionPolymorphismHMxtIV1kvN80Zp8zK696772031032441(8, this));
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 26;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015;
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(QuantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173 quantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 11;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = quantumStreamRouterTokenTTAuVCo1PD3uZCJcky47938533685173;
        ArcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116 arcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116 = BlazePulsePolymorphismMutexClze0wLEFRyb8EUhU724730651035534.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new ArcticByteNormalizationUnificationTv6cLbHLydvWmXhjCl84395884596116();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(int i, Object obj) {
        this(19);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        switch (i) {
            case 22:
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj;
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new ArrayList();
                break;
            default:
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(obj);
                KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(obj);
                break;
        }
    }

    public YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(DragonRouteVariableIteratorQktELXhxjulZx8Vf9J32802863139118 dragonRouteVariableIteratorQktELXhxjulZx8Vf9J32802863139118) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 2;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = dragonRouteVariableIteratorQktELXhxjulZx8Vf9J32802863139118;
    }
}
