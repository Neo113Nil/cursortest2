package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public final class RawMessageInfo {
    public final AbstractMessageLite defaultInstance;
    public final int flags;
    public final String info;
    public final Object[] objects;

    public RawMessageInfo(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.defaultInstance = generatedMessageLite;
        this.info = str;
        this.objects = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int getSyntax() {
        int i = this.flags;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
