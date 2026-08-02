package ru.CryptoPro.JCP.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.pref.BundleChooser;

/* loaded from: classes4.dex */
public class BioRandomConsole extends AbstractBioRandom {
    public static final ResourceBundle x = BundleChooser.getDefaultBundle(BundleChooser.EXRES_NAME);
    public boolean v = false;
    public final Object w = new Object();

    public static void main(String[] strArr) {
        AbstractBioRandom.setDefaultBioRandom(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
    
        r1 = r14.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        r14.v = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0042, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        r14.i();
     */
    @Override // ru.CryptoPro.JCP.Random.AbstractBioRandom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized RandomInterface getBioRandom(int i) {
        BioRandomConsole bioRandomConsole;
        Throwable th;
        try {
            PrintStream printStream = System.out;
            x.getString("pressEnterOrESCforCancel");
            printStream.getClass();
            int i2 = ((i / 44) * 93) + (i % 44 == 0 ? 0 : 93);
            int i3 = (i2 * 2) + 10;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            c(i2);
            boolean z = true;
            int i4 = 0;
            while (true) {
                if (!z) {
                    break;
                }
                try {
                    if (bufferedReader.readLine().equalsIgnoreCase("esc")) {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            bioRandomConsole = this;
                            throw th;
                        }
                    }
                    bioRandomConsole = this;
                    try {
                        int a = bioRandomConsole.a(0, 0, System.currentTimeMillis(), System.currentTimeMillis(), false);
                        if (a == -1) {
                            bioRandomConsole.i();
                            z = false;
                        } else {
                            int i5 = (a * 100) / i3;
                            if (i5 >= i4 + 5) {
                                PrintStream printStream2 = System.out;
                                ResourceBundle resourceBundle = x;
                                resourceBundle.getString("alreadyEntered.1");
                                resourceBundle.getString("alreadyEntered.2");
                                printStream2.getClass();
                                i4 = i5;
                            }
                            try {
                                Thread.sleep(20L);
                            } catch (InterruptedException unused) {
                                throw new RandomRefuseException(CertifiedRandom.EXCEPTION_TEXT);
                            }
                        }
                        this = bioRandomConsole;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                } catch (IOException unused2) {
                    throw new RandomRefuseException(CertifiedRandom.EXCEPTION_TEXT);
                }
            }
            bioRandomConsole = this;
            byte[] g = bioRandomConsole.g(i);
            bioRandomConsole.b();
            synchronized (bioRandomConsole.w) {
                if (bioRandomConsole.v || g.length != i) {
                    throw new CancelException();
                }
            }
            Seeder seeder = new Seeder(g, 64);
            return seeder;
        } catch (Throwable th4) {
            th = th4;
            bioRandomConsole = this;
        }
    }
}
