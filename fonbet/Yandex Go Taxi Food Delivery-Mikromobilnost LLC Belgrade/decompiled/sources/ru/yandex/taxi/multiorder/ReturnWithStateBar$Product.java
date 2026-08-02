package ru.yandex.taxi.multiorder;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/multiorder/ReturnWithStateBar$Product", "", "Lru/yandex/taxi/multiorder/ReturnWithStateBar$Product;", "TAXI", "LOGISTICS", "DRIVE", "EATS", "LINKED", "SCOOTERS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ReturnWithStateBar$Product {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReturnWithStateBar$Product[] $VALUES;
    public static final ReturnWithStateBar$Product DRIVE;
    public static final ReturnWithStateBar$Product EATS;
    public static final ReturnWithStateBar$Product LINKED;
    public static final ReturnWithStateBar$Product LOGISTICS;
    public static final ReturnWithStateBar$Product SCOOTERS;
    public static final ReturnWithStateBar$Product TAXI;

    static {
        ReturnWithStateBar$Product returnWithStateBar$Product = new ReturnWithStateBar$Product("TAXI", 0);
        TAXI = returnWithStateBar$Product;
        ReturnWithStateBar$Product returnWithStateBar$Product2 = new ReturnWithStateBar$Product("LOGISTICS", 1);
        LOGISTICS = returnWithStateBar$Product2;
        ReturnWithStateBar$Product returnWithStateBar$Product3 = new ReturnWithStateBar$Product("DRIVE", 2);
        DRIVE = returnWithStateBar$Product3;
        ReturnWithStateBar$Product returnWithStateBar$Product4 = new ReturnWithStateBar$Product("EATS", 3);
        EATS = returnWithStateBar$Product4;
        ReturnWithStateBar$Product returnWithStateBar$Product5 = new ReturnWithStateBar$Product("LINKED", 4);
        LINKED = returnWithStateBar$Product5;
        ReturnWithStateBar$Product returnWithStateBar$Product6 = new ReturnWithStateBar$Product("SCOOTERS", 5);
        SCOOTERS = returnWithStateBar$Product6;
        ReturnWithStateBar$Product[] returnWithStateBar$ProductArr = {returnWithStateBar$Product, returnWithStateBar$Product2, returnWithStateBar$Product3, returnWithStateBar$Product4, returnWithStateBar$Product5, returnWithStateBar$Product6};
        $VALUES = returnWithStateBar$ProductArr;
        $ENTRIES = kotlin.enums.a.a(returnWithStateBar$ProductArr);
    }

    public static ReturnWithStateBar$Product valueOf(String str) {
        return (ReturnWithStateBar$Product) Enum.valueOf(ReturnWithStateBar$Product.class, str);
    }

    public static ReturnWithStateBar$Product[] values() {
        return (ReturnWithStateBar$Product[]) $VALUES.clone();
    }
}
