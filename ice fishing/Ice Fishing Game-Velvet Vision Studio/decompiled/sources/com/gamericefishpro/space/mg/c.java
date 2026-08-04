package com.gamericefishpro.space.mg;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    IAM("iam"),
    NOTIFICATION("notification");

    private final String nameValue;
    private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c fromString(String str) {
            c cVar;
            if (str != null) {
                c[] cVarArrValues = c.values();
                int length = cVarArrValues.length - 1;
                if (length < 0) {
                    cVar = null;
                    break;
                }
                while (true) {
                    int i = length - 1;
                    cVar = cVarArrValues[length];
                    if (cVar.equalsName(str)) {
                        break;
                    }
                    if (i < 0) {
                        cVar = null;
                        break;
                    }
                    length = i;
                }
                if (cVar != null) {
                    return cVar;
                }
            }
            return c.NOTIFICATION;
        }

        private a() {
        }
    }

    c(String str) {
        this.nameValue = str;
    }

    public static final c fromString(String str) {
        return Companion.fromString(str);
    }

    public static com.gamericefishpro.space.wh.a getEntries() {
        return $ENTRIES;
    }

    public final boolean equalsName(String otherName) {
        Intrinsics.checkNotNullParameter(otherName, "otherName");
        return Intrinsics.a(this.nameValue, otherName);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
