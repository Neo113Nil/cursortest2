package androidx.paging;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class PagingConfig {
    public int initialLoadSize;
    public int pageSize;
    public int prefetchDistance;

    public PagingConfig(int i, int i2) {
        int i3 = (i2 & 2) != 0 ? i : 20;
        int i4 = (i2 & 8) != 0 ? i * 3 : 1;
        this.pageSize = i;
        this.prefetchDistance = i3;
        this.initialLoadSize = i4;
    }

    public String end() {
        StringBuilder sb = new StringBuilder();
        if (this.initialLoadSize != 0) {
            sb.append(' ');
            int i = this.prefetchDistance;
            int i2 = this.initialLoadSize;
            if (i <= 3) {
                i2 /= 2;
            }
            StringBuilder sb2 = new StringBuilder("one two three four five six seven eight nine ten eleven twelve thirteen fourteen fiveteen sixteen seventeen nineteen twenty");
            while (sb2.length() < i2) {
                sb2.append(" ");
                sb2.append("one two three four five six seven eight nine ten eleven twelve thirteen fourteen fiveteen sixteen seventeen nineteen twenty");
            }
            int indexOf$default = StringsKt.indexOf$default((CharSequence) sb2, ' ', i2 + 1, false, 4);
            if (indexOf$default == -1) {
                indexOf$default = sb2.length();
            }
            String substring = sb2.substring(0, indexOf$default);
            substring.getClass();
            sb.append(substring);
        }
        this.prefetchDistance = 0;
        this.initialLoadSize = 0;
        int i3 = this.pageSize - 1;
        this.pageSize = i3;
        if (i3 == 0) {
            sb.append("]");
        }
        return sb.toString();
    }

    public String placeholder(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("»", str, "«");
    }

    public String start() {
        int i = this.pageSize;
        String str = i == 0 ? "[" : "";
        this.prefetchDistance = 0;
        this.initialLoadSize = 0;
        this.pageSize = i + 1;
        return str;
    }

    public /* synthetic */ PagingConfig(int i, int i2, int i3) {
        this.pageSize = i;
        this.prefetchDistance = i2;
        this.initialLoadSize = i3;
    }
}
