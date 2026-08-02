package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class o3d extends c8 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, o3d> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected lkt unknownFields;

    public o3d() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = lkt.f;
    }

    public static m3d access$100(s0c s0cVar) {
        s0cVar.getClass();
        return (m3d) s0cVar;
    }

    public static void b(o3d o3dVar) {
        if (o3dVar != null && !o3dVar.isInitialized()) {
            throw new bye(o3dVar.newUninitializedMessageException().getMessage());
        }
    }

    public static final boolean c(o3d o3dVar, boolean z) {
        byte byteValue = ((Byte) o3dVar.dynamicMethod(n3d.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        yym yymVar = yym.c;
        yymVar.getClass();
        boolean b = yymVar.a(o3dVar.getClass()).b(o3dVar);
        if (z) {
            o3dVar.dynamicMethod(n3d.b, b ? o3dVar : null, null);
        }
        return b;
    }

    public static o3d d(o3d o3dVar, InputStream inputStream, z0c z0cVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            qr4 g = qr4.g(new b8(qr4.s(read, inputStream), inputStream));
            o3d parsePartialFrom = parsePartialFrom(o3dVar, g, z0cVar);
            g.a(0);
            return parsePartialFrom;
        } catch (bye e) {
            if (e.a) {
                throw new bye(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new bye(e2.getMessage(), e2);
        }
    }

    public static o3d e(o3d o3dVar, byte[] bArr, int i, int i2, z0c z0cVar) {
        if (i2 == 0) {
            return o3dVar;
        }
        o3d newMutableInstance = o3dVar.newMutableInstance();
        try {
            yym yymVar = yym.c;
            yymVar.getClass();
            wto a = yymVar.a(newMutableInstance.getClass());
            vx0 vx0Var = new vx0();
            z0cVar.getClass();
            a.i(newMutableInstance, bArr, i, i + i2, vx0Var);
            a.a(newMutableInstance);
            return newMutableInstance;
        } catch (bye e) {
            if (e.a) {
                throw new bye(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bye) {
                throw ((bye) e2.getCause());
            }
            throw new bye(e2.getMessage(), e2);
        } catch (IndexOutOfBoundsException unused) {
            throw bye.h();
        } catch (qit e3) {
            throw new bye(e3.getMessage());
        }
    }

    public static ese emptyBooleanList() {
        return fc3.e;
    }

    public static fse emptyDoubleList() {
        return o8a.e;
    }

    public static lse emptyFloatList() {
        return tic.e;
    }

    public static mse emptyIntList() {
        return ipe.e;
    }

    public static pse emptyLongList() {
        return qug.e;
    }

    public static <E> rse emptyProtobufList() {
        return bzm.e;
    }

    public static <T extends o3d> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                b6e.o("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((o3d) dmt.b(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        e7o.n();
        return null;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            kac.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            kac.k("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static mse mutableCopy(mse mseVar) {
        return ((ipe) mseVar).b(mseVar.size() * 2);
    }

    public static Object newMessageInfo(vzh vzhVar, String str, Object[] objArr) {
        return new djn(vzhVar, str, objArr);
    }

    public static <ContainingType extends vzh, Type> m3d newRepeatedGeneratedExtension(ContainingType containingtype, vzh vzhVar, jse jseVar, int i, prv prvVar, boolean z, Class cls) {
        return new m3d(containingtype, bzm.e, vzhVar, new l3d(jseVar, i, prvVar, true, z), cls);
    }

    public static <ContainingType extends vzh, Type> m3d newSingularGeneratedExtension(ContainingType containingtype, Type type, vzh vzhVar, jse jseVar, int i, prv prvVar, Class cls) {
        return new m3d(containingtype, type, vzhVar, new l3d(jseVar, i, prvVar, false, false), cls);
    }

    public static <T extends o3d> T parseDelimitedFrom(T t, InputStream inputStream) throws bye {
        T t2 = (T) d(t, inputStream, z0c.a());
        b(t2);
        return t2;
    }

    public static <T extends o3d> T parseFrom(T t, ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        qr4 f;
        if (byteBuffer.hasArray()) {
            f = qr4.f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && dmt.d) {
            f = new pr4(byteBuffer, false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            f = qr4.f(bArr, 0, remaining, true);
        }
        T t2 = (T) parseFrom(t, f, z0cVar);
        b(t2);
        return t2;
    }

    public static <T extends o3d> T parsePartialFrom(T t, qr4 qr4Var, z0c z0cVar) throws bye {
        T t2 = (T) t.newMutableInstance();
        try {
            yym yymVar = yym.c;
            yymVar.getClass();
            wto a = yymVar.a(t2.getClass());
            n8n n8nVar = qr4Var.d;
            if (n8nVar == null) {
                n8nVar = new n8n(qr4Var);
            }
            a.e(t2, n8nVar, z0cVar);
            a.a(t2);
            return t2;
        } catch (bye e) {
            if (e.a) {
                throw new bye(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bye) {
                throw ((bye) e2.getCause());
            }
            throw new bye(e2.getMessage(), e2);
        } catch (qit e3) {
            throw new bye(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof bye) {
                throw ((bye) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends o3d> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(n3d.c, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        yym yymVar = yym.c;
        yymVar.getClass();
        return yymVar.a(getClass()).h(this);
    }

    public final <MessageType2 extends o3d, BuilderType2 extends g3d> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(n3d.e, null, null);
    }

    public abstract Object dynamicMethod(n3d n3dVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yym yymVar = yym.c;
        yymVar.getClass();
        return yymVar.a(getClass()).g(this, (o3d) obj);
    }

    @Override // defpackage.xzh
    public final o3d getDefaultInstanceForType() {
        return (o3d) dynamicMethod(n3d.f, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // defpackage.vzh
    public final n7k getParserForType() {
        return (n7k) dynamicMethod(n3d.g, null, null);
    }

    @Override // defpackage.c8
    public int getSerializedSize(wto wtoVar) {
        int j;
        int j2;
        if (isMutable()) {
            if (wtoVar == null) {
                yym yymVar = yym.c;
                yymVar.getClass();
                j2 = yymVar.a(getClass()).j(this);
            } else {
                j2 = wtoVar.j(this);
            }
            if (j2 >= 0) {
                return j2;
            }
            xq0.q(k5r.i(j2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (wtoVar == null) {
            yym yymVar2 = yym.c;
            yymVar2.getClass();
            j = yymVar2.a(getClass()).j(this);
        } else {
            j = wtoVar.j(this);
        }
        setMemoizedSerializedSize(j);
        return j;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // defpackage.xzh
    public final boolean isInitialized() {
        return c(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        yym yymVar = yym.c;
        yymVar.getClass();
        yymVar.a(getClass()).a(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, nn3 nn3Var) {
        if (this.unknownFields == lkt.f) {
            this.unknownFields = new lkt();
        }
        lkt lktVar = this.unknownFields;
        lktVar.a();
        if (i != 0) {
            lktVar.f((i << 3) | 2, nn3Var);
        } else {
            xq0.x("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(lkt lktVar) {
        this.unknownFields = lkt.e(this.unknownFields, lktVar);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == lkt.f) {
            this.unknownFields = new lkt();
        }
        lkt lktVar = this.unknownFields;
        lktVar.a();
        if (i != 0) {
            lktVar.f(i << 3, Long.valueOf(i2));
        } else {
            xq0.x("Zero is not a valid field number.");
        }
    }

    @Override // defpackage.vzh
    public final g3d newBuilderForType() {
        return (g3d) dynamicMethod(n3d.e, null, null);
    }

    public o3d newMutableInstance() {
        return (o3d) dynamicMethod(n3d.d, null, null);
    }

    public boolean parseUnknownField(int i, qr4 qr4Var) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == lkt.f) {
            this.unknownFields = new lkt();
        }
        return this.unknownFields.d(i, qr4Var);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            xq0.q(k5r.i(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    /* renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final g3d m30toBuilder() {
        g3d g3dVar = (g3d) dynamicMethod(n3d.e, null, null);
        g3dVar.e(this);
        return g3dVar;
    }

    public String toString() {
        String obj = super.toString();
        char[] cArr = yzh.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        yzh.c(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.vzh
    public void writeTo(yr4 yr4Var) throws IOException {
        yym yymVar = yym.c;
        yymVar.getClass();
        wto a = yymVar.a(getClass());
        rp7 rp7Var = yr4Var.a;
        if (rp7Var == null) {
            rp7Var = new rp7();
            use.a(yr4Var, "output");
            rp7Var.a = yr4Var;
            yr4Var.a = rp7Var;
        }
        a.f(this, rp7Var);
    }

    public final <MessageType2 extends o3d, BuilderType2 extends g3d> BuilderType2 createBuilder(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) createBuilder();
        buildertype2.e(messagetype2);
        return buildertype2;
    }

    public static <T extends o3d> T parseDelimitedFrom(T t, InputStream inputStream, z0c z0cVar) throws bye {
        T t2 = (T) d(t, inputStream, z0cVar);
        b(t2);
        return t2;
    }

    public static pse mutableCopy(pse pseVar) {
        return ((qug) pseVar).b(pseVar.size() * 2);
    }

    public static lse mutableCopy(lse lseVar) {
        return ((tic) lseVar).b(lseVar.size() * 2);
    }

    public static fse mutableCopy(fse fseVar) {
        return ((o8a) fseVar).b(fseVar.size() * 2);
    }

    public static ese mutableCopy(ese eseVar) {
        return ((fc3) eseVar).b(eseVar.size() * 2);
    }

    public static <E> rse mutableCopy(rse rseVar) {
        return rseVar.b(rseVar.size() * 2);
    }

    public static <T extends o3d> T parseFrom(T t, ByteBuffer byteBuffer) throws bye {
        return (T) parseFrom(t, byteBuffer, z0c.a());
    }

    public static <T extends o3d> T parseFrom(T t, nn3 nn3Var) throws bye {
        T t2 = (T) parseFrom(t, nn3Var, z0c.a());
        b(t2);
        return t2;
    }

    public static <T extends o3d> T parseFrom(T t, nn3 nn3Var, z0c z0cVar) throws bye {
        qr4 t2 = nn3Var.t();
        T t3 = (T) parsePartialFrom(t, t2, z0cVar);
        t2.a(0);
        b(t3);
        return t3;
    }

    public static <T extends o3d> T parseFrom(T t, byte[] bArr) throws bye {
        T t2 = (T) e(t, bArr, 0, bArr.length, z0c.a());
        b(t2);
        return t2;
    }

    public static <T extends o3d> T parseFrom(T t, byte[] bArr, z0c z0cVar) throws bye {
        T t2 = (T) e(t, bArr, 0, bArr.length, z0cVar);
        b(t2);
        return t2;
    }

    @Override // defpackage.vzh
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends o3d> T parseFrom(T t, InputStream inputStream) throws bye {
        T t2 = (T) parsePartialFrom(t, qr4.g(inputStream), z0c.a());
        b(t2);
        return t2;
    }

    public static <T extends o3d> T parseFrom(T t, InputStream inputStream, z0c z0cVar) throws bye {
        T t2 = (T) parsePartialFrom(t, qr4.g(inputStream), z0cVar);
        b(t2);
        return t2;
    }

    public static <T extends o3d> T parseFrom(T t, qr4 qr4Var) throws bye {
        return (T) parseFrom(t, qr4Var, z0c.a());
    }

    public static <T extends o3d> T parseFrom(T t, qr4 qr4Var, z0c z0cVar) throws bye {
        T t2 = (T) parsePartialFrom(t, qr4Var, z0cVar);
        b(t2);
        return t2;
    }

    public static <T extends o3d> T parsePartialFrom(T t, qr4 qr4Var) throws bye {
        return (T) parsePartialFrom(t, qr4Var, z0c.a());
    }
}
