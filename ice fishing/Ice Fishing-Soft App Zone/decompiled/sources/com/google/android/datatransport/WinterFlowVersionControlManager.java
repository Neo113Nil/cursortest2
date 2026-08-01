package com.google.android.datatransport;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlManager {
    public static final String[] WinterFlowCacheManagerAgent = {"*", "FCM", "GCM", ""};
    public final String WinterFlowHookDataSource;
    public final SharedPreferences WinterFlowRouterStructure;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowVersionControlManager(com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent) {
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        this.WinterFlowRouterStructure = winterFlowSyntaxEvent.WinterFlowRouterStructure.getSharedPreferences("com.google.android.gms.appid", 0);
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowMapperEngine winterFlowMapperEngine = winterFlowSyntaxEvent.WinterFlowCacheManagerAgent;
        String str = winterFlowMapperEngine.WinterFlowVariableVersionControl;
        if (str == null) {
            winterFlowSyntaxEvent.WinterFlowRouterStructure();
            str = winterFlowMapperEngine.WinterFlowHookDataSource;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.WinterFlowHookDataSource = str;
    }

    public final String WinterFlowRouterStructure() {
        PublicKey publicKey;
        synchronized (this.WinterFlowRouterStructure) {
            String str = null;
            String string = this.WinterFlowRouterStructure.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return str;
        }
    }
}
