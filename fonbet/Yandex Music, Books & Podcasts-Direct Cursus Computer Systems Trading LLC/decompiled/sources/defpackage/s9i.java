package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s9i extends uif implements Function2 {
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9i(js3 js3Var, boolean z) {
        super(2);
        this.r = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r4.equals(".") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r4.equals("") == false) goto L33;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        String str = (String) obj2;
        list.getClass();
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 0) {
            if (hashCode != 46) {
                if (hashCode == 1472 && str.equals("..")) {
                    if (this.r) {
                        if (!list.isEmpty()) {
                            list.remove(list.size() - 1);
                            return list;
                        }
                    } else {
                        if (list.size() <= 0 || Intrinsics.d(list.get(list.size() - 1), "..")) {
                            list.add("..");
                            return list;
                        }
                        if (!list.isEmpty()) {
                            list.remove(list.size() - 1);
                            return list;
                        }
                    }
                }
                list.add(str);
            }
        }
        return list;
    }
}
