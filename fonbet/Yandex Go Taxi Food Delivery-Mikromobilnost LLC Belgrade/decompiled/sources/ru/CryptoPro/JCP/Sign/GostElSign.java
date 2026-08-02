package ru.CryptoPro.JCP.Sign;

/* loaded from: classes4.dex */
public class GostElSign extends a {
    public GostElSign() {
        this("GOST3411withGOST3410EL");
    }

    public GostElSign(String str) {
        super(str, "GenGOST");
    }
}
