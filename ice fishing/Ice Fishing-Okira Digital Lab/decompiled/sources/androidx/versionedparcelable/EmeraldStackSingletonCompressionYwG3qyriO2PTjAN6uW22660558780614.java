package androidx.versionedparcelable;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class EmeraldStackSingletonCompressionYwG3qyriO2PTjAN6uW22660558780614 implements BlueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059, MysticCacheLoaderFilterYwhwiRXTEXIYgGRKLs34510204535100 {
    public final /* synthetic */ Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ EmeraldStackSingletonCompressionYwG3qyriO2PTjAN6uW22660558780614(Object obj, Object obj2, long j) {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj2;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = j;
    }

    @Override // androidx.versionedparcelable.MysticCacheLoaderFilterYwhwiRXTEXIYgGRKLs34510204535100
    public Object ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        SolarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235 solarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235 = (SolarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 = (VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        PhotonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163 photonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163 = (PhotonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163) solarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = ((AxiomCoreChannelBufferSdxM2nFimMvJJcRCX224402779305073) solarMeshExceptionModuleAvjC8OuyWb6YwPbeMV37936144043235.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() + this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        photonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163.getClass();
        photonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(new EmeraldStackRuntimeBitwiseZz6gYyCyxUY5JO1KiZ49143232013883(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397));
        return null;
    }

    @Override // androidx.versionedparcelable.BlueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059
    public Object apply(Object obj) {
        String str = (String) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((VertexLinkConnectorMiddlewareR0Q4tHp3ClfQdUvWk236704881702671) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
