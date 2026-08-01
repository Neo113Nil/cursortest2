package f0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q extends D1.j implements C1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i) {
        super(0);
        this.f2960b = i;
        this.f2961c = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, t1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t1.b] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, t1.b] */
    @Override // C1.a
    public final Object c() {
        List list;
        switch (this.f2960b) {
            case 0:
                t1.d dVar = (t1.d) this.f2961c.j.getValue();
                return (dVar == null || (list = (List) dVar.f4378a) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f2961c.f2966a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                D1.i.b(fragment);
                s.a(fragment, arrayList, sb);
                String sb2 = sb.toString();
                D1.i.d(sb2, "fragRegex.toString()");
                return new t1.d(arrayList, sb2);
            case 2:
                String str2 = (String) this.f2961c.f2974l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                t1.d dVar2 = (t1.d) this.f2961c.j.getValue();
                if (dVar2 != null) {
                    return (String) dVar2.f4379b;
                }
                return null;
            case 4:
                String str3 = this.f2961c.f2966a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                String str4 = this.f2961c.f2976n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.f2961c.e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                s sVar = this.f2961c;
                sVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) sVar.f2971g.getValue()).booleanValue()) {
                    String str6 = sVar.f2966a;
                    Uri parse = Uri.parse(str6);
                    for (String str7 : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str7);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str8 = (String) u1.g.N(queryParameters);
                        if (str8 == null) {
                            sVar.i = true;
                            str8 = str7;
                        }
                        Matcher matcher = s.f2965r.matcher(str8);
                        C0151p c0151p = new C0151p();
                        int i = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            D1.i.c(group, "null cannot be cast to non-null type kotlin.String");
                            c0151p.f2959b.add(group);
                            D1.i.d(str8, "queryParam");
                            String substring = str8.substring(i, matcher.start());
                            D1.i.d(substring, "substring(...)");
                            sb3.append(Pattern.quote(substring));
                            sb3.append("(.+?)?");
                            i = matcher.end();
                        }
                        if (i < str8.length()) {
                            String substring2 = str8.substring(i);
                            D1.i.d(substring2, "substring(...)");
                            sb3.append(Pattern.quote(substring2));
                        }
                        String sb4 = sb3.toString();
                        D1.i.d(sb4, "argRegex.toString()");
                        c0151p.f2958a = K1.l.f0(sb4, ".*", "\\E.*\\Q");
                        D1.i.d(str7, "paramName");
                        linkedHashMap.put(str7, c0151p);
                    }
                }
                return linkedHashMap;
        }
    }
}
