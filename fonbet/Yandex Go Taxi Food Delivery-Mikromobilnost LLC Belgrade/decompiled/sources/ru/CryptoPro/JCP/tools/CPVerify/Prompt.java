package ru.CryptoPro.JCP.tools.CPVerify;

import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.Encoder;

/* loaded from: classes4.dex */
public class Prompt {
    public static final String ACTION_ADD_STR = "-add";
    public static final String ACTION_CHECK_STR = "-check";
    public static final String ACTION_CREATE_STR = "-create";
    public static final String ACTION_DELETE_STR = "-delete";
    public static final String ACTION_GETDEF_STR = "-getdefault";
    public static final String ACTION_HELP_STR = "-help";
    public static final String ACTION_MAKE_STR = "-make";
    public static final String ACTION_PRINT_STR = "-print";
    public static final String ACTION_SETDEF_STR = "-setdefault";
    public static final String ACTION_VERIFY_STR = "-verify";
    public static final String FILES_ALL_STR = "-all";
    public static final String FILES_ONE_STR = "-file";
    public static final String REPOSITORY_DEF_STR = "-repdefault";
    public static final String REPOSITORY_FILE_STR = "-repfile";
    public static final String REPOSITORY_PREF_STR = "-reppref";
    public int a;
    public int b;
    public String c;
    public int d;
    public Vector e;
    public boolean f;
    public int[] g;
    public String[] h;
    public VerifyFactory i;

    public static String a(String str) {
        String trim = str.trim();
        if (trim.charAt(0) == '\'' && g8e.a(1, trim) == '\'') {
            trim = oyr.g(1, 1, trim);
        }
        return (trim.charAt(0) == '\"' && g8e.a(1, trim) == '\"') ? oyr.g(1, 1, trim) : trim;
    }

    public static void d() {
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
    }

    public static void e() {
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
        System.out.getClass();
    }

    public static void main(String[] strArr) {
        int i;
        String a;
        int i2;
        int length = strArr.length;
        int[] iArr = new int[length];
        Arrays.fill(iArr, 1);
        Prompt prompt = new Prompt();
        int i3 = 0;
        prompt.a = 0;
        prompt.b = 0;
        prompt.c = null;
        prompt.d = 0;
        prompt.e = new Vector(0);
        prompt.f = false;
        prompt.i = null;
        prompt.g = iArr;
        prompt.h = strArr;
        if (strArr.length > 0 && length > 0 && iArr[0] == 1) {
            if (strArr[0].trim().equalsIgnoreCase(ACTION_VERIFY_STR)) {
                prompt.a = 1;
            } else if (strArr[0].trim().equalsIgnoreCase(ACTION_MAKE_STR)) {
                prompt.a = 2;
            } else {
                if (strArr[0].trim().equalsIgnoreCase(ACTION_ADD_STR)) {
                    i2 = 3;
                } else if (strArr[0].trim().equalsIgnoreCase(ACTION_DELETE_STR)) {
                    prompt.a = 4;
                } else if (strArr[0].trim().equalsIgnoreCase(ACTION_CREATE_STR)) {
                    i2 = 5;
                } else if (strArr[0].trim().equalsIgnoreCase(ACTION_CHECK_STR)) {
                    i2 = 6;
                } else if (strArr[0].trim().equalsIgnoreCase(ACTION_SETDEF_STR)) {
                    i2 = 7;
                } else if (strArr[0].trim().equalsIgnoreCase(ACTION_GETDEF_STR)) {
                    i2 = 8;
                } else if (strArr[0].trim().equalsIgnoreCase(ACTION_PRINT_STR)) {
                    i2 = 9;
                } else if (strArr[0].trim().equalsIgnoreCase(ACTION_HELP_STR)) {
                    i2 = 10;
                }
                prompt.a = i2;
            }
        }
        if (prompt.a != 0) {
            iArr[0] = 2;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= strArr.length) {
                break;
            }
            if (iArr[i4] == 1) {
                if (strArr[i4].trim().equalsIgnoreCase(REPOSITORY_DEF_STR)) {
                    prompt.b = 1;
                    iArr[i4] = 2;
                    break;
                }
                if (strArr[i4].trim().equalsIgnoreCase(REPOSITORY_FILE_STR)) {
                    int i5 = i4 + 1;
                    if (strArr.length > i5 && iArr[i5] == 1) {
                        String a2 = a(strArr[i5]);
                        prompt.c = a2;
                        if (a2.length() != 0) {
                            iArr[i5] = 2;
                            iArr[i4] = 2;
                            prompt.b = 2;
                            break;
                        }
                    }
                } else if (strArr[i4].trim().equalsIgnoreCase(REPOSITORY_PREF_STR)) {
                    prompt.b = 4;
                    iArr[i4] = 2;
                    break;
                }
            }
            i4++;
        }
        loop1: while (true) {
            String[] strArr2 = prompt.h;
            int[] iArr2 = prompt.g;
            int i6 = 0;
            while (true) {
                if (i6 >= strArr2.length) {
                    break loop1;
                }
                if (iArr2[i6] == 1) {
                    if (strArr2[i6].trim().equalsIgnoreCase("-all")) {
                        prompt.d = 1;
                        iArr2[i6] = 2;
                        break loop1;
                    } else if (strArr2[i6].trim().equalsIgnoreCase(FILES_ONE_STR) && strArr2.length > (i = i6 + 1) && iArr2[i] == 1) {
                        a = a(strArr2[i]);
                        if (a.length() != 0) {
                            break;
                        }
                    }
                }
                i6++;
            }
            prompt.e.add(a);
            iArr2[i] = 2;
            iArr2[i6] = 2;
            prompt.d = 2;
        }
        int[] iArr3 = prompt.g;
        while (true) {
            String[] strArr3 = prompt.h;
            if (i3 < strArr3.length) {
                if (iArr3[i3] == 1 && strArr3[i3].trim().equalsIgnoreCase(ACTION_HELP_STR)) {
                    prompt.f = true;
                    iArr3[i3] = 2;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (prompt.a == 0) {
            e();
            return;
        }
        try {
            if (!prompt.f) {
                prompt.b();
            }
            prompt.c();
        } catch (IOException | RuntimeException unused) {
            System.out.getClass();
        } catch (CPVerifyException e) {
            PrintStream printStream = System.out;
            e.getLocalizedMessage();
            printStream.getClass();
        }
    }

    public final void b() {
        int i = 0;
        while (true) {
            int[] iArr = this.g;
            if (i >= iArr.length) {
                switch (this.a) {
                    case 0:
                        ny61.g("wrong action\n");
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                        int i2 = this.b;
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 != 1) {
                                    if (i2 == 0) {
                                        ny61.g("wrong repository\n");
                                        break;
                                    }
                                } else {
                                    this.i = new VerifyFactory(new DigestStoreDefault());
                                    break;
                                }
                            } else {
                                this.i = new VerifyFactory(new DigestStoreReg());
                                break;
                            }
                        } else {
                            this.i = new VerifyFactory(new DigestStoreFile(new File(this.c)));
                            break;
                        }
                        break;
                }
                return;
            }
            if (iArr[i] == 1) {
                ny61.g("wrong parametres\n");
                return;
            }
            i++;
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Vector vector = this.e;
        boolean z5 = this.f;
        int i = this.a;
        if (z5) {
            switch (i) {
                case 0:
                    ny61.g("wrong action\n");
                    break;
                case 1:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 2:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 3:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 4:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 5:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 6:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 7:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 8:
                    System.out.getClass();
                    break;
                case 9:
                    System.out.getClass();
                    System.out.getClass();
                    System.out.getClass();
                    d();
                    break;
                case 10:
                    System.out.getClass();
                    break;
            }
        }
        int i2 = 0;
        switch (i) {
            case 0:
                ny61.g("wrong action\n");
                break;
            case 1:
                VerifiedFileListElement[] filesFromStore = this.i.getFilesFromStore();
                int i3 = this.d;
                if (i3 == 2) {
                    for (int i4 = 0; i4 < vector.size(); i4++) {
                        File file = new File((String) vector.elementAt(i4));
                        int i5 = 0;
                        while (true) {
                            if (i5 >= filesFromStore.length) {
                                i5 = -1;
                                z = false;
                            } else if (filesFromStore[i5].getFile().getCanonicalFile().equals(file.getCanonicalFile())) {
                                z = true;
                            } else {
                                i5++;
                            }
                        }
                        if (z) {
                            VerifyFactory.verifyFile(filesFromStore[i5]);
                            VerifiedFileListElement verifiedFileListElement = filesFromStore[i5];
                            PrintStream printStream = System.out;
                            verifiedFileListElement.getDescriptionString();
                            printStream.getClass();
                        } else {
                            PrintStream printStream2 = System.out;
                            file.getCanonicalFile().toString();
                            printStream2.getClass();
                        }
                    }
                    break;
                } else if (i3 == 1) {
                    this.i.verifyAll();
                    VerifiedFileListElement[] files = this.i.getFiles();
                    while (i2 < files.length) {
                        VerifiedFileListElement verifiedFileListElement2 = files[i2];
                        PrintStream printStream3 = System.out;
                        verifiedFileListElement2.getDescriptionString();
                        printStream3.getClass();
                        i2++;
                    }
                    break;
                } else {
                    ny61.g("wrong file parameter\n");
                    break;
                }
            case 2:
                VerifiedFileListElement[] filesFromStore2 = this.i.getFilesFromStore();
                int i6 = this.d;
                if (i6 == 2) {
                    for (int i7 = 0; i7 < vector.size(); i7++) {
                        File file2 = new File((String) vector.elementAt(i7));
                        int i8 = 0;
                        while (true) {
                            if (i8 >= filesFromStore2.length) {
                                i8 = -1;
                                z2 = false;
                            } else if (filesFromStore2[i8].getFile().getCanonicalFile().equals(file2.getCanonicalFile())) {
                                z2 = true;
                            } else {
                                i8++;
                            }
                        }
                        if (!z2) {
                            PrintStream printStream4 = System.out;
                            file2.getCanonicalFile().toString();
                            printStream4.getClass();
                            break;
                        } else {
                            VerifyFactory.createDigest(filesFromStore2[i8]);
                        }
                    }
                    if (this.i.verifyAll()) {
                        this.i.save();
                        System.out.getClass();
                        break;
                    } else {
                        System.out.getClass();
                        break;
                    }
                } else if (i6 == 1) {
                    this.i.createAll();
                    VerifiedFileListElement[] files2 = this.i.getFiles();
                    while (i2 < files2.length) {
                        VerifiedFileListElement verifiedFileListElement3 = files2[i2];
                        PrintStream printStream5 = System.out;
                        verifiedFileListElement3.getDescriptionString();
                        printStream5.getClass();
                        i2++;
                    }
                    this.i.save();
                    System.out.getClass();
                    break;
                } else {
                    ny61.g("wrong file parameter\n");
                    break;
                }
            case 3:
                this.i.getFilesFromStore();
                if (this.d == 2) {
                    for (int i9 = 0; i9 < vector.size(); i9++) {
                        File file3 = new File((String) vector.elementAt(i9));
                        this.i.add(new File[]{file3});
                        VerifiedFileListElement[] files3 = this.i.getFiles();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= files3.length) {
                                i10 = -1;
                                z3 = false;
                            } else if (files3[i10].getFile().getCanonicalFile().equals(file3.getCanonicalFile())) {
                                z3 = true;
                            } else {
                                i10++;
                            }
                        }
                        if (!z3) {
                            System.out.getClass();
                            break;
                        } else {
                            VerifyFactory.createDigest(files3[i10]);
                        }
                    }
                    if (this.i.verifyAll()) {
                        this.i.save();
                        System.out.getClass();
                        break;
                    } else {
                        System.out.getClass();
                        break;
                    }
                } else {
                    ny61.g("wrong file parameter\n");
                    break;
                }
            case 4:
                VerifiedFileListElement[] filesFromStore3 = this.i.getFilesFromStore();
                int i11 = this.d;
                if (i11 == 2) {
                    int[] iArr = new int[0];
                    boolean z6 = true;
                    for (int i12 = 0; i12 < vector.size(); i12++) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= filesFromStore3.length) {
                                i13 = -1;
                                z4 = false;
                            } else if (filesFromStore3[i13].getFile().getCanonicalFile().equals(new File((String) vector.elementAt(i12)).getCanonicalFile())) {
                                z4 = true;
                            } else {
                                i13++;
                            }
                        }
                        if (z4) {
                            int[] iArr2 = new int[iArr.length + 1];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            iArr2[iArr.length] = i13;
                            iArr = iArr2;
                        } else {
                            System.out.getClass();
                            z6 = false;
                        }
                    }
                    if (z6) {
                        this.i.delete(iArr);
                        this.i.save();
                        break;
                    }
                } else if (i11 == 1) {
                    this.i.resetStore();
                    System.out.getClass();
                    break;
                } else {
                    ny61.g("wrong file parameter\n");
                    break;
                }
                break;
            case 5:
                this.i.resetStore();
                System.out.getClass();
                break;
            case 6:
                try {
                    this.i.getFilesFromStore();
                    System.out.getClass();
                    break;
                } catch (CPVerifyException e) {
                    PrintStream printStream6 = System.out;
                    e.getLocalizedMessage();
                    printStream6.getClass();
                    return;
                }
            case 7:
                if (this.b != 1) {
                    this.i.getFilesFromStore();
                    if (this.i.verifyAll()) {
                        int i14 = this.b;
                        if (i14 == 4) {
                            DigestStoreDefault.setPreferences();
                            break;
                        } else if (i14 == 2) {
                            DigestStoreDefault.setFileName(new File(this.c).getCanonicalFile().toString());
                            break;
                        }
                    }
                }
                break;
            case 8:
                if (DigestStoreDefault.isPreferences()) {
                    System.out.getClass();
                    break;
                } else if (DigestStoreDefault.isFile()) {
                    PrintStream printStream7 = System.out;
                    DigestStoreDefault.getFileName();
                    printStream7.getClass();
                    break;
                } else {
                    System.out.getClass();
                    break;
                }
            case 9:
                this.i.getFilesFromStore();
                this.i.verifyAll();
                VerifiedFileListElement[] files4 = this.i.getFiles();
                while (i2 < files4.length) {
                    VerifiedFileListElement verifiedFileListElement4 = files4[i2];
                    PrintStream printStream8 = System.out;
                    verifiedFileListElement4.getDescriptionString();
                    printStream8.getClass();
                    PrintStream printStream9 = System.out;
                    new Encoder().encode(verifiedFileListElement4.getDigest());
                    printStream9.getClass();
                    i2++;
                }
                break;
            case 10:
                e();
                break;
        }
    }
}
