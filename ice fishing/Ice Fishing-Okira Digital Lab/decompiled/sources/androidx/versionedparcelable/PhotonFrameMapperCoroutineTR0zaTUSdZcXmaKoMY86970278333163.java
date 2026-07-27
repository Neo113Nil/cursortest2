package androidx.versionedparcelable;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class PhotonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163 implements Closeable {
    public static final FrostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977 UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = new FrostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977("proto");
    public final CosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final AxiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final AxiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final WhiteFieldAlgorithmLibraryTerlMCeroDUD2MtL0072107944355179 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final AxiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public PhotonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163(AxiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073, AxiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 axiomCoreChannelBufferSdxM2nFimMvJJcRCX2244027793050732, WhiteFieldAlgorithmLibraryTerlMCeroDUD2MtL0072107944355179 whiteFieldAlgorithmLibraryTerlMCeroDUD2MtL0072107944355179, AxiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333 axiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333, CosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863 cosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = axiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = axiomCoreChannelBufferSdxM2nFimMvJJcRCX2244027793050732;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = whiteFieldAlgorithmLibraryTerlMCeroDUD2MtL0072107944355179;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = cosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863;
    }

    public static Long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(SQLiteDatabase sQLiteDatabase, VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, String.valueOf(YellowLoopAnnotationVariableGQv7r0fCnSeQCW5RBd99238195825672.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495))));
        byte[] bArr = vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static Object BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(Cursor cursor, BlueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059 blueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059) {
        try {
            return blueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static String TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((PhotonFrameDependencyForeachCQ5RAnKn0jYQ3UsiMG74274017869141) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(BlueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059 blueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059) {
        SQLiteDatabase ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.beginTransaction();
        try {
            Object apply = blueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059.apply(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.setTransactionSuccessful();
            return apply;
        } finally {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.endTransaction();
        }
    }

    public final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(long j, VertexLinkConnectorMiddlewareR0Q4tHp3ClfQdUvWk236704881702671 vertexLinkConnectorMiddlewareR0Q4tHp3ClfQdUvWk236704881702671, String str) {
        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(new EmeraldStackSingletonCompressionYwG3qyriO2PTjAN6uW22660558780614(str, vertexLinkConnectorMiddlewareR0Q4tHp3ClfQdUvWk236704881702671, j));
    }

    public final SQLiteDatabase ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        AxiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333 axiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Objects.requireNonNull(axiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333);
        AxiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
        while (true) {
            try {
                return axiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() >= this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 + RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                    throw new KryptonFlowAggregationProxyLziGnCKihtEKSVcIBm60172002647652("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final ArrayList RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(SQLiteDatabase sQLiteDatabase, VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397, int i) {
        ArrayList arrayList = new ArrayList();
        Long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(sQLiteDatabase, vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397);
        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
            return arrayList;
        }
        BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.toString()}, null, null, null, String.valueOf(i)), new CrimsonRouteHandlerTranspilerHz43SDq5jTiu125oGt61139502104090(this, (Object) arrayList, vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397, 2));
        return arrayList;
    }

    public final Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(MysticCacheLoaderFilterYwhwiRXTEXIYgGRKLs34510204535100 mysticCacheLoaderFilterYwhwiRXTEXIYgGRKLs34510204535100) {
        SQLiteDatabase ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        AxiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
        while (true) {
            try {
                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.beginTransaction();
                try {
                    Object ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = mysticCacheLoaderFilterYwhwiRXTEXIYgGRKLs34510204535100.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.setTransactionSuccessful();
                    return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002;
                } finally {
                    ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (axiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() >= this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 + RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                    throw new KryptonFlowAggregationProxyLziGnCKihtEKSVcIBm60172002647652("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.close();
    }
}
