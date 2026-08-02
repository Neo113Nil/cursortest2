package app.cash.zipline.loader;

import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.internal.SignaturePayloadKt;
import app.cash.zipline.loader.internal.EcdsaP256Kt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzf;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.text.StringsKt__IndentKt;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ManifestVerifier {
    public final boolean doSignatureChecks;
    public final Map verifiers;

    public final class Verifier {
        public final zzf algorithm;
        public final ByteString trustedKey;

        public Verifier(zzf zzfVar, ByteString byteString) {
            zzfVar.getClass();
            this.algorithm = zzfVar;
            this.trustedKey = byteString;
        }
    }

    static {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        new ManifestVerifier(emptyMap, false);
    }

    public ManifestVerifier(Map map, boolean z) {
        this.doSignatureChecks = z;
        this.verifiers = map;
        if (z && map.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("verifier requires at least one trusted key");
            throw null;
        }
    }

    public final String verify(ByteString byteString, ZiplineManifest ziplineManifest) {
        String str;
        String str2;
        Verifier verifier;
        boolean z;
        ziplineManifest.getClass();
        if (!this.doSignatureChecks) {
            return null;
        }
        String signaturePayload = SignaturePayloadKt.signaturePayload(byteString.utf8());
        ByteString.Companion companion = ByteString.Companion;
        ByteString encodeUtf8 = ByteString.Companion.encodeUtf8(signaturePayload);
        Iterator it = ziplineManifest.getSignatures().entrySet().iterator();
        do {
            boolean hasNext = it.hasNext();
            Map map = this.verifiers;
            if (!hasNext) {
                a$$ExternalSyntheticBUOutline0.m$1(StringsKt__IndentKt.trimMargin$default("\n      |no keys in the manifest were recognized for signature verification!\n      |  trusted keys: " + map.keySet() + "\n      |  manifest keys: " + ziplineManifest.getSignatures().keySet() + "\n      "));
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            str = (String) entry.getKey();
            str2 = (String) entry.getValue();
            verifier = (Verifier) map.get(str);
        } while (verifier == null);
        zzf zzfVar = verifier.algorithm;
        ByteString.Companion companion2 = ByteString.Companion;
        ByteString decodeHex = ByteString.Companion.decodeHex(str2);
        ByteString byteString2 = verifier.trustedKey;
        zzfVar.getClass();
        ECPublicKey decodeAnsiX963 = EcdsaP256Kt.decodeAnsiX963(byteString2);
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initVerify(decodeAnsiX963);
            signature.update(encodeUtf8.toByteArray());
            z = signature.verify(decodeHex.toByteArray());
        } catch (SignatureException unused) {
            z = false;
        }
        if (z) {
            return str;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("manifest signature for key ", str, " did not verify!"));
        return null;
    }
}
