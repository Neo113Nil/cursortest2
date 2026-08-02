package defpackage;

import java.util.Map;

/* loaded from: classes10.dex */
public interface xuu extends kpg {
    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    int getResponseCode();

    @Override // defpackage.kpg
    Map getResponseHeaders();

    void setRequestProperty(String str, String str2);
}
