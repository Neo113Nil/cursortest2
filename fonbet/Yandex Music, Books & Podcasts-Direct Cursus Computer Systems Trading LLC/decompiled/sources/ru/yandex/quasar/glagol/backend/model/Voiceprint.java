package ru.yandex.quasar.glagol.backend.model;

import com.google.gson.annotations.SerializedName;
import defpackage.su4;

/* loaded from: classes6.dex */
public class Voiceprint {

    @SerializedName("method")
    private String method;

    @SerializedName("status")
    private String status;

    public String getMethod() {
        return this.method;
    }

    public String getStatus() {
        return this.status;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Voiceprint{status='");
        sb.append(this.status);
        sb.append("', method='");
        return su4.o(sb, this.method, "'}");
    }
}
