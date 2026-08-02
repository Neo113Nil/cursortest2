package defpackage;

import com.connectsdk.service.NetcastTVService;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public final /* synthetic */ class cp6 implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith(NetcastTVService.UDAP_API_EVENT);
            case 3:
                return str.startsWith(NetcastTVService.UDAP_API_EVENT) && !str.endsWith("_");
            default:
                return str.startsWith("search_history_");
        }
    }
}
