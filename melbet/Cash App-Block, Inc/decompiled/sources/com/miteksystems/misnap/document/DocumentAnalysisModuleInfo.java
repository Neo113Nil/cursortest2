package com.miteksystems.misnap.document;

import com.miteksystems.misnap.core.ModuleInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/miteksystems/misnap/document/DocumentAnalysisModuleInfo;", "Lcom/miteksystems/misnap/core/ModuleInfo;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getVersion", "version", "document-analysis_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DocumentAnalysisModuleInfo implements ModuleInfo {
    @Override // com.miteksystems.misnap.core.ModuleInfo
    public String getName() {
        return "document-analysis";
    }

    @Override // com.miteksystems.misnap.core.ModuleInfo
    public String getVersion() {
        return "5.11.1";
    }
}
