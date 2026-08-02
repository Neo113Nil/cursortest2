package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qst {
    public static final List l = Arrays.asList("firebase_", "ga_", "google_");
    public static final List m = Arrays.asList("first_open", "in_app_purchase", "error", "user_engagement", "session_start", "app_update", "app_remove", "os_update", "app_clear_data", "notification_foreground", "notification_receive", "notification_open", "notification_dismiss", "notification_send", "app_exception", "dynamic_link_first_open", "dynamic_link_app_open", "dynamic_link_app_update", "app_install", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "app_upgrade", "screen_view", "first_visit");
    public static final List n = Arrays.asList("api_wrapper");
    public static final List o = Arrays.asList("first_open_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "first_visit_time", "lifetime_user_engagement", "session_number", "session_id");
    public final AtomicReference a;
    public final ThreadPoolExecutor b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public qst(String str, String str2, String str3, String str4) {
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.a = new AtomicReference();
        this.c = map;
        this.d = map;
        this.e = map;
        this.f = list;
        this.g = list;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(1000), new ost(this));
        this.b = threadPoolExecutor;
        threadPoolExecutor.execute(new mbs(3, this));
    }

    public static boolean a(int i, String str, List list) {
        return b(str) && str.codePointCount(0, str.length()) <= i && !list.contains(str);
    }

    public static boolean b(String str) {
        if (str.length() != 0) {
            Iterator it = l.iterator();
            while (it.hasNext()) {
                if (str.startsWith((String) it.next())) {
                    return false;
                }
            }
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= str.length()) {
                    return true;
                }
                int codePointAt = str.codePointAt(i);
                if (i == 0) {
                    z = Character.isLetter(codePointAt);
                } else if (!Character.isLetterOrDigit(codePointAt) && codePointAt != 95) {
                    z = false;
                }
                if (!z) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0164 A[EDGE_INSN: B:40:0x0164->B:41:0x0164 BREAK  A[LOOP:0: B:12:0x0036->B:44:0x0036], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, HashMap hashMap) {
        String valueOf;
        if (this.f.contains(str)) {
            return;
        }
        Map map = this.c;
        if (map.containsKey(str)) {
            str = (String) map.get(str);
        }
        String d = d(str, this.j, m);
        if (d == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("api_wrapper", this.h);
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                String str2 = (String) entry.getKey();
                if (this.g.contains(str2)) {
                    continue;
                } else {
                    Map map2 = this.d;
                    if (map2.containsKey(str2)) {
                        str2 = (String) map2.get(str2);
                    }
                    String d2 = d(str2, this.k, n);
                    if (d2 == null) {
                        continue;
                    } else {
                        Object value = entry.getValue();
                        if (!(value instanceof Float)) {
                            if (!(value instanceof Double)) {
                                if (!(value instanceof Byte)) {
                                    if (!(value instanceof Short)) {
                                        if (!(value instanceof Integer)) {
                                            if (!(value instanceof Long)) {
                                                valueOf = ((value instanceof Character) || (value instanceof String) || (value instanceof CharSequence)) ? String.valueOf(value) : value instanceof float[] ? Arrays.toString((float[]) value) : value instanceof double[] ? Arrays.toString((double[]) value) : value instanceof byte[] ? Arrays.toString((byte[]) value) : value instanceof short[] ? Arrays.toString((short[]) value) : value instanceof int[] ? Arrays.toString((int[]) value) : value instanceof long[] ? Arrays.toString((long[]) value) : value instanceof char[] ? Arrays.toString((char[]) value) : value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
                                                if (valueOf != null) {
                                                    if (valueOf.isEmpty()) {
                                                        valueOf = "";
                                                    } else if (valueOf.codePointCount(0, valueOf.length()) > 100) {
                                                        valueOf = valueOf.substring(0, valueOf.offsetByCodePoints(0, 100));
                                                    }
                                                    bundle.putString(d2, valueOf);
                                                }
                                                if (bundle.size() < 25) {
                                                    break;
                                                }
                                            } else {
                                                bundle.putLong(d2, ((Long) value).longValue());
                                            }
                                        } else {
                                            bundle.putLong(d2, ((Integer) value).longValue());
                                        }
                                    } else {
                                        bundle.putLong(d2, ((Short) value).longValue());
                                    }
                                } else {
                                    bundle.putLong(d2, ((Byte) value).longValue());
                                }
                            } else {
                                bundle.putDouble(d2, ((Double) value).doubleValue());
                            }
                        } else {
                            bundle.putDouble(d2, ((Float) value).doubleValue());
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        if (bundle.size() < 25) {
                        }
                    }
                }
            }
        }
        this.b.execute(new w1l(1, this, d, bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r12.contains(r11.toString()) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d(String str, String str2, List list) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        boolean isLetter = Character.isLetter(str.codePointAt(0));
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (Character.isLetterOrDigit(codePointAt) || codePointAt == 95) {
                sb.appendCodePoint(codePointAt);
                z |= codePointAt != 95;
                z2 = true;
            } else if (z2) {
                sb.append('_');
                z2 = false;
            }
            i += Character.charCount(codePointAt);
        }
        if (!z) {
            return null;
        }
        if (isLetter) {
            String sb2 = sb.toString();
            Iterator it = l.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (sb2.startsWith((String) it.next())) {
                        break;
                    }
                }
            }
        }
        sb.insert(0, this.i);
        String sb3 = sb.toString();
        return sb3.isEmpty() ? "" : sb3.codePointCount(0, sb3.length()) > 40 ? sb3.substring(0, sb3.offsetByCodePoints(0, 40)) : sb3;
    }
}
