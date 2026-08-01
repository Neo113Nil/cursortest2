package com.google.android.datatransport;

import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArray implements WinterFlowQueueHandler {
    public final WinterFlowViewAgent WinterFlowArrayNetwork = new WinterFlowViewAgent(this);
    public final HashMap WinterFlowCacheManagerAgent;
    public final HashMap WinterFlowHookDataSource;
    public OutputStream WinterFlowRouterStructure;
    public static final Charset WinterFlowVariableVersionControl = Charset.forName(Constants.ENCODING);
    public static final WinterFlowAlgorithmHelper WinterFlowTransactionManagerStrategy = new WinterFlowAlgorithmHelper("key", WinterFlowResolverBackend.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowServiceUtility(WinterFlowRefactoringAgent.class, new WinterFlowMapperLayer(1))));
    public static final WinterFlowAlgorithmHelper WinterFlowUnitTestResponse = new WinterFlowAlgorithmHelper("value", WinterFlowResolverBackend.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowServiceUtility(WinterFlowRefactoringAgent.class, new WinterFlowMapperLayer(2))));
    public static final WinterFlowLibraryParser WinterFlowRouterRouter = new WinterFlowLibraryParser(1);

    public WinterFlowArray(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.WinterFlowRouterStructure = byteArrayOutputStream;
        this.WinterFlowHookDataSource = hashMap;
        this.WinterFlowCacheManagerAgent = hashMap2;
    }

    public static int WinterFlowRouterRouter(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper) {
        WinterFlowRefactoringAgent winterFlowRefactoringAgent = (WinterFlowRefactoringAgent) ((Annotation) winterFlowAlgorithmHelper.WinterFlowHookDataSource.get(WinterFlowRefactoringAgent.class));
        if (winterFlowRefactoringAgent != null) {
            return winterFlowRefactoringAgent.tag();
        }
        throw new WinterFlowArrayManager("Field has no @Protobuf config");
    }

    @Override // com.google.android.datatransport.WinterFlowQueueHandler
    public final WinterFlowQueueHandler WinterFlowArrayNetwork(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, long j) {
        WinterFlowCacheManagerAgent(winterFlowAlgorithmHelper, j, true);
        return this;
    }

    public final void WinterFlowCacheManagerAgent(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        WinterFlowRefactoringAgent winterFlowRefactoringAgent = (WinterFlowRefactoringAgent) ((Annotation) winterFlowAlgorithmHelper.WinterFlowHookDataSource.get(WinterFlowRefactoringAgent.class));
        if (winterFlowRefactoringAgent == null) {
            throw new WinterFlowArrayManager("Field has no @Protobuf config");
        }
        int ordinal = winterFlowRefactoringAgent.intEncoding().ordinal();
        if (ordinal == 0) {
            WinterFlowSyntax(winterFlowRefactoringAgent.tag() << 3);
            WinterFlowResponseEngine(j);
        } else if (ordinal == 1) {
            WinterFlowSyntax(winterFlowRefactoringAgent.tag() << 3);
            WinterFlowResponseEngine((j >> 63) ^ (j << 1));
        } else {
            if (ordinal != 2) {
                return;
            }
            WinterFlowSyntax((winterFlowRefactoringAgent.tag() << 3) | 1);
            this.WinterFlowRouterStructure.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void WinterFlowHookDataSource(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        WinterFlowRefactoringAgent winterFlowRefactoringAgent = (WinterFlowRefactoringAgent) ((Annotation) winterFlowAlgorithmHelper.WinterFlowHookDataSource.get(WinterFlowRefactoringAgent.class));
        if (winterFlowRefactoringAgent == null) {
            throw new WinterFlowArrayManager("Field has no @Protobuf config");
        }
        int ordinal = winterFlowRefactoringAgent.intEncoding().ordinal();
        if (ordinal == 0) {
            WinterFlowSyntax(winterFlowRefactoringAgent.tag() << 3);
            WinterFlowSyntax(i);
        } else if (ordinal == 1) {
            WinterFlowSyntax(winterFlowRefactoringAgent.tag() << 3);
            WinterFlowSyntax((i << 1) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            WinterFlowSyntax((winterFlowRefactoringAgent.tag() << 3) | 5);
            this.WinterFlowRouterStructure.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void WinterFlowResponseEngine(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.WinterFlowRouterStructure;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowQueueHandler
    public final WinterFlowQueueHandler WinterFlowRouterStructure(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, Object obj) {
        WinterFlowTransactionManagerStrategy(winterFlowAlgorithmHelper, obj, true);
        return this;
    }

    public final void WinterFlowSyntax(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.WinterFlowRouterStructure;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void WinterFlowTransactionManagerStrategy(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            WinterFlowSyntax((WinterFlowRouterRouter(winterFlowAlgorithmHelper) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(WinterFlowVariableVersionControl);
            WinterFlowSyntax(bytes.length);
            this.WinterFlowRouterStructure.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                WinterFlowTransactionManagerStrategy(winterFlowAlgorithmHelper, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                WinterFlowUnitTestResponse(WinterFlowRouterRouter, winterFlowAlgorithmHelper, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            WinterFlowSyntax((WinterFlowRouterRouter(winterFlowAlgorithmHelper) << 3) | 1);
            this.WinterFlowRouterStructure.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            WinterFlowSyntax((WinterFlowRouterRouter(winterFlowAlgorithmHelper) << 3) | 5);
            this.WinterFlowRouterStructure.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            WinterFlowCacheManagerAgent(winterFlowAlgorithmHelper, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            WinterFlowHookDataSource(winterFlowAlgorithmHelper, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            WinterFlowSyntax((WinterFlowRouterRouter(winterFlowAlgorithmHelper) << 3) | 2);
            WinterFlowSyntax(bArr.length);
            this.WinterFlowRouterStructure.write(bArr);
            return;
        }
        WinterFlowResponseSubsystem winterFlowResponseSubsystem = (WinterFlowResponseSubsystem) this.WinterFlowHookDataSource.get(obj.getClass());
        if (winterFlowResponseSubsystem != null) {
            WinterFlowUnitTestResponse(winterFlowResponseSubsystem, winterFlowAlgorithmHelper, obj, z);
            return;
        }
        WinterFlowEventLayer winterFlowEventLayer = (WinterFlowEventLayer) this.WinterFlowCacheManagerAgent.get(obj.getClass());
        if (winterFlowEventLayer != null) {
            WinterFlowViewAgent winterFlowViewAgent = this.WinterFlowArrayNetwork;
            winterFlowViewAgent.WinterFlowRouterStructure = false;
            winterFlowViewAgent.WinterFlowCacheManagerAgent = winterFlowAlgorithmHelper;
            winterFlowViewAgent.WinterFlowHookDataSource = z;
            winterFlowEventLayer.WinterFlowRouterStructure(obj, winterFlowViewAgent);
            return;
        }
        if (obj instanceof WinterFlowConcurrencyDatabase) {
            WinterFlowHookDataSource(winterFlowAlgorithmHelper, ((WinterFlowConcurrencyDatabase) obj).WinterFlowRouterStructure(), true);
        } else if (obj instanceof Enum) {
            WinterFlowHookDataSource(winterFlowAlgorithmHelper, ((Enum) obj).ordinal(), true);
        } else {
            WinterFlowUnitTestResponse(WinterFlowQuerySyntax.WinterFlowSyntax, winterFlowAlgorithmHelper, obj, z);
        }
    }

    public final void WinterFlowUnitTestResponse(WinterFlowResponseSubsystem winterFlowResponseSubsystem, WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, Object obj, boolean z) {
        WinterFlowPackageManager winterFlowPackageManager = new WinterFlowPackageManager();
        winterFlowPackageManager.WinterFlowVariableVersionControl = 0L;
        try {
            OutputStream outputStream = this.WinterFlowRouterStructure;
            this.WinterFlowRouterStructure = winterFlowPackageManager;
            try {
                winterFlowResponseSubsystem.WinterFlowRouterStructure(obj, this);
                this.WinterFlowRouterStructure = outputStream;
                long j = winterFlowPackageManager.WinterFlowVariableVersionControl;
                winterFlowPackageManager.close();
                if (z && j == 0) {
                    return;
                }
                WinterFlowSyntax((WinterFlowRouterRouter(winterFlowAlgorithmHelper) << 3) | 2);
                WinterFlowResponseEngine(j);
                winterFlowResponseSubsystem.WinterFlowRouterStructure(obj, this);
            } catch (Throwable th) {
                this.WinterFlowRouterStructure = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                winterFlowPackageManager.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowQueueHandler
    public final WinterFlowQueueHandler WinterFlowVariableVersionControl(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, int i) {
        WinterFlowHookDataSource(winterFlowAlgorithmHelper, i, true);
        return this;
    }
}
