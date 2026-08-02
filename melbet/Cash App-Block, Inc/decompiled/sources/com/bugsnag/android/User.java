package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class User implements JsonStream.Streamable {
    public static final Companion Companion = new Companion();
    public final String email;
    public final String id;
    public final String name;

    public final class Companion {
    }

    public User(String str, String str2, String str3) {
        this.id = str;
        this.email = str2;
        this.name = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!User.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        User user = (User) obj;
        return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.name, user.name);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("id");
        jsonStream.value(this.id);
        jsonStream.name("email");
        jsonStream.value(this.email);
        jsonStream.name("name");
        jsonStream.value(this.name);
        jsonStream.endObject();
    }
}
