package androidx.versionedparcelable;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class EmeraldStackRuntimeBitwiseZz6gYyCyxUY5JO1KiZ49143232013883 implements BlueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059 {
    public final /* synthetic */ VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ EmeraldStackRuntimeBitwiseZz6gYyCyxUY5JO1KiZ49143232013883(long j, VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = j;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397;
    }

    @Override // androidx.versionedparcelable.BlueKernelVariableStateFIF0eJifRSOdKXDwZJ76864251369059
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
        VertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        String str = vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        CosmicForgeFilterConstructorHpOEV5TSAn0FvkZ6Pv15253463021823 cosmicForgeFilterConstructorHpOEV5TSAn0FvkZ6Pv15253463021823 = vertexLinkResponseTemplatingIwtk5eb6TRo4QF8Nm197771495477397.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(YellowLoopAnnotationVariableGQv7r0fCnSeQCW5RBd99238195825672.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(cosmicForgeFilterConstructorHpOEV5TSAn0FvkZ6Pv15253463021823))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(YellowLoopAnnotationVariableGQv7r0fCnSeQCW5RBd99238195825672.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(cosmicForgeFilterConstructorHpOEV5TSAn0FvkZ6Pv15253463021823)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
