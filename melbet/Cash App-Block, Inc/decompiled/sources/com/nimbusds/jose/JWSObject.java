package com.nimbusds.jose;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class JWSObject extends JOSEObject {
    public final JWSHeader header;
    public final Base64URL signature;
    public final String signingInputString;
    public final AtomicReference state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State SIGNED;
        public static final State VERIFIED;

        /* JADX INFO: Fake field, exist only in values array */
        State EF0;

        static {
            State state = new State("UNSIGNED", 0);
            State state2 = new State("SIGNED", 1);
            SIGNED = state2;
            State state3 = new State("VERIFIED", 2);
            VERIFIED = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public JWSObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
        String str;
        Base64URL base64URL4;
        Payload payload = new Payload(base64URL2);
        AtomicReference atomicReference = new AtomicReference();
        this.state = atomicReference;
        byte[] bArr = null;
        try {
            JWSHeader parse = JWSHeader.parse(base64URL);
            boolean z = parse.b64;
            this.header = parse;
            this.payload = payload;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(parse.toBase64URL().value);
                sb.append('.');
                Payload payload2 = this.payload;
                Base64URL base64URL5 = payload2.base64URL;
                if (base64URL5 == null) {
                    byte[] bArr2 = payload2.bytes;
                    if (bArr2 == null) {
                        if (base64URL5 != null) {
                            bArr2 = base64URL5.decode();
                        } else {
                            String payload3 = payload2.toString();
                            bArr2 = payload3 != null ? payload3.getBytes(StandardCharset.UTF_8) : null;
                        }
                    }
                    base64URL5 = Base64URL.encode(bArr2);
                }
                sb.append(base64URL5.value);
                str = sb.toString();
            } else {
                str = parse.toBase64URL().value + '.' + this.payload.toString();
            }
            this.signingInputString = str;
            if (base64URL3.value.trim().isEmpty()) {
                JWK$$ExternalSyntheticBUOutline0.m$1("The signature must not be empty");
                throw null;
            }
            this.signature = base64URL3;
            atomicReference.set(State.SIGNED);
            if (z && (base64URL4 = payload.base64URL) == null) {
                if (base64URL4 != null) {
                    bArr = base64URL4.decode();
                } else {
                    String payload4 = payload.toString();
                    if (payload4 != null) {
                        bArr = payload4.getBytes(StandardCharset.UTF_8);
                    }
                }
                Base64URL.encode(bArr);
            }
        } catch (ParseException e) {
            JWK$$ExternalSyntheticBUOutline0.m$3(e.getMessage(), "Invalid JWS header: ");
            throw null;
        }
    }
}
