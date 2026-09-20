# Проверка подозрительных доменов

Кастомных/неизвестных хостов в first-party коде, манифесте, строках и нативных библиотеках нет.

`config.ru` / `config.lt` — имена языковых split в `res/xml/splits0.xml`, не сетевые адреса.
В XAPK 1.2 есть только `config.en` и `config.fr` из языковых сплитов; `config.ru` в поставке нет.

Строки `https://github.com/flutter/flutter/issues/30701`, `https://pub.dev/`, `https://api.flutter.dev/` — документация Flutter/Dart SDK в `libapp.so` / `libflutter.so`, не first-party gate.

Второй таблицы «Проверка домена» нет: подозрительных доменов в основной таблице нет.
