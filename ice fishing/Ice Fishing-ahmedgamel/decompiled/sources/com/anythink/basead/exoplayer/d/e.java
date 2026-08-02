package com.anythink.basead.exoplayer.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class e implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.basead.exoplayer.d.e.1
        private static e a(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ e[] newArray(int i) {
            return new e[i];
        }

        private static e[] a(int i) {
            return new e[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f7630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7631b;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f7632c;

    /* renamed from: d, reason: collision with root package name */
    private int f7633d;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.d.e.a.1
            private static a a(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ a[] newArray(int i) {
                return new a[i];
            }

            private static a[] a(int i) {
                return new a[i];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final String f7634a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7635b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7636c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7637d;

        /* renamed from: e, reason: collision with root package name */
        private int f7638e;

        /* renamed from: f, reason: collision with root package name */
        private final UUID f7639f;

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, (byte) 0);
        }

        private boolean b(a aVar) {
            return a() && !aVar.a() && a(aVar.f7639f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return af.a((Object) this.f7634a, (Object) aVar.f7634a) && af.a((Object) this.f7635b, (Object) aVar.f7635b) && af.a(this.f7639f, aVar.f7639f) && Arrays.equals(this.f7636c, aVar.f7636c);
        }

        public final int hashCode() {
            if (this.f7638e == 0) {
                int hashCode = this.f7639f.hashCode() * 31;
                String str = this.f7634a;
                this.f7638e = Arrays.hashCode(this.f7636c) + AbstractC5128c.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f7635b);
            }
            return this.f7638e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7639f.getMostSignificantBits());
            parcel.writeLong(this.f7639f.getLeastSignificantBits());
            parcel.writeString(this.f7634a);
            parcel.writeString(this.f7635b);
            parcel.writeByteArray(this.f7636c);
            parcel.writeByte(this.f7637d ? (byte) 1 : (byte) 0);
        }

        private a(UUID uuid, String str, byte[] bArr, byte b9) {
            this(uuid, (String) null, str, bArr);
        }

        public final boolean a(UUID uuid) {
            return com.anythink.basead.exoplayer.b.bh.equals(this.f7639f) || uuid.equals(this.f7639f);
        }

        private a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f7639f = (UUID) com.anythink.basead.exoplayer.k.a.a(uuid);
            this.f7634a = str;
            this.f7635b = (String) com.anythink.basead.exoplayer.k.a.a(str2);
            this.f7636c = bArr;
            this.f7637d = false;
        }

        public final boolean a() {
            return this.f7636c != null;
        }

        public a(Parcel parcel) {
            this.f7639f = new UUID(parcel.readLong(), parcel.readLong());
            this.f7634a = parcel.readString();
            this.f7635b = parcel.readString();
            this.f7636c = parcel.createByteArray();
            this.f7637d = parcel.readByte() != 0;
        }
    }

    public e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    public static e a(e eVar, e eVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            str = eVar.f7630a;
            for (a aVar : eVar.f7632c) {
                if (aVar.a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (eVar2 != null) {
            if (str == null) {
                str = eVar2.f7630a;
            }
            int size = arrayList.size();
            for (a aVar2 : eVar2.f7632c) {
                if (aVar2.a() && !a(arrayList, size, aVar2.f7639f)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e(str, arrayList);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        UUID uuid = com.anythink.basead.exoplayer.b.bh;
        return uuid.equals(aVar3.f7639f) ? uuid.equals(aVar4.f7639f) ? 0 : 1 : aVar3.f7639f.compareTo(aVar4.f7639f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (af.a((Object) this.f7630a, (Object) eVar.f7630a) && Arrays.equals(this.f7632c, eVar.f7632c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7633d == 0) {
            String str = this.f7630a;
            this.f7633d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7632c);
        }
        return this.f7633d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7630a);
        parcel.writeTypedArray(this.f7632c, 0);
    }

    private e(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    private e(a... aVarArr) {
        this((String) null, aVarArr);
    }

    private e(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    private e(String str, boolean z6, a... aVarArr) {
        this.f7630a = str;
        aVarArr = z6 ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f7632c = aVarArr;
        this.f7631b = aVarArr.length;
    }

    public e(Parcel parcel) {
        this.f7630a = parcel.readString();
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f7632c = aVarArr;
        this.f7631b = aVarArr.length;
    }

    @Deprecated
    private a a(UUID uuid) {
        for (a aVar : this.f7632c) {
            if (aVar.a(uuid)) {
                return aVar;
            }
        }
        return null;
    }

    public final a a(int i) {
        return this.f7632c[i];
    }

    public final e a(String str) {
        return af.a((Object) this.f7630a, (Object) str) ? this : new e(str, false, this.f7632c);
    }

    private static int a(a aVar, a aVar2) {
        UUID uuid = com.anythink.basead.exoplayer.b.bh;
        if (uuid.equals(aVar.f7639f)) {
            return uuid.equals(aVar2.f7639f) ? 0 : 1;
        }
        return aVar.f7639f.compareTo(aVar2.f7639f);
    }

    private static boolean a(ArrayList<a> arrayList, int i, UUID uuid) {
        for (int i4 = 0; i4 < i; i4++) {
            if (arrayList.get(i4).f7639f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
