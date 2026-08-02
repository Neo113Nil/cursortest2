package ru.CryptoPro.ssl.util;

import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import defpackage.ny61;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class DisabledAlgorithmConstraints extends AbstractAlgorithmConstraints {
    public static final String PROPERTY_CERTPATH_DISABLED_ALGS = "jdk.certpath.disabledAlgorithms";
    public static final String PROPERTY_TLS_DISABLED_ALGS = "jdk.tls.disabledAlgorithms";
    public static final HashMap d = new HashMap();
    public static final HashMap e = new HashMap();
    public final String[] b;
    public final KeySizeConstraints c;

    /* renamed from: ru.CryptoPro.ssl.util.DisabledAlgorithmConstraints$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KeySizeConstraint.Operator.values().length];
            a = iArr;
            try {
                iArr[KeySizeConstraint.Operator.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[KeySizeConstraint.Operator.NE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[KeySizeConstraint.Operator.LT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[KeySizeConstraint.Operator.LE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[KeySizeConstraint.Operator.GT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[KeySizeConstraint.Operator.GE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class KeySizeConstraint {
        public final int a;
        public final int b;
        public final int c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Operator {
            public static final Operator EQ;
            public static final Operator GE;
            public static final Operator GT;
            public static final Operator LE;
            public static final Operator LT;
            public static final Operator NE;
            private static final /* synthetic */ Operator[] a;

            static {
                Operator operator = new Operator("EQ", 0);
                EQ = operator;
                Operator operator2 = new Operator("NE", 1);
                NE = operator2;
                Operator operator3 = new Operator("LT", 2);
                LT = operator3;
                Operator operator4 = new Operator("LE", 3);
                LE = operator4;
                Operator operator5 = new Operator(AddCardInfo.PROVIDER_GEMALTO, 4);
                GT = operator5;
                Operator operator6 = new Operator("GE", 5);
                GE = operator6;
                a = new Operator[]{operator, operator2, operator3, operator4, operator5, operator6};
            }

            public static Operator valueOf(String str) {
                return (Operator) Enum.valueOf(Operator.class, str);
            }

            public static Operator[] values() {
                return (Operator[]) a.clone();
            }
        }

        public KeySizeConstraint(Operator operator, int i) {
            this.c = -1;
            switch (AnonymousClass1.a[operator.ordinal()]) {
                case 1:
                    this.a = 0;
                    this.b = Integer.MAX_VALUE;
                    this.c = i;
                    break;
                case 2:
                    this.a = i;
                    this.b = i;
                    break;
                case 3:
                    this.a = i;
                    this.b = Integer.MAX_VALUE;
                    break;
                case 4:
                    this.a = i + 1;
                    this.b = Integer.MAX_VALUE;
                    break;
                case 5:
                    this.a = 0;
                    this.b = i;
                    break;
                case 6:
                    this.a = 0;
                    this.b = i > 1 ? i - 1 : 0;
                    break;
                default:
                    this.a = Integer.MAX_VALUE;
                    this.b = -1;
                    break;
            }
        }

        public boolean disables(Key key) {
            int keySize = KeyUtil.getKeySize(key);
            if (keySize == 0) {
                return true;
            }
            if (keySize > 0) {
                return keySize < this.a || keySize > this.b || this.c == keySize;
            }
            return false;
        }
    }

    public static class KeySizeConstraints {
        public static final Pattern b = Pattern.compile("(\\S+)\\s+keySize\\s*(<=|<|==|!=|>|>=)\\s*(\\d+)");
        public final Map a = Collections.synchronizedMap(new HashMap());

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0075, code lost:
        
            if (r7.equals(">") == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public KeySizeConstraints(String[] strArr) {
            KeySizeConstraint.Operator operator;
            for (String str : strArr) {
                if (str != null && !str.isEmpty()) {
                    Matcher matcher = b.matcher(str);
                    if (matcher.matches()) {
                        char c = 1;
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        group2.getClass();
                        switch (group2.hashCode()) {
                            case 60:
                                if (group2.equals("<")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 62:
                                break;
                            case 1084:
                                if (group2.equals("!=")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1921:
                                if (group2.equals("<=")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1952:
                                if (group2.equals("==")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1983:
                                if (group2.equals(">=")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                operator = KeySizeConstraint.Operator.LT;
                                break;
                            case 1:
                                operator = KeySizeConstraint.Operator.GT;
                                break;
                            case 2:
                                operator = KeySizeConstraint.Operator.NE;
                                break;
                            case 3:
                                operator = KeySizeConstraint.Operator.LE;
                                break;
                            case 4:
                                operator = KeySizeConstraint.Operator.EQ;
                                break;
                            case 5:
                                operator = KeySizeConstraint.Operator.GE;
                                break;
                            default:
                                ny61.g(group2.concat(" is not a legal Operator"));
                                throw null;
                        }
                        int parseInt = Integer.parseInt(matcher.group(3));
                        String lowerCase = group.toLowerCase(Locale.ENGLISH);
                        synchronized (this.a) {
                            try {
                                if (!this.a.containsKey(lowerCase)) {
                                    this.a.put(lowerCase, new HashSet());
                                }
                                ((Set) this.a.get(lowerCase)).add(new KeySizeConstraint(operator, parseInt));
                            } finally {
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        public boolean disables(Key key) {
            String lowerCase = key.getAlgorithm().toLowerCase(Locale.ENGLISH);
            synchronized (this.a) {
                try {
                    if (this.a.containsKey(lowerCase)) {
                        Iterator it = ((Set) this.a.get(lowerCase)).iterator();
                        while (it.hasNext()) {
                            if (((KeySizeConstraint) it.next()).disables(key)) {
                                return true;
                            }
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public DisabledAlgorithmConstraints(String str, AlgorithmDecomposer algorithmDecomposer) {
        super(algorithmDecomposer);
        KeySizeConstraints keySizeConstraints;
        String[] b = AbstractAlgorithmConstraints.b(str, d);
        this.b = b;
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new KeySizeConstraints(b));
                }
                keySizeConstraints = (KeySizeConstraints) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = keySizeConstraints;
    }

    public boolean checkProperty(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        for (String str2 : this.b) {
            if (str2.toLowerCase(Locale.ENGLISH).indexOf(lowerCase) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(Set set, String str, Key key, AlgorithmParameters algorithmParameters) {
        if (key != null) {
            return (str.length() == 0 || permits(set, str, algorithmParameters)) && permits(set, key.getAlgorithm(), null) && !this.c.disables(key);
        }
        ny61.g("The key cannot be null");
        return false;
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, AlgorithmParameters algorithmParameters) {
        if (str == null || str.length() == 0) {
            ny61.g("No algorithm name specified");
            return false;
        }
        if (str.equalsIgnoreCase("TLSv1") || str.equalsIgnoreCase("TLSv1.1") || str.equalsIgnoreCase("TLSv1.2")) {
            return true;
        }
        return AbstractAlgorithmConstraints.a(this.b, str, this.a);
    }

    public DisabledAlgorithmConstraints(String str) {
        this(str, new AlgorithmDecomposer());
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, Key key, AlgorithmParameters algorithmParameters) {
        if (str != null && str.length() != 0) {
            return d(set, str, key, algorithmParameters);
        }
        ny61.g("No algorithm name specified");
        return false;
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, Key key) {
        return d(set, "", key, null);
    }
}
