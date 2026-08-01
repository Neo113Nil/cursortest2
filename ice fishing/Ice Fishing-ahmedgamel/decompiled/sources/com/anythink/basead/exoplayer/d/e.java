package com.anythink.basead.exoplayer.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

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
    public final String f6844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6845b;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f6846c;

    /* renamed from: d, reason: collision with root package name */
    private int f6847d;

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
        public final String f6848a;

        /* renamed from: b, reason: collision with root package name */
        public final String f6849b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f6850c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f6851d;

        /* renamed from: e, reason: collision with root package name */
        private int f6852e;

        /* renamed from: f, reason: collision with root package name */
        private final UUID f6853f;

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, (byte) 0);
        }

        private boolean b(a aVar) {
            return a() && !aVar.a() && a(aVar.f6853f);
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
            return af.a((Object) this.f6848a, (Object) aVar.f6848a) && af.a((Object) this.f6849b, (Object) aVar.f6849b) && af.a(this.f6853f, aVar.f6853f) && Arrays.equals(this.f6850c, aVar.f6850c);
        }

        public final int hashCode() {
            if (this.f6852e == 0) {
                int hashCode = this.f6853f.hashCode() * 31;
                String str = this.f6848a;
                this.f6852e = Arrays.hashCode(this.f6850c) + u1.h.k((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6849b);
            }
            return this.f6852e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f6853f.getMostSignificantBits());
            parcel.writeLong(this.f6853f.getLeastSignificantBits());
            parcel.writeString(this.f6848a);
            parcel.writeString(this.f6849b);
            parcel.writeByteArray(this.f6850c);
            parcel.writeByte(this.f6851d ? (byte) 1 : (byte) 0);
        }

        private a(UUID uuid, String str, byte[] bArr, byte b9) {
            this(uuid, (String) null, str, bArr);
        }

        public final boolean a(UUID uuid) {
            return com.anythink.basead.exoplayer.b.bh.equals(this.f6853f) || uuid.equals(this.f6853f);
        }

        private a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f6853f = (UUID) com.anythink.basead.exoplayer.k.a.a(uuid);
            this.f6848a = str;
            this.f6849b = (String) com.anythink.basead.exoplayer.k.a.a(str2);
            this.f6850c = bArr;
            this.f6851d = false;
        }

        public final boolean a() {
            return this.f6850c != null;
        }

        public a(Parcel parcel) {
            this.f6853f = new UUID(parcel.readLong(), parcel.readLong());
            this.f6848a = parcel.readString();
            this.f6849b = parcel.readString();
            this.f6850c = parcel.createByteArray();
            this.f6851d = parcel.readByte() != 0;
        }
    }

    public e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    public static e a(e eVar, e eVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            str = eVar.f6844a;
            for (a aVar : eVar.f6846c) {
                if (aVar.a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (eVar2 != null) {
            if (str == null) {
                str = eVar2.f6844a;
            }
            int size = arrayList.size();
            for (a aVar2 : eVar2.f6846c) {
                if (aVar2.a() && !a(arrayList, size, aVar2.f6853f)) {
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
        return uuid.equals(aVar3.f6853f) ? uuid.equals(aVar4.f6853f) ? 0 : 1 : aVar3.f6853f.compareTo(aVar4.f6853f);
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
            if (af.a((Object) this.f6844a, (Object) eVar.f6844a) && Arrays.equals(this.f6846c, eVar.f6846c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6847d == 0) {
            String str = this.f6844a;
            this.f6847d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6846c);
        }
        return this.f6847d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6844a);
        parcel.writeTypedArray(this.f6846c, 0);
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

    private e(String str, boolean z3, a... aVarArr) {
        this.f6844a = str;
        aVarArr = z3 ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f6846c = aVarArr;
        this.f6845b = aVarArr.length;
    }

    public e(Parcel parcel) {
        this.f6844a = parcel.readString();
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f6846c = aVarArr;
        this.f6845b = aVarArr.length;
    }

    @Deprecated
    private a a(UUID uuid) {
        for (a aVar : this.f6846c) {
            if (aVar.a(uuid)) {
                return aVar;
            }
        }
        return null;
    }

    public final a a(int i) {
        return this.f6846c[i];
    }

    public final e a(String str) {
        return af.a((Object) this.f6844a, (Object) str) ? this : new e(str, false, this.f6846c);
    }

    private static int a(a aVar, a aVar2) {
        UUID uuid = com.anythink.basead.exoplayer.b.bh;
        if (uuid.equals(aVar.f6853f)) {
            return uuid.equals(aVar2.f6853f) ? 0 : 1;
        }
        return aVar.f6853f.compareTo(aVar2.f6853f);
    }

    private static boolean a(ArrayList<a> arrayList, int i, UUID uuid) {
        for (int i6 = 0; i6 < i; i6++) {
            if (arrayList.get(i6).f6853f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
