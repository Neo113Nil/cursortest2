package defpackage;

/* loaded from: classes.dex */
public abstract class ce0 {
    public static final java.util.HashMap IHQe1A4L2xu = new java.util.HashMap();
    public static final java.util.HashMap oh6vYeIP = new java.util.HashMap();

    public static void IHQe1A4L2xu(java.lang.reflect.Constructor constructor, defpackage.td0 td0Var) {
        try {
            constructor.newInstance(td0Var).getClass();
            throw new java.lang.ClassCastException();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    public static int oh6vYeIP(java.lang.Class cls) {
        java.lang.reflect.Constructor<?> constructor;
        boolean z;
        java.util.HashMap hashMap = IHQe1A4L2xu;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            java.util.ArrayList arrayList = null;
            try {
                java.lang.Package r4 = cls.getPackage();
                java.lang.String canonicalName = cls.getCanonicalName();
                java.lang.String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                java.lang.String concat = defpackage.yc1.EoOhNTTfIN7K(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + "." + concat;
                }
                constructor = java.lang.Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                constructor = null;
            } catch (java.lang.NoSuchMethodException e) {
                throw new java.lang.RuntimeException(e);
            }
            java.util.HashMap hashMap2 = oh6vYeIP;
            if (constructor != null) {
                hashMap2.put(cls, defpackage.fm.p4kuH6PDtgom(constructor));
            } else {
                defpackage.ad adVar = defpackage.ad.r1MBDhnF;
                java.util.HashMap hashMap3 = adVar.oh6vYeIP;
                java.lang.Boolean bool = (java.lang.Boolean) hashMap3.get(cls);
                int i2 = 0;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                hashMap3.put(cls, java.lang.Boolean.FALSE);
                                z = false;
                                break;
                            }
                            if (((defpackage.wq0) declaredMethods[i3].getAnnotation(defpackage.wq0.class)) != null) {
                                adVar.IHQe1A4L2xu(cls, declaredMethods);
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (java.lang.NoClassDefFoundError e2) {
                        throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    java.lang.Class superclass = cls.getSuperclass();
                    if (superclass != null && defpackage.td0.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (oh6vYeIP(superclass) != 1) {
                            java.lang.Object obj = hashMap2.get(superclass);
                            obj.getClass();
                            arrayList = new java.util.ArrayList((java.util.Collection) obj);
                        }
                    }
                    java.lang.Class<?>[] interfaces = cls.getInterfaces();
                    interfaces.getClass();
                    int length2 = interfaces.length;
                    while (true) {
                        if (i2 < length2) {
                            java.lang.Class<?> cls2 = interfaces[i2];
                            if (cls2 != null && defpackage.td0.class.isAssignableFrom(cls2)) {
                                cls2.getClass();
                                if (oh6vYeIP(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                java.lang.Object obj2 = hashMap2.get(cls2);
                                obj2.getClass();
                                arrayList.addAll((java.util.Collection) obj2);
                            }
                            i2++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, java.lang.Integer.valueOf(i));
        return i;
    }
}
