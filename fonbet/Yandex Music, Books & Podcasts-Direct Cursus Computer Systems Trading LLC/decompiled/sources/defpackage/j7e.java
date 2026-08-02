package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class j7e {
    public final x0o a;
    public final ds3 b;
    public final vj6 c;
    public final /* synthetic */ int d;
    public final gs3 e;

    public j7e(x0o x0oVar, ds3 ds3Var, vj6 vj6Var, gs3 gs3Var, int i) {
        this.d = i;
        this.a = x0oVar;
        this.b = ds3Var;
        this.c = vj6Var;
        this.e = gs3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        throw defpackage.jf0.P(r28, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j7e a(vao vaoVar, Method method) {
        Type genericReturnType;
        boolean z;
        p1g p1gVar;
        int i;
        int i2;
        int i3;
        p1g[] p1gVarArr;
        int i4;
        String str;
        p1g p1gVar2;
        p1g g6kVar;
        a6k a6kVar;
        a6k a6kVar2;
        w0o w0oVar = new w0o(vaoVar, method);
        Annotation[] annotationArr = w0oVar.c;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            String str2 = "HEAD";
            int i7 = 1;
            if (i6 >= length) {
                if (w0oVar.n == null) {
                    throw jf0.P(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!w0oVar.o) {
                    if (w0oVar.q) {
                        throw jf0.P(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (w0oVar.p) {
                        throw jf0.P(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = w0oVar.d;
                int length2 = annotationArr2.length;
                w0oVar.v = new p1g[length2];
                int i8 = length2 - 1;
                int i9 = 0;
                while (i9 < length2) {
                    p1g[] p1gVarArr2 = w0oVar.v;
                    Type type = w0oVar.e[i9];
                    Annotation[] annotationArr3 = annotationArr2[i9];
                    int i10 = i9 == i8 ? i7 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        p1gVar = null;
                        while (i5 < length3) {
                            Annotation annotation = annotationArr3[i5];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = i5;
                            if (annotation instanceof kpt) {
                                w0oVar.c(i9, type);
                                if (w0oVar.m) {
                                    throw jf0.R(method, i9, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (w0oVar.i) {
                                    throw jf0.R(method, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (w0oVar.j) {
                                    throw jf0.R(method, i9, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (w0oVar.k) {
                                    throw jf0.R(method, i9, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (w0oVar.l) {
                                    throw jf0.R(method, i9, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (w0oVar.r != null) {
                                    throw jf0.R(method, i9, "@Url cannot be used with @%s URL", w0oVar.n);
                                }
                                w0oVar.m = true;
                                if (type != u7e.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw jf0.R(method, i9, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                p1gVar2 = new f6k(method, i9, 2);
                                i = length2;
                            } else {
                                i = length2;
                                boolean z2 = annotation instanceof dak;
                                vao vaoVar2 = w0oVar.a;
                                if (z2) {
                                    w0oVar.c(i9, type);
                                    if (w0oVar.j) {
                                        throw jf0.R(method, i9, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (w0oVar.k) {
                                        throw jf0.R(method, i9, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (w0oVar.l) {
                                        throw jf0.R(method, i9, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (w0oVar.m) {
                                        throw jf0.R(method, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (w0oVar.r == null) {
                                        throw jf0.R(method, i9, "@Path can only be used with relative url on @%s", w0oVar.n);
                                    }
                                    w0oVar.i = true;
                                    dak dakVar = (dak) annotation;
                                    String value = dakVar.value();
                                    if (!w0o.y.matcher(value).matches()) {
                                        throw jf0.R(method, i9, "@Path parameter name must match %s. Found: %s", w0o.x.pattern(), value);
                                    }
                                    if (!w0oVar.u.contains(value)) {
                                        throw jf0.R(method, i9, "URL \"%s\" does not contain \"{%s}\".", w0oVar.r, value);
                                    }
                                    vaoVar2.e(type, annotationArr3);
                                    p1gVar2 = new h6k(w0oVar.b, i9, value, dakVar.encoded());
                                } else {
                                    i2 = length3;
                                    i3 = i8;
                                    if (annotation instanceof r6n) {
                                        w0oVar.c(i9, type);
                                        r6n r6nVar = (r6n) annotation;
                                        String value2 = r6nVar.value();
                                        boolean encoded = r6nVar.encoded();
                                        p1gVarArr = p1gVarArr2;
                                        Class I = jf0.I(type);
                                        i4 = i10;
                                        w0oVar.j = true;
                                        if (Iterable.class.isAssignableFrom(I)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw jf0.R(method, i9, I.getSimpleName() + " must include generic type (e.g., " + I.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            vaoVar2.e(jf0.H(0, (ParameterizedType) type), annotationArr3);
                                            a6kVar2 = new a6k(0, new c6k(value2, encoded, 1));
                                        } else if (I.isArray()) {
                                            vaoVar2.e(w0o.a(I.getComponentType()), annotationArr3);
                                            a6kVar2 = new a6k(1, new c6k(value2, encoded, 1));
                                        } else {
                                            vaoVar2.e(type, annotationArr3);
                                            p1gVar2 = new c6k(value2, encoded, 1);
                                            str = str2;
                                        }
                                        p1gVar2 = a6kVar2;
                                        str = str2;
                                    } else {
                                        p1gVarArr = p1gVarArr2;
                                        i4 = i10;
                                        if (annotation instanceof u6n) {
                                            w0oVar.c(i9, type);
                                            boolean encoded2 = ((u6n) annotation).encoded();
                                            Class I2 = jf0.I(type);
                                            w0oVar.k = true;
                                            if (Iterable.class.isAssignableFrom(I2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw jf0.R(method, i9, I2.getSimpleName() + " must include generic type (e.g., " + I2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                vaoVar2.e(jf0.H(0, (ParameterizedType) type), annotationArr3);
                                                a6kVar2 = new a6k(0, new i6k(encoded2));
                                            } else if (I2.isArray()) {
                                                vaoVar2.e(w0o.a(I2.getComponentType()), annotationArr3);
                                                a6kVar2 = new a6k(1, new i6k(encoded2));
                                            } else {
                                                vaoVar2.e(type, annotationArr3);
                                                p1gVar2 = new i6k(encoded2);
                                            }
                                            p1gVar2 = a6kVar2;
                                        } else if (annotation instanceof t6n) {
                                            w0oVar.c(i9, type);
                                            Class I3 = jf0.I(type);
                                            w0oVar.l = true;
                                            if (!Map.class.isAssignableFrom(I3)) {
                                                throw jf0.R(method, i9, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type J = jf0.J(type, I3);
                                            if (!(J instanceof ParameterizedType)) {
                                                throw jf0.R(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) J;
                                            Type H = jf0.H(0, parameterizedType);
                                            if (String.class != H) {
                                                throw jf0.R(method, i9, "@QueryMap keys must be of type String: " + H, new Object[0]);
                                            }
                                            vaoVar2.e(jf0.H(1, parameterizedType), annotationArr3);
                                            p1gVar2 = new d6k(method, i9, ((t6n) annotation).encoded(), 1);
                                        } else {
                                            str = str2;
                                            if (annotation instanceof xtd) {
                                                w0oVar.c(i9, type);
                                                String value3 = ((xtd) annotation).value();
                                                Class I4 = jf0.I(type);
                                                if (Iterable.class.isAssignableFrom(I4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw jf0.R(method, i9, I4.getSimpleName() + " must include generic type (e.g., " + I4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    vaoVar2.e(jf0.H(0, (ParameterizedType) type), annotationArr3);
                                                    g6kVar = new a6k(0, new e6k(value3));
                                                } else if (I4.isArray()) {
                                                    vaoVar2.e(w0o.a(I4.getComponentType()), annotationArr3);
                                                    g6kVar = new a6k(1, new e6k(value3));
                                                } else {
                                                    vaoVar2.e(type, annotationArr3);
                                                    p1gVar2 = new e6k(value3);
                                                }
                                                p1gVar2 = g6kVar;
                                            } else if (annotation instanceof rvd) {
                                                if (type == zvd.class) {
                                                    p1gVar2 = new f6k(method, i9, 1);
                                                } else {
                                                    w0oVar.c(i9, type);
                                                    Class I5 = jf0.I(type);
                                                    if (!Map.class.isAssignableFrom(I5)) {
                                                        throw jf0.R(method, i9, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type J2 = jf0.J(type, I5);
                                                    if (!(J2 instanceof ParameterizedType)) {
                                                        throw jf0.R(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) J2;
                                                    Type H2 = jf0.H(0, parameterizedType2);
                                                    if (String.class != H2) {
                                                        throw jf0.R(method, i9, "@HeaderMap keys must be of type String: " + H2, new Object[0]);
                                                    }
                                                    vaoVar2.e(jf0.H(1, parameterizedType2), annotationArr3);
                                                    p1gVar2 = new f6k(method, i9, 0);
                                                }
                                            } else if (annotation instanceof b9c) {
                                                w0oVar.c(i9, type);
                                                if (!w0oVar.p) {
                                                    throw jf0.R(method, i9, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                b9c b9cVar = (b9c) annotation;
                                                String value4 = b9cVar.value();
                                                boolean encoded3 = b9cVar.encoded();
                                                w0oVar.f = true;
                                                Class I6 = jf0.I(type);
                                                if (Iterable.class.isAssignableFrom(I6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw jf0.R(method, i9, I6.getSimpleName() + " must include generic type (e.g., " + I6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    vaoVar2.e(jf0.H(0, (ParameterizedType) type), annotationArr3);
                                                    g6kVar = new a6k(0, new c6k(value4, encoded3, 0));
                                                } else if (I6.isArray()) {
                                                    vaoVar2.e(w0o.a(I6.getComponentType()), annotationArr3);
                                                    g6kVar = new a6k(1, new c6k(value4, encoded3, 0));
                                                } else {
                                                    vaoVar2.e(type, annotationArr3);
                                                    p1gVar2 = new c6k(value4, encoded3, 0);
                                                }
                                                p1gVar2 = g6kVar;
                                            } else if (annotation instanceof e9c) {
                                                w0oVar.c(i9, type);
                                                if (!w0oVar.p) {
                                                    throw jf0.R(method, i9, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class I7 = jf0.I(type);
                                                if (!Map.class.isAssignableFrom(I7)) {
                                                    throw jf0.R(method, i9, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type J3 = jf0.J(type, I7);
                                                if (!(J3 instanceof ParameterizedType)) {
                                                    throw jf0.R(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) J3;
                                                Type H3 = jf0.H(0, parameterizedType3);
                                                if (String.class != H3) {
                                                    throw jf0.R(method, i9, "@FieldMap keys must be of type String: " + H3, new Object[0]);
                                                }
                                                vaoVar2.e(jf0.H(1, parameterizedType3), annotationArr3);
                                                w0oVar.f = true;
                                                p1gVar2 = new d6k(method, i9, ((e9c) annotation).encoded(), 0);
                                            } else if (annotation instanceof i8k) {
                                                w0oVar.c(i9, type);
                                                if (!w0oVar.q) {
                                                    throw jf0.R(method, i9, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                i8k i8kVar = (i8k) annotation;
                                                w0oVar.g = true;
                                                String value5 = i8kVar.value();
                                                Class I8 = jf0.I(type);
                                                if (value5.isEmpty()) {
                                                    boolean isAssignableFrom = Iterable.class.isAssignableFrom(I8);
                                                    j6k j6kVar = j6k.a;
                                                    if (isAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw jf0.R(method, i9, I8.getSimpleName() + " must include generic type (e.g., " + I8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!ahi.class.isAssignableFrom(jf0.I(jf0.H(0, (ParameterizedType) type)))) {
                                                            throw jf0.R(method, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        p1gVar2 = new a6k(0, j6kVar);
                                                    } else if (I8.isArray()) {
                                                        if (!ahi.class.isAssignableFrom(I8.getComponentType())) {
                                                            throw jf0.R(method, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        p1gVar2 = new a6k(1, j6kVar);
                                                    } else {
                                                        if (!ahi.class.isAssignableFrom(I8)) {
                                                            throw jf0.R(method, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        p1gVar2 = j6kVar;
                                                    }
                                                } else {
                                                    zvd g0 = qwp.g0("Content-Disposition", hrg.q("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", i8kVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(I8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw jf0.R(method, i9, I8.getSimpleName() + " must include generic type (e.g., " + I8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type H4 = jf0.H(0, (ParameterizedType) type);
                                                        if (ahi.class.isAssignableFrom(jf0.I(H4))) {
                                                            throw jf0.R(method, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        a6kVar = new a6k(0, new g6k(method, i9, g0, vaoVar2.c(H4, annotationArr3, annotationArr)));
                                                    } else if (I8.isArray()) {
                                                        Class a = w0o.a(I8.getComponentType());
                                                        if (ahi.class.isAssignableFrom(a)) {
                                                            throw jf0.R(method, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        a6kVar = new a6k(1, new g6k(method, i9, g0, vaoVar2.c(a, annotationArr3, annotationArr)));
                                                    } else {
                                                        if (ahi.class.isAssignableFrom(I8)) {
                                                            throw jf0.R(method, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        g6kVar = new g6k(method, i9, g0, vaoVar2.c(type, annotationArr3, annotationArr));
                                                        p1gVar2 = g6kVar;
                                                    }
                                                    p1gVar2 = a6kVar;
                                                }
                                            } else if (annotation instanceof j8k) {
                                                w0oVar.c(i9, type);
                                                if (!w0oVar.q) {
                                                    throw jf0.R(method, i9, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                w0oVar.g = true;
                                                Class I9 = jf0.I(type);
                                                if (!Map.class.isAssignableFrom(I9)) {
                                                    throw jf0.R(method, i9, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type J4 = jf0.J(type, I9);
                                                if (!(J4 instanceof ParameterizedType)) {
                                                    throw jf0.R(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) J4;
                                                Type H5 = jf0.H(0, parameterizedType4);
                                                if (String.class != H5) {
                                                    throw jf0.R(method, i9, "@PartMap keys must be of type String: " + H5, new Object[0]);
                                                }
                                                Type H6 = jf0.H(1, parameterizedType4);
                                                if (ahi.class.isAssignableFrom(jf0.I(H6))) {
                                                    throw jf0.R(method, i9, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                p1gVar2 = new g6k(method, i9, vaoVar2.c(H6, annotationArr3, annotationArr), ((j8k) annotation).encoding());
                                            } else if (annotation instanceof k83) {
                                                w0oVar.c(i9, type);
                                                if (w0oVar.p || w0oVar.q) {
                                                    throw jf0.R(method, i9, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (w0oVar.h) {
                                                    throw jf0.R(method, i9, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    vj6 c = vaoVar2.c(type, annotationArr3, annotationArr);
                                                    w0oVar.h = true;
                                                    p1gVar2 = new b6k(method, i9, c);
                                                } catch (RuntimeException e) {
                                                    throw jf0.S(method, e, i9, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof c3s) {
                                                w0oVar.c(i9, type);
                                                Class I10 = jf0.I(type);
                                                for (int i12 = i9 - 1; i12 >= 0; i12--) {
                                                    p1g p1gVar3 = w0oVar.v[i12];
                                                    if ((p1gVar3 instanceof k6k) && ((k6k) p1gVar3).a.equals(I10)) {
                                                        throw jf0.R(method, i9, "@Tag type " + I10.getName() + " is duplicate of parameter #" + (i12 + 1) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                p1gVar2 = new k6k(I10);
                                            } else {
                                                p1gVar2 = null;
                                            }
                                        }
                                        str = str2;
                                    }
                                    if (p1gVar2 != null) {
                                        if (p1gVar != null) {
                                            throw jf0.R(method, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        p1gVar = p1gVar2;
                                    }
                                    i5 = i11 + 1;
                                    annotationArr2 = annotationArr4;
                                    length2 = i;
                                    p1gVarArr2 = p1gVarArr;
                                    length3 = i2;
                                    i8 = i3;
                                    i10 = i4;
                                    str2 = str;
                                }
                            }
                            str = str2;
                            i2 = length3;
                            i3 = i8;
                            p1gVarArr = p1gVarArr2;
                            i4 = i10;
                            if (p1gVar2 != null) {
                            }
                            i5 = i11 + 1;
                            annotationArr2 = annotationArr4;
                            length2 = i;
                            p1gVarArr2 = p1gVarArr;
                            length3 = i2;
                            i8 = i3;
                            i10 = i4;
                            str2 = str;
                        }
                    } else {
                        p1gVar = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str3 = str2;
                    int i14 = i8;
                    p1g[] p1gVarArr3 = p1gVarArr2;
                    int i15 = i10;
                    if (p1gVar == null) {
                        if (i15 != 0) {
                            try {
                                if (jf0.I(type) == Continuation.class) {
                                    w0oVar.w = true;
                                    p1gVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw jf0.R(method, i9, "No Retrofit annotation found.", new Object[0]);
                    }
                    p1gVarArr3[i9] = p1gVar;
                    i9++;
                    annotationArr2 = annotationArr5;
                    length2 = i13;
                    i8 = i14;
                    str2 = str3;
                    i5 = 0;
                    i7 = 1;
                }
                String str4 = str2;
                if (w0oVar.r == null && !w0oVar.m) {
                    throw jf0.P(method, null, "Missing either @%s URL or @Url parameter.", w0oVar.n);
                }
                boolean z3 = w0oVar.p;
                if (!z3 && !w0oVar.q && !w0oVar.o && w0oVar.h) {
                    throw jf0.P(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z3 && !w0oVar.f) {
                    throw jf0.P(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (w0oVar.q && !w0oVar.g) {
                    throw jf0.P(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                x0o x0oVar = new x0o(w0oVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (jf0.K(genericReturnType2)) {
                    throw jf0.P(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw jf0.P(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z4 = x0oVar.k;
                if (z4) {
                    Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[r5.length - 1]).getActualTypeArguments()[0];
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                    }
                    if (jf0.I(type2) == Response.class && (type2 instanceof ParameterizedType)) {
                        type2 = jf0.H(0, (ParameterizedType) type2);
                        z = true;
                    } else {
                        z = false;
                    }
                    genericReturnType = new kvt(null, Call.class, type2);
                    if (!jf0.M(annotations, zqq.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = arq.a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                }
                try {
                    gs3 a2 = vaoVar.a(genericReturnType, annotations);
                    Type s = a2.s();
                    if (s == l3o.class) {
                        throw jf0.P(method, null, "'" + jf0.I(s).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (s == Response.class) {
                        throw jf0.P(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (x0oVar.c.equals(str4) && !Void.class.equals(s)) {
                        throw jf0.P(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        vj6 d = vaoVar.d(s, method.getAnnotations());
                        ds3 ds3Var = vaoVar.b;
                        return !z4 ? new j7e(x0oVar, ds3Var, d, a2, 0) : z ? new j7e(x0oVar, ds3Var, d, a2, 2) : new j7e(x0oVar, ds3Var, d, a2, 1);
                    } catch (RuntimeException e2) {
                        throw jf0.P(method, e2, "Unable to create converter for %s", s);
                    }
                } catch (RuntimeException e3) {
                    throw jf0.P(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof qz6) {
                w0oVar.b(ServiceCommand.TYPE_DEL, ((qz6) annotation2).value(), false);
            } else if (annotation2 instanceof lzc) {
                w0oVar.b(ServiceCommand.TYPE_GET, ((lzc) annotation2).value(), false);
            } else if (annotation2 instanceof urd) {
                w0oVar.b("HEAD", ((urd) annotation2).value(), false);
            } else if (annotation2 instanceof xzj) {
                w0oVar.b("PATCH", ((xzj) annotation2).value(), true);
            } else if (annotation2 instanceof a0k) {
                w0oVar.b(ServiceCommand.TYPE_POST, ((a0k) annotation2).value(), true);
            } else if (annotation2 instanceof b0k) {
                w0oVar.b(ServiceCommand.TYPE_PUT, ((b0k) annotation2).value(), true);
            } else if (annotation2 instanceof phj) {
                w0oVar.b("OPTIONS", ((phj) annotation2).value(), false);
            } else if (annotation2 instanceof wrd) {
                wrd wrdVar = (wrd) annotation2;
                w0oVar.b(wrdVar.method(), wrdVar.path(), wrdVar.hasBody());
            } else if (annotation2 instanceof awd) {
                String[] value6 = ((awd) annotation2).value();
                if (value6.length == 0) {
                    throw jf0.P(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                ArrayList arrayList = new ArrayList(20);
                int length4 = value6.length;
                for (int i16 = 0; i16 < length4; i16++) {
                    String str5 = value6[i16];
                    int indexOf = str5.indexOf(58);
                    if (indexOf == -1 || indexOf == 0 || indexOf == str5.length() - 1) {
                        break loop0;
                    }
                    String substring = str5.substring(0, indexOf);
                    String trim = str5.substring(indexOf + 1).trim();
                    if (HttpMessage.CONTENT_TYPE_HEADER.equalsIgnoreCase(substring)) {
                        try {
                            Pattern pattern = twh.e;
                            w0oVar.t = q5g.C(trim);
                        } catch (IllegalArgumentException e4) {
                            throw jf0.P(method, e4, "Malformed content type: %s", trim);
                        }
                    } else {
                        trim.getClass();
                        qwp.D(substring);
                        qwp.G(trim, substring);
                        arrayList.add(substring);
                        arrayList.add(StringsKt.t0(trim).toString());
                    }
                }
                w0oVar.s = new zvd((String[]) arrayList.toArray(new String[0]));
            } else if (annotation2 instanceof zgi) {
                if (w0oVar.p) {
                    throw jf0.P(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                w0oVar.q = true;
            } else if (!(annotation2 instanceof asc)) {
                continue;
            } else {
                if (w0oVar.q) {
                    throw jf0.P(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                w0oVar.p = true;
            }
            i6++;
        }
    }
}
