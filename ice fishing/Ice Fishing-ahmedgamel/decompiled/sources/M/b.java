package M;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1765b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f1766c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1767d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1768e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1769a;

    static {
        L3.h hVar = h.f1777c;
        f1765b = Character.toString((char) 8206);
        f1766c = Character.toString((char) 8207);
        f1767d = new b(false);
        f1768e = new b(true);
    }

    public b(boolean z3) {
        L3.h hVar = h.f1775a;
        this.f1769a = z3;
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
    
        if (r0.f1763c <= 0) goto L63;
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
        aVar.f1763c = 0;
        int i = 0;
        int i6 = 0;
        int i9 = 0;
        while (true) {
            int i10 = aVar.f1763c;
            if (i10 < aVar.f1762b && i == 0) {
                CharSequence charSequence2 = aVar.f1761a;
                char charAt = charSequence2.charAt(i10);
                aVar.f1764d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f1763c);
                    aVar.f1763c = Character.charCount(codePointAt) + aVar.f1763c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f1763c++;
                    char c9 = aVar.f1764d;
                    directionality = c9 < 1792 ? a.f1760e[c9] : Character.getDirectionality(c9);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i9 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i9++;
                                i6 = -1;
                                continue;
                            case 16:
                            case 17:
                                i9++;
                                i6 = 1;
                                continue;
                            case 18:
                                i9--;
                                i6 = 0;
                                continue;
                        }
                    }
                } else if (i9 == 0) {
                }
                i = i9;
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
        aVar.f1763c = aVar.f1762b;
        int i = 0;
        while (true) {
            int i6 = i;
            while (aVar.f1763c > 0) {
                byte a9 = aVar.a();
                if (a9 != 0) {
                    if (a9 == 1 || a9 == 2) {
                        if (i != 0) {
                            if (i6 == 0) {
                                break;
                            }
                        }
                    } else if (a9 != 9) {
                        switch (a9) {
                            case 14:
                            case 15:
                                if (i6 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i6 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i6 != 0) {
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
                    if (i6 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        L3.h hVar = h.f1777c;
        if (charSequence == null) {
            return null;
        }
        boolean e9 = hVar.e(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean e10 = (e9 ? h.f1776b : h.f1775a).e(charSequence, charSequence.length());
        String str = "";
        String str2 = f1766c;
        String str3 = f1765b;
        boolean z3 = this.f1769a;
        spannableStringBuilder.append((CharSequence) ((z3 || !(e10 || a(charSequence) == 1)) ? (!z3 || (e10 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (e9 != z3) {
            spannableStringBuilder.append(e9 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean e11 = (e9 ? h.f1776b : h.f1775a).e(charSequence, charSequence.length());
        if (!z3 && (e11 || b(charSequence) == 1)) {
            str = str3;
        } else if (z3 && (!e11 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
