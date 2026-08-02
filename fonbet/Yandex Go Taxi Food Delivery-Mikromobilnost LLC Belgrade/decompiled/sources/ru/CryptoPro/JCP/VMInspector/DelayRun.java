package ru.CryptoPro.JCP.VMInspector;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class DelayRun {
    public static void main(String[] strArr) throws Exception {
        String str;
        if (strArr != null && strArr.length != 0 && (str = strArr[0]) != null) {
            try {
                Method method = Class.forName(str).getMethod("main", String[].class);
                Object[] objArr = {null};
                System.out.getClass();
                System.in.read();
                try {
                    method.invoke(null, objArr);
                } catch (Exception e) {
                    System.out.getClass();
                    throw e;
                }
            } catch (Exception e2) {
                System.out.getClass();
                throw e2;
            }
        }
        System.out.getClass();
    }
}
