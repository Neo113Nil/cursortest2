package ru.rt.ebs.cryptosdk.core.networkClient.entities;

import defpackage.b64;
import defpackage.jl40;
import defpackage.m2a1;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMultipartBodyPart;", "", "name", "", "type", "inputStream", "Ljava/io/InputStream;", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "getInputStream", "()Ljava/io/InputStream;", "getFilename", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NetworkClientMultipartBodyPart {
    private final String filename;
    private final InputStream inputStream;
    private final String name;
    private final String type;

    public NetworkClientMultipartBodyPart(String str, String str2, InputStream inputStream, String str3) {
        this.name = str;
        this.type = str2;
        this.inputStream = inputStream;
        this.filename = str3;
    }

    public static /* synthetic */ NetworkClientMultipartBodyPart copy$default(NetworkClientMultipartBodyPart networkClientMultipartBodyPart, String str, String str2, InputStream inputStream, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkClientMultipartBodyPart.name;
        }
        if ((i & 2) != 0) {
            str2 = networkClientMultipartBodyPart.type;
        }
        if ((i & 4) != 0) {
            inputStream = networkClientMultipartBodyPart.inputStream;
        }
        if ((i & 8) != 0) {
            str3 = networkClientMultipartBodyPart.filename;
        }
        return networkClientMultipartBodyPart.copy(str, str2, inputStream, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final InputStream getInputStream() {
        return this.inputStream;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    public final NetworkClientMultipartBodyPart copy(String name, String type, InputStream inputStream, String filename) {
        return new NetworkClientMultipartBodyPart(name, type, inputStream, filename);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkClientMultipartBodyPart)) {
            return false;
        }
        NetworkClientMultipartBodyPart networkClientMultipartBodyPart = (NetworkClientMultipartBodyPart) other;
        return jl40.l(this.name, networkClientMultipartBodyPart.name) && jl40.l(this.type, networkClientMultipartBodyPart.type) && jl40.l(this.inputStream, networkClientMultipartBodyPart.inputStream) && jl40.l(this.filename, networkClientMultipartBodyPart.filename);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final InputStream getInputStream() {
        return this.inputStream;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.inputStream.hashCode() + m2a1.a(this.type, this.name.hashCode() * 31)) * 31;
        String str = this.filename;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.name;
        String str2 = this.type;
        InputStream inputStream = this.inputStream;
        String str3 = this.filename;
        StringBuilder v = b64.v("NetworkClientMultipartBodyPart(name=", str, ", type=", str2, ", inputStream=");
        v.append(inputStream);
        v.append(", filename=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ NetworkClientMultipartBodyPart(String str, String str2, InputStream inputStream, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, inputStream, (i & 8) != 0 ? null : str3);
    }
}
