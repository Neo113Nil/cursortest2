package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AppInfoTable implements Metadata.Entry {
    public final int controlCode;
    public final String url;

    public AppInfoTable(int i, String str) {
        this.controlCode = i;
        this.url = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.controlCode);
        sb.append(",url=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.url, ")");
    }
}
