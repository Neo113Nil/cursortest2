package ru.yandex.taxi.notifications.push.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.u691;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002%&Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\u001eR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0019¨\u0006'"}, d2 = {"Lru/yandex/taxi/notifications/push/model/NotificationShareData;", "Landroid/os/Parcelable;", "", "id", "", "pushId", "transitId", "type", "buttonId", "tag", "", "params", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "getAllParams", "()Ljava/util/Map;", CA20Status.STATUS_USER_I, "getId", "Ljava/lang/String;", "getPushId", "()Ljava/lang/String;", "getTransitId", "getType", "getButtonId", "getTag", "Ljava/util/Map;", "getParams", "CREATOR", "a", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NotificationShareData implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String buttonId;
    private final int id;
    private final Map<String, String> params;
    private final String pushId;
    private final String tag;
    private final String transitId;
    private final String type;

    /* loaded from: classes6.dex */
    public static final class a {
        public int a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public HashMap g;

        public final NotificationShareData a() {
            if (this.b == null && this.e == null) {
                return null;
            }
            return new NotificationShareData(this.a, this.b, this.c, this.e, this.f, this.d, this.g);
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final void d(String str) {
            this.f = str;
        }

        public final void e(int i) {
            this.a = i;
        }

        public final void f(HashMap hashMap) {
            this.g = hashMap;
        }

        public final void g(String str) {
            this.b = str;
        }

        public final void h(String str) {
            this.d = str;
        }

        public final void i(String str) {
            this.e = str;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ NotificationShareData(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lb
            r3 = r0
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L10
            r4 = r0
        L10:
            r10 = r9 & 8
            if (r10 == 0) goto L15
            r5 = r0
        L15:
            r10 = r9 & 16
            if (r10 == 0) goto L1a
            r6 = r0
        L1a:
            r10 = r9 & 32
            if (r10 == 0) goto L1f
            r7 = r0
        L1f:
            r9 = r9 & 64
            if (r9 == 0) goto L2c
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L34
        L2c:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L34:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.taxi.notifications.push.model.NotificationShareData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static final a builder() {
        return INSTANCE.builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r1 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> getAllParams() {
        HashMap h = b.h(new Pair("id", Integer.valueOf(this.id)));
        String str = this.type;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
        }
        str = "other";
        h.put("type", str);
        String str2 = this.pushId;
        if (str2 != null) {
            h.put("push_id", str2);
        }
        String str3 = this.transitId;
        if (str3 != null) {
            h.put("transit_id", str3);
        }
        String str4 = this.buttonId;
        if (str4 != null) {
            h.put("button_id", str4);
        }
        Map<String, String> map = this.params;
        if (map != null) {
            h.putAll(map);
        }
        return h;
    }

    public final String getButtonId() {
        return this.buttonId;
    }

    public final int getId() {
        return this.id;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTransitId() {
        return this.transitId;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.pushId);
        parcel.writeString(this.type);
        parcel.writeString(this.buttonId);
        parcel.writeString(this.tag);
        parcel.writeMap(this.params);
        parcel.writeString(this.transitId);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/notifications/push/model/NotificationShareData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lru/yandex/taxi/notifications/push/model/NotificationShareData;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lru/yandex/taxi/notifications/push/model/NotificationShareData;", "", "size", "", "newArray", "(I)[Lru/yandex/taxi/notifications/push/model/NotificationShareData;", "Lru/yandex/taxi/notifications/push/model/NotificationShareData$a;", "builder", "()Lru/yandex/taxi/notifications/push/model/NotificationShareData$a;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.notifications.push.model.NotificationShareData$CREATOR, reason: from kotlin metadata */
    /* loaded from: classes12.dex */
    public static final class Companion implements Parcelable.Creator<NotificationShareData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a builder() {
            return new a();
        }

        @Override // android.os.Parcelable.Creator
        public NotificationShareData createFromParcel(Parcel parcel) {
            return new NotificationShareData(parcel);
        }

        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public NotificationShareData[] newArray(int size) {
            return new NotificationShareData[size];
        }
    }

    public NotificationShareData(int i, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.id = i;
        this.pushId = str;
        this.transitId = str2;
        this.type = str3;
        this.buttonId = str4;
        this.tag = str5;
        this.params = map;
    }

    public NotificationShareData() {
        this(0, null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationShareData(Parcel parcel) {
        this(r1, r2, parcel.readString(), r4, r5, r6, r7);
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String str = readString2 == null ? "other" : readString2;
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        HashMap hashMap = new HashMap();
        u691.f(parcel, hashMap, String.class.getClassLoader());
    }
}
