package M;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1796b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f1797c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1798d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1799e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1800a;

    static {
        h hVar = i.f1810c;
        f1796b = Character.toString((char) 8206);
        f1797c = Character.toString((char) 8207);
        f1798d = new b(false);
        f1799e = new b(true);
    }

    public b(boolean z6) {
        h hVar = i.f1808a;
        this.f1800a = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.f1794c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f1794c = 0;
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        while (true) {
            int i9 = aVar.f1794c;
            if (i9 < aVar.f1793b && i == 0) {
                CharSequence charSequence2 = aVar.f1792a;
                char charAt = charSequence2.charAt(i9);
                aVar.f1795d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f1794c);
                    aVar.f1794c = Character.charCount(codePointAt) + aVar.f1794c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f1794c++;
                    char c9 = aVar.f1795d;
                    directionality = c9 < 1792 ? a.f1791e[c9] : Character.getDirectionality(c9);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i6 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i6++;
                                i4 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i4 = 1;
                                continue;
                            case 18:
                                i6--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                }
                i = i6;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f1794c = aVar.f1793b;
        int i = 0;
        while (true) {
            int i4 = i;
            while (aVar.f1794c > 0) {
                byte a9 = aVar.a();
                if (a9 != 0) {
                    if (a9 == 1 || a9 == 2) {
                        if (i != 0) {
                            if (i4 == 0) {
                                break;
                            }
                        }
                    } else if (a9 != 9) {
                        switch (a9) {
                            case 14:
                            case 15:
                                if (i4 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i4 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i4 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i4 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        h hVar = i.f1810c;
        if (charSequence == null) {
            return null;
        }
        boolean f2 = hVar.f(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean f9 = (f2 ? i.f1809b : i.f1808a).f(charSequence, charSequence.length());
        String str = "";
        String str2 = f1797c;
        String str3 = f1796b;
        boolean z6 = this.f1800a;
        spannableStringBuilder.append((CharSequence) ((z6 || !(f9 || a(charSequence) == 1)) ? (!z6 || (f9 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (f2 != z6) {
            spannableStringBuilder.append(f2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean f10 = (f2 ? i.f1809b : i.f1808a).f(charSequence, charSequence.length());
        if (!z6 && (f10 || b(charSequence) == 1)) {
            str = str3;
        } else if (z6 && (!f10 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
